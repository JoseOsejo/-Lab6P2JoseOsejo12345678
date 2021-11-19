/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_joseosejo_22051056;

import java.util.Date;

/**
 *
 * @author jcoq2
 */
public class Usuario 
{
 String nombre;
 String apellido;
 String nombreUsuario;//validar que sea unico
 String password;
 Date fechaNacimiento;
 Date edad;//calcular con fechaNacimiento
 String colorFavorito;
 Pokedex pokedex;//son tres pokedex

    public Usuario(String nombre, String apellido, String nombreUsuario, String password, Date fechaNacimiento, Date edad, String colorFavorito, Pokedex pokedex) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.colorFavorito = colorFavorito;
        this.pokedex = pokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre
                + ", apellido=" + apellido 
                + ", nombreUsuario=" + nombreUsuario 
                + ", password=" + password 
                + ", fechaNacimiento=" + fechaNacimiento 
                + ", edad=" + edad 
                + ", colorFavorito=" + colorFavorito 
                + ", pokedex=" + pokedex + '}';
    }
 
    
}
