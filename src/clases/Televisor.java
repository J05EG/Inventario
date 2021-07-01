/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Televisor implements interfaz.IValidacionTv{
    private String marca;
    private String modelo;
    private int pulgadas;
    private char smartTv;
    private String nombreEmpresaCable;
    private float valor;

    public Televisor() {
    }

    public Televisor(String marca, String modelo, int pulgadas, char smartTv, String nombreEmpresaCable, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.smartTv = smartTv;
        this.nombreEmpresaCable = nombreEmpresaCable;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        do{
            if(ValidarValor(valor)){
                this.valor = valor;
            }else{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca un valor valido");
                valor = sc.nextFloat();
                if(ValidarValor(valor))
                this.valor = valor;
            }
        }while(!ValidarValor(valor));  
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        do{
            if(ValidarMarca(marca)){
                this.marca = marca;
            }else{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduzca una marca valida");
                marca = sc.nextLine();
                if(ValidarMarca(marca))
                this.marca = marca;
            }
        }while(!ValidarMarca(marca)); 
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public char getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(char smartTv) {
        this.smartTv = smartTv;
    }

    public String getNombreEmpresaCable() {
        return nombreEmpresaCable;
    }

    public void setNombreEmpresaCable(String nombreEmpresaCable) {
        this.nombreEmpresaCable = nombreEmpresaCable;
    }
    
    public boolean ValidarMarca(String marca){
        return marca.matches("[A-Z]{4,5}");
    }
    public boolean ValidarModelo(String modelo){
        return true;
    }
    public boolean ValidarPulgadas(int pulgadas){
        return true;
    }
    public boolean ValidarSmartTv(char smartTv){
        return true;
    }
    public boolean ValidarNombreEmpresaCable(String nEmpCable){
        return true;
    }
    public boolean ValidarValor(float valor){
        return valor > 0 && valor < 1000;
    }
    
    public void printTelevisor(){
        System.out.println("\n--Información del Televisor--");
        System.out.println("Marca                   : " + getMarca());
        System.out.println("Modelo                  : " + getModelo());
        System.out.println("Pulgadas                : " + getPulgadas());
        System.out.println("Smart TV                : " + getSmartTv());
        System.out.println("Nombre empresa de cable : " + getNombreEmpresaCable());
        System.out.println("Valor (US)              : " + getValor()+"\n\n");
    }
}
