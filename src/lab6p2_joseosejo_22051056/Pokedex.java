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
public class Pokedex 
{
Pokemon pokemones;//son tres pokemones
double danioPromedioPokemones;

    public Pokedex(Pokemon pokemones, double danioPromedioPokemones) {
        this.pokemones = pokemones;
        this.danioPromedioPokemones = danioPromedioPokemones;
    }

    public Pokemon getPokemones() {
        return pokemones;
    }

    public void setPokemones(Pokemon pokemones) {
        this.pokemones = pokemones;
    }

    public double getDanioPromedioPokemones() {
        return danioPromedioPokemones;
    }

    public void setDanioPromedioPokemones(double danioPromedioPokemones) {
        this.danioPromedioPokemones = danioPromedioPokemones;
    }





}
