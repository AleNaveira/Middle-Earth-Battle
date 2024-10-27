package personajes;

import javax.swing.*;
import java.util.Random;

public class Bestia extends Personaje {


    public Bestia() {
    }

    public Bestia(String name, int puntosDeVida, int nivelResistenciaArmadura) {
        super(name, puntosDeVida, nivelResistenciaArmadura);
    }

    public int calcularPotenciaAtaqueBestia() {

        Random numeroAleatorio1 = new Random();

        fuerzaAtaque = numeroAleatorio1.nextInt(90);

        return fuerzaAtaque;
    }

    public int calcularResultadoAtaque(Heroe heroe) {
        int resultado = 0;
        fuerzaAtaque = calcularPotenciaAtaqueBestia();
        if (fuerzaAtaque > heroe.getNivelResistenciaArmadura()) {
            resultado = fuerzaAtaque - heroe.getNivelResistenciaArmadura();
        } else if (heroe.getNivelResistenciaArmadura() > fuerzaAtaque) {
            resultado = heroe.getNivelResistenciaArmadura() - fuerzaAtaque;
        }
        return resultado;
    }

    public void ataca(Heroe heroe, JTextArea textoBatalla) {

        resultado = calcularResultadoAtaque(heroe);

        if (fuerzaAtaque > heroe.getNivelResistenciaArmadura()) {
            resultado = fuerzaAtaque - heroe.getNivelResistenciaArmadura();
        } else if (heroe.getNivelResistenciaArmadura() > fuerzaAtaque) {
            resultado = heroe.getNivelResistenciaArmadura() - fuerzaAtaque;
        }

        if (fuerzaAtaque > heroe.nivelResistenciaArmadura) {
            heroe.setPuntosDeVida(heroe.puntosDeVida - resultado);

            if (getPuntosDeVida() > 0) {
                textoBatalla.setText(textoBatalla.getText() + getNombre() + " saca " + fuerzaAtaque +
                        " puntos y le quita " + resultado + " puntos a " + heroe + ".\n\r");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");
            }


        } else if (fuerzaAtaque < heroe.nivelResistenciaArmadura) {

            if (getPuntosDeVida() > 0) {
                textoBatalla.setText(textoBatalla.getText() + "La fuerza del ataque de " + getNombre() + " es de " + fuerzaAtaque + " puntos y no es suficiente. No le resta puntos a " + heroe + ".\r\n");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");
            }


        }
    }
}






