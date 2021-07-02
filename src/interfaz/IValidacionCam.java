/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Jose
 */
public interface IValidacionCam {
    public boolean ValidarCodigo(String codigo);
    public boolean ValidarModelo(String modelo);
    public boolean ValidarGiro(int giro);
    public boolean ValidarMegapixeles(float megapixeles);
    public boolean ValidarMetrosAlcanceWifi(float alcance);
    public boolean ValidarValor(float valor);
}
