/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Fabricio Mero
 */
public class AntiInyeccionSQL {
    
    public String limpiar_string(String str){
        str = str.replace("'", "");
        str = str.replace("\"", "");
        str = str.replace(";","");
        str = str.replace("-", "");
        str = str.replace("=", "");

        return str;
    }
}
