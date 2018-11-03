/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class EstadoDocumento {
    private int estado;
    private int documento_cod_documento;
    private int alumno_cod_alumno;
    
    public EstadoDocumento()
    {
        estado = 0;
        documento_cod_documento = 0;
        alumno_cod_alumno = 0;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getDocumento_cod_documento() {
        return documento_cod_documento;
    }

    public void setDocumento_cod_documento(int documento_cod_documento) {
        this.documento_cod_documento = documento_cod_documento;
    }

    public int getAlumno_cod_alumno() {
        return alumno_cod_alumno;
    }

    public void setAlumno_cod_alumno(int alumno_cod_alumno) {
        this.alumno_cod_alumno = alumno_cod_alumno;
    }

    @Override
    public String toString() {
        return "EstadosDocumento{" + "estado=" + estado + ", documento_cod_documento=" + documento_cod_documento + ", alumno_cod_alumno=" + alumno_cod_alumno + '}';
    }
    
    
}
