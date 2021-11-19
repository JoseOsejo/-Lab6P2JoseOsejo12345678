/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_joseosejo_22051056;

/**
 *
 * @author jcoq2
 */
public class Pokemon 
{
 String nombre;
 double danio;
 int puntosDeVida;
 String velocidad;

    public Pokemon(String nombre, double danio, int puntosDeVida, String velocidad) {
        this.nombre = nombre;
        this.danio = danio;
        this.puntosDeVida = puntosDeVida;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre 
                + ", danio=" + danio
                + ", puntosDeVida=" + puntosDeVida 
                + ", velocidad=" + velocidad + '}';
    }
 
 

}
