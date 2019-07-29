/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author edwin
 */
public class FacturaDetalle {
    private int id ;
    private String cantdad;
    private String descripcion;
    private String valorUni;
    private String valorTotal;

    public FacturaDetalle(int id, String cantdad, String descripcion, String valorUni, String valorTotal) {
        this.id = id;
        this.cantdad = cantdad;
        this.descripcion = descripcion;
        this.valorUni = valorUni;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantdad() {
        return cantdad;
    }

    public void setCantdad(String cantdad) {
        this.cantdad = cantdad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorUni() {
        return valorUni;
    }

    public void setValorUni(String valorUni) {
        this.valorUni = valorUni;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "id=" + id + ", cantdad=" + cantdad + ", descripcion=" + descripcion + ", valorUni=" + valorUni + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
