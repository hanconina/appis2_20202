/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.abstractfactory.gestordatabase;


public interface Consulta {
    public boolean set(String text);
    public boolean execute();
}
