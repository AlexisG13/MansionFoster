/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.util.ArrayList;

/**
 *
 * @author Karina Mina
 */
public class Habitacion extends Piso {
    private float costoNoche;
    private boolean estado;

    public Habitacion(float costoNoche, boolean estado) {
        this.costoNoche = costoNoche;
        this.estado = estado;
    }

    public float getCostoNoche() {
        return costoNoche;
    }
    //GET DE ESTADO

    public boolean isEstado() {
        return estado;
    }

    public void setCostoNoche(float costoNoche) {
        this.costoNoche = costoNoche;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
    
}
