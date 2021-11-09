/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author villa
 */
public class ControladoraLogica {
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearMascota(Mascotas mascota){
        controlPersistencia.crearMascota(mascota);
        
    }

    public void crearMascota(int nroCliente, String nombreMascota, String raza, String color, boolean alergico, boolean atEspecial, String nombreDuenio, String celular, String observaciones) {
        
        Mascotas mascota = new Mascotas(); 
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atEspecial);
        mascota.setCelular_duenio(celular);
        mascota.setColor(color);
        mascota.setNombre_duenio(nombreDuenio);
        mascota.setNombre_perro(nombreMascota);
        mascota.setNum_cliente(nroCliente);
        mascota.setObservaciones(observaciones);
        mascota.setRaza(raza);
        
        controlPersistencia.crearMascota(mascota);
    }
    
}
