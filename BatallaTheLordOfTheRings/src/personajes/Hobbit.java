package personajes;

import javax.swing.*;

public class Hobbit extends Heroe {

    public Hobbit() {
    }

    public Hobbit(String nombre, int puntosdeVida, int nivelResistencia) {
        super(nombre, puntosdeVida, nivelResistencia);
    }

    @Override
    public void ataca(Bestia bestia, JTextArea textoBatalla) {


        if (bestia.getClass().equals(Trasgo.class)) {
            int reduccionPotencia = 5;

            int fuerzaAtaqueInicial = calcularPotenciaAtaqueHeroe();
            textoBatalla.setText(textoBatalla.getText() + "La fuerza de ataque inicial de este Hobbit es de " + fuerzaAtaqueInicial + " puntos.\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


            int fuerzaAtaqueFinal = fuerzaAtaqueInicial - reduccionPotencia;
            textoBatalla.setText(textoBatalla.getText() + "Como los hobbits le tienen un miedo especial a los trasgos, la potencia ofensiva se reduce a: " + fuerzaAtaqueFinal + " puntos (-5 unidades)\r\n");


            setFuerzaAtaque(fuerzaAtaqueFinal);


        } else {

            fuerzaAtaque = calcularPotenciaAtaqueHeroe();
            textoBatalla.setText(textoBatalla.getText() + "La fuerza de ataque de este hobbit es de " + fuerzaAtaque + " puntos.\r\n");


        }


        if (fuerzaAtaque > bestia.getNivelResistenciaArmadura()) {
            resultado = fuerzaAtaque - bestia.getNivelResistenciaArmadura();
        } else if (bestia.getNivelResistenciaArmadura() > fuerzaAtaque) {

            resultado = bestia.getNivelResistenciaArmadura() - fuerzaAtaque;

        }


        if (fuerzaAtaque > bestia.nivelResistenciaArmadura) {
            bestia.setPuntosDeVida(bestia.getPuntosDeVida() - resultado);
            textoBatalla.setText(textoBatalla.getText() + getNombre() + " saca " + fuerzaAtaque + " puntos y le quita "
                    + resultado + " puntos a " + bestia + ".\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


        } else if (fuerzaAtaque < bestia.nivelResistenciaArmadura) {
            textoBatalla.setText(textoBatalla.getText() + "La fuerza del ataque de " + getNombre() + " es de " + fuerzaAtaque + " y  no es suficiente. No le resta puntos a " + bestia + ".\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


        }


    }
}

