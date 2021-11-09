/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Igu.AltaMascota;

public class Veterinaria {

    public static void main(String[] args) {
        ControladoraLogica controlLogica = new ControladoraLogica();
        
        AltaMascota alta= new AltaMascota(controlLogica);
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
    }
    
}
