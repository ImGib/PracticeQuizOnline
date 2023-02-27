/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import mapper.RowMapper;
import java.util.List;

/**
 *
 * @author admin
 */
public interface GenericDao<T> {

    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);

    void update(String sql, Object... parameters);

    int insert(String sql, Object... parameters);
    
    int count(String sql, Object... parameters);
}
