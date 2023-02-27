/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gib
 */
public class SubType {
    private int idSub;
    private int idCate;

    public SubType() {
    }

    public SubType(int idSub, int idCate) {
        this.idSub = idSub;
        this.idCate = idCate;
    }

    public int getIdSub() {
        return idSub;
    }

    public void setIdSub(int idSub) {
        this.idSub = idSub;
    }

    public int getIdCate() {
        return idCate;
    }

    public void setIdCate(int idCate) {
        this.idCate = idCate;
    }
    
    
}
