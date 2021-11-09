/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Mascotas;
import javax.swing.JOptionPane;

/**
 *Podemos llamar desde la logica a la persistencia
 * @author villa
 */
public class ControladoraPersistencia {
    
    MascotasJpaController mascotaJPA = new MascotasJpaController();
    
    public void crearMascota(Mascotas mascota){
        try {
            mascotaJPA.create(mascota);
            JOptionPane.showMessageDialog(null,"Mascota agregada correctamente", "Mascota Agregada", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al crear la mascota", "Fallo al crear la mascota", JOptionPane.ERROR);
            ex.printStackTrace(System.out);
        }
    }
    
}
