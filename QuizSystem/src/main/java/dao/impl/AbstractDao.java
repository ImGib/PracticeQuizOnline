/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.GenericDao;
import mapper.RowMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class AbstractDao<T> implements GenericDao<T> {

    private final String serverName = "localhost";
    private final String dbName = "Quiz System";
    private final String portNumber = "5102";
    private final String userID = "sa";
    private final String password = "giabao5102";

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber
                + ";databaseName=" + dbName;//+"; integratedSecurity=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        List<T> list = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            setParameter(ps, parameters);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rowMapper.MapRow(rs));
            }
            return list;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                return null;
            }
        }
    }

    private void setParameter(PreparedStatement ps, Object... parameters) {
        try {
            for (int i = 0; i < parameters.length; i++) {
                Object parameter = parameters[i];
                int index = i + 1;
                if (parameter instanceof Integer) {
                    ps.setInt(index, (int) parameter);
                } else if (parameter instanceof String) {
                    ps.setString(index, (String) parameter);
                } else if (parameter instanceof Double) {
                    ps.setDouble(index, (double) parameter);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String sql, Object... parameters) {
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            setParameter(ps, parameters);
            ps.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int insert(String sql, Object... parameters) {
        int id = 0;
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            setParameter(ps, parameters);
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            conn.commit();
            return id;
        } catch (Exception e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException exx) {
                System.out.println(exx.getMessage());
            }
        }
        return -1;
    }

    @Override
    public int count(String sql, Object... parameters) {
        int num = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            setParameter(ps, parameters);
            rs = ps.executeQuery();
            while (rs.next()) {
                num = rs.getInt(1);
            }
            conn.commit();
        } catch (Exception ex) {
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException exx) {
                System.out.println(exx.getMessage());
            }
        }
        return num;
    }

}
