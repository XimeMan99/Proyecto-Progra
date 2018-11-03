/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Alumno {
    
    protected int cod_alumno,tipo_alumno_cod_tipo,numero;
    protected String nombre,carnet,contraseña,facultad,correo;

    public Alumno() {
        this.cod_alumno = 0;
        this.tipo_alumno_cod_tipo = 0;
        this.nombre = "";
        this.carnet = "";
        this.contraseña = "";
        this.facultad = "";
        this.numero = 0;
        this.correo = "";
    }

    public Alumno(int cod_alumno, int tipo_alumno_cod_tipo, String nombre, String carnet, String contraseña,String facultad,int numero,String correo) {
        this.cod_alumno = cod_alumno;
        this.tipo_alumno_cod_tipo = tipo_alumno_cod_tipo;
        this.nombre = nombre;
        this.carnet = carnet;
        this.contraseña = contraseña;
        this.facultad = facultad;
        this.numero = numero;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(int cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public int getTipo_alumno_cod_tipo() {
        return tipo_alumno_cod_tipo;
    }

    public void setTipo_alumno_cod_tipo(int tipo_alumno_cod_tipo) {
        this.tipo_alumno_cod_tipo = tipo_alumno_cod_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
}
