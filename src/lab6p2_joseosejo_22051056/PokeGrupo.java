/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_joseosejo_22051056;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcoq2
 */
public class PokeGrupo 
{
 String nombre;
 ArrayList<Usuario>miembrosPokeGrupo;
 Date fechaCreacion;
 Usuario usuarioLider;
 String tipoDePokeGrupo;

    public PokeGrupo(String nombre, ArrayList<Usuario> miembrosPokeGrupo, Date fechaCreacion, Usuario usuarioLider, String tipoDePokeGrupo) {
        this.nombre = nombre;
        this.miembrosPokeGrupo = miembrosPokeGrupo;
        this.fechaCreacion = fechaCreacion;
        this.usuarioLider = usuarioLider;
        this.tipoDePokeGrupo = tipoDePokeGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembrosPokeGrupo() {
        return miembrosPokeGrupo;
    }

    public void setMiembrosPokeGrupo(ArrayList<Usuario> miembrosPokeGrupo) {
        this.miembrosPokeGrupo = miembrosPokeGrupo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuarioLider() {
        return usuarioLider;
    }

    public void setUsuarioLider(Usuario usuarioLider) {
        this.usuarioLider = usuarioLider;
    }

    public String getTipoDePokeGrupo() {
        return tipoDePokeGrupo;
    }

    public void setTipoDePokeGrupo(String tipoDePokeGrupo) {
        this.tipoDePokeGrupo = tipoDePokeGrupo;
    }

    @Override
    public String toString() {
        return "PokeGrupo{" + "nombre=" + nombre 
                + ", miembrosPokeGrupo=" + miembrosPokeGrupo 
                + ", fechaCreacion=" + fechaCreacion 
                + ", usuarioLider=" + usuarioLider 
                + ", tipoDePokeGrupo=" + tipoDePokeGrupo + '}';
    }
 
 
}
