/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        boolean sigue = true;
        if(ValidarValor(valor)){
            this.valor = valor;
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca un valor valido");
                valor = Float.parseFloat(sc.nextLine());
                if(ValidarValor(valor)){
                    this.valor = valor;
                    sigue = false;
                }
            }
        }
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
        boolean sigue = true;
        if(ValidarModelo(modelo.trim())){
            this.modelo = modelo.trim();
        }else{
            while(sigue){
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca un modelo valido");
                modelo = sc.nextLine();
                if(ValidarModelo(modelo.trim())){
                    this.modelo = modelo.trim();
                    sigue = false;
                }
            }
        }
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
        String palabra1 = null;
        String palabra2 = null;
        try{
            String[] palabras = modelo.split(" ");
            palabra1 = palabras[0];
            palabra2 = palabras[1];
            if(palabra1.equalsIgnoreCase("interior") || palabra1.equalsIgnoreCase("exterior")) {
                if(!palabra2.matches("[^hHfFwW].[a-zA-Z]{1,7}")){
                    return true;
                }else{
                    System.out.println("La segunda palabra no debe incluir los caracteres H, W, F, h, w, f (Max 7 caracteres)");
                    return false;
                }
            }else{
                System.out.println("La primer palabra debe ser INTERIOR o EXTERIOR");
                return false;
            }
        }catch(Exception e){
            System.out.println("Favor ingresar 2 palabras. Error: "+e.getMessage());
            return  false;
        }
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
        if(valor > 100){
            return true;
        }else{
            System.out.println("El valor debe ser un número positivo mayor a 100 dolares");
            return false;
        }
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
