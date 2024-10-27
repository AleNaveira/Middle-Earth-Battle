package personajes;

import javax.swing.*;
import java.util.Random;

public class Heroe extends Personaje {


    public Heroe() {
    }

    public Heroe(String name, int puntosDeVida, int nivelResistenciaArmadura) {
        super(name, puntosDeVida, nivelResistenciaArmadura);
    }

    public int calcularPotenciaAtaqueHeroe() {
        int fuerzaAtaque = 0;


        Random numeroAleatorio1 = new Random();
        Random numeroAleatorio2 = new Random();

        int dado1 = numeroAleatorio1.nextInt(100 + 1);
        int dado2 = numeroAleatorio2.nextInt(100 + 1);

        if (dado1 > dado2) {


            fuerzaAtaque = dado1;


        } else if (dado2 > dado1) {


            fuerzaAtaque = dado2;
        } else {


            calcularPotenciaAtaqueHeroe();
        }


        return fuerzaAtaque;
    }

    public int calcularResultadoAtaque(Bestia bestia) {
        int resultadoAtaque = 0;
        fuerzaAtaque = calcularPotenciaAtaqueHeroe();
        if (fuerzaAtaque > bestia.getNivelResistenciaArmadura()) {
            resultadoAtaque = fuerzaAtaque - bestia.getNivelResistenciaArmadura();
        } else if (bestia.getNivelResistenciaArmadura() > fuerzaAtaque) {
            resultadoAtaque = bestia.getNivelResistenciaArmadura() - fuerzaAtaque;
        }
        return resultadoAtaque;
    }

    public void ataca(Bestia bestia, JTextArea textoBatalla) {

        resultado = calcularResultadoAtaque(bestia);

        if (fuerzaAtaque > bestia.getNivelResistenciaArmadura()) {
            bestia.setPuntosDeVida(bestia.getPuntosDeVida() - resultado);

            textoBatalla.setText(textoBatalla.getText() + getNombre() + " saca " + fuerzaAtaque + " puntos y le quita " + resultado + " puntos  a " + bestia + ".\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");
        } else if (fuerzaAtaque < bestia.nivelResistenciaArmadura) {
            textoBatalla.setText(textoBatalla.getText() + "La fuerza del ataque de " + getNombre() + " es de " + fuerzaAtaque + " puntos y no es suficiente. No le resta puntos a " + bestia + ".\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


        }

    }

}

