/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dinhson.quizsystem.main.java.mapper;

import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public interface RowMapper<T> {
    T MapRow(ResultSet rs);
}
