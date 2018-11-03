/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Auxiliar extends Alumno{

    public Auxiliar() {
    }

    public Auxiliar(int cod_alumno, int tipo_alumno_cod_tipo, String nombre, String carnet, String contraseña, String facultad, int numero, String correo) {
        super(cod_alumno, tipo_alumno_cod_tipo, nombre, carnet, contraseña, facultad, numero, correo);
    }
}
