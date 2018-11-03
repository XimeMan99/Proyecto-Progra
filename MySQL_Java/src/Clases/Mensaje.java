/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JMenuItem;

public class Mensaje {
    
    private JMenuItem menuItem;
    private EstadoDocumento estado;
    
    public Mensaje()
    {
        this.menuItem = new JMenuItem();
        this.estado = new EstadoDocumento();
    }

    public JMenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(JMenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public EstadoDocumento getEstado() {
        return estado;
    }

    public void setEstado(EstadoDocumento estado) {
        this.estado = estado;
    }
    
    

}
