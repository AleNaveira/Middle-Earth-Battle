package personajes;

import java.util.Objects;

public class Personaje {

    String nombre;
    int puntosDeVida;
    int nivelResistenciaArmadura;
    int resultado = 0;
    int fuerzaAtaque;

    public Personaje() {
    }

    public Personaje(String nombre, int puntosDeVida, int nivelResistenciaArmadura) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.nivelResistenciaArmadura = nivelResistenciaArmadura;
    }

    public String getNombre() {
        return nombre;
    }

   /*public void setNombre(String nombre) {
        this.nombre = nombre;
    } */

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getNivelResistenciaArmadura() {
        return nivelResistenciaArmadura;
    }

    public void setNivelResistenciaArmadura(int nivelResistenciaArmadura) {
        this.nivelResistenciaArmadura = nivelResistenciaArmadura;
    }

    /* public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }*/

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

}
