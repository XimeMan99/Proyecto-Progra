/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Documento {
    private int cod_documento;
    private int cod_curso;
    private String documento;
    
    public Documento()
    {
        cod_documento=0;
        cod_curso=0;
        documento="";
    }

    public int getCod_documento() {
        return cod_documento;
    }

    public void setCod_documento(int cod_documento) {
        this.cod_documento = cod_documento;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return documento;
    }
    
    
}
