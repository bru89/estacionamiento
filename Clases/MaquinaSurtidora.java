/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.SpinnerNumberModel;

/**
 *
 * @author PC
 */
public class MaquinaSurtidora {
    
    //Atributos de la Clase
    private String tipocombustible;
    private int capacidadTanque;
    private double precioVenta;
    private int cantidadVendida;
    private double montoVendido;
    private int disponibilidadTanque;
    private int cantidadVentas;
    private double MontoAcumulado;
    private int litrosAcumulados;
    
   
    //Métodos Constructores
    public MaquinaSurtidora(){
             
    }
    
    //Métodos Constructor Sobrecargado
    public MaquinaSurtidora(String tipocombustible, int capacidadTanque, double precioVenta) {
        this.tipocombustible = tipocombustible;
        this.capacidadTanque = capacidadTanque;
        this.disponibilidadTanque = capacidadTanque;
        this.precioVenta = precioVenta;
        
    }
    
    //Getters / Setters

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public int getDisponibilidadTanque() {
        return disponibilidadTanque;
    }

    public void setDisponibilidadTanque(int disponibilidadTanque) {
        this.disponibilidadTanque = disponibilidadTanque;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getMontoAcumulado() {
        return MontoAcumulado;
    }

    public void setMontoAcumulado(double MontoAcumulado) {
        this.MontoAcumulado = MontoAcumulado;
    }

    public int getLitrosAcumulados() {
        return litrosAcumulados;
    }

    public void setLitrosAcumulados(int litrosAcumulados) {
        this.litrosAcumulados = litrosAcumulados;
    }

    //Métodos de Acción
    public void registrarVenta (int litrosSurtidos){
         this.montoVendido = litrosSurtidos * this.precioVenta;
        //this.cantidadVendida += litros;
         this.disponibilidadTanque -= litrosSurtidos; 
         this.MontoAcumulado += this.montoVendido;
         this.litrosAcumulados += litrosSurtidos;
         this.cantidadVentas++ ;
    }
  
    public void reiniciar(){
            this.disponibilidadTanque = 0;
            this.precioVenta = 0;
   
}
    
     
}
