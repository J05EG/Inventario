/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author PC
 */
public interface IValidacionTv {
    public boolean ValidarMarca(String marca);
    public boolean ValidarModelo(String modelo);
    public boolean ValidarPulgadas(int pulgadas);
    public boolean ValidarSmartTv(String smartTv);
    public boolean ValidarNombreEmpresaCable(String nEmpCable);
    public boolean ValidarValor(float valor);
}
