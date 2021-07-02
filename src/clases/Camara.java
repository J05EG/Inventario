/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author PC
 */
public class Camara implements interfaz.IValidacionCam{
    private String codigo;
    private String modelo;
    private int giro;
    private float megapixeles;
    private float metrosAlcanceWifi;
    private float valor;

    public Camara() {
    }

    public Camara(String codigo, String modelo, int giro, float megapixeles, float metrosAlcanceWifi, float valor) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.giro = giro;
        this.megapixeles = megapixeles;
        this.metrosAlcanceWifi = metrosAlcanceWifi;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public float getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(float megapixeles) {
        this.megapixeles = megapixeles;
    }

    public float getMetrosAlcanceWifi() {
        return metrosAlcanceWifi;
    }

    public void setMetrosAlcanceWifi(float metrosAlcanceWifi) {
        this.metrosAlcanceWifi = metrosAlcanceWifi;
    }

    @Override
    public boolean ValidarCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidarModelo(String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidarGiro(int giro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidarMegapixeles(float megapixeles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidarMetrosAlcanceWifi(float alcance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ValidarValor(float valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printCamara(){
        System.out.println("\n--Información de la Camara--");
        System.out.println("Código                  : " + getCodigo());
        System.out.println("Modelo                  : " + getModelo());
        System.out.println("Giro                    : " + getGiro());
        System.out.println("Megapixeles             : " + getMegapixeles());
        System.out.println("Metros alcance Wifi     : " + getMetrosAlcanceWifi());
        System.out.println("Valor (US)              : " + getValor()+"\n\n");
    }
}
