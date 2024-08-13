/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.frmVisitas;
import MOdel.Visitas;

/**
 *
 * @author Estudiante
 */
public class ctrlVisitas {
    //1- Mandar a llamar a las otras capas
    private Visitas modelo;
    private frmVisitas vista;
    
   //2- Crear el constructor
    public ctrlVisitas(Visitas modelo, frmVisitas vista){
    this.modelo = modelo;
    this.vista = vista;
    
    vista.btnAgregar.addMouseListener(this);
    //2- Crear el constructor
}
}