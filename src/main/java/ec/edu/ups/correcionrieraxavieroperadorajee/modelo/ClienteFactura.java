/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.correcionrieraxavieroperadorajee.modelo;

/**
 *
 * @author xavier
 */
public class ClienteFactura {
     private String cedula;

	    private String nombre;
	    private String numeroCeular;
	    private double saldo;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCeular() {
        return numeroCeular;
    }

    public void setNumeroCeular(String numeroCeular) {
        this.numeroCeular = numeroCeular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
            
            
}
