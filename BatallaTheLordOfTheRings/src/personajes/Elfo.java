package personajes;

import javax.swing.*;

public class Elfo extends Heroe {


    public Elfo() {
    }

    public Elfo(String name, int puntosDeVida, int nivelResistenciaArmadura) {
        super(name, puntosDeVida, nivelResistenciaArmadura);
    }


    @Override
    public void ataca(Bestia bestia, JTextArea textoBatalla) {

        if (bestia.getClass().equals(Orco.class) || bestia.getPuntosDeVida() > 0) {


            int fuerzaAtaqueInicial = calcularPotenciaAtaqueHeroe();
            textoBatalla.setText(textoBatalla.getText() + "La fuerza de ataque inicial de " + getNombre() + " es " + fuerzaAtaqueInicial + " puntos.\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");

            int fuerzaAtaqueConIncremento = fuerzaAtaqueInicial + 10;
            setFuerzaAtaque(fuerzaAtaqueConIncremento);
            textoBatalla.setText(textoBatalla.getText() + "La fuerza de ataque de este elfo, al enfrentarse a un orco,  se incrementa en 10 unidades. A:  (" + fuerzaAtaque + ").\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


        } else {

            fuerzaAtaque = calcularPotenciaAtaqueHeroe();

        }


        if (fuerzaAtaque > bestia.getNivelResistenciaArmadura()) {
            resultado = fuerzaAtaque - bestia.getNivelResistenciaArmadura();
        } else if (bestia.getNivelResistenciaArmadura() > fuerzaAtaque) {
            resultado = bestia.getNivelResistenciaArmadura() - fuerzaAtaque;
        }

        if (fuerzaAtaque > bestia.nivelResistenciaArmadura) {
            bestia.setPuntosDeVida(bestia.getPuntosDeVida() - resultado);
            textoBatalla.setText(textoBatalla.getText() + getNombre() + " ha sacado " + fuerzaAtaque + " puntos y le quita "
                    + resultado + " puntos a " + bestia + ".\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


        } else if (fuerzaAtaque < bestia.nivelResistenciaArmadura) {
            textoBatalla.setText(textoBatalla.getText() + "La fuerza del ataque de " + getNombre() + " es de " + fuerzaAtaque + " puntos y no es suficiente. No le resta puntos a " + bestia + ".\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");

        }

    }
}
