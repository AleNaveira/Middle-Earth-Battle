package personajes;

import javax.swing.*;

public class Orco extends Bestia {

    public Orco() {
    }

    public Orco(String name, int puntosDeVida, int nivelResistenciaArmadura) {
        super(name, puntosDeVida, nivelResistenciaArmadura);
    }


    @Override
    public void ataca(Heroe heroe, JTextArea textoBatalla) {


        int nivelArmaduraOponente = heroe.getNivelResistenciaArmadura();


        int nivelArmaduraAReducir = (nivelArmaduraOponente * 10) / 100;


        int nivelArmaduraReducido = nivelArmaduraOponente - nivelArmaduraAReducir;
        textoBatalla.setText(textoBatalla.getText() + "El nivel de armadura de " + heroe.getNombre() + " al enfrentarse a un orco , que tiene una fuerza desmesurada, es de: " + nivelArmaduraReducido + " puntos (-10% de armadura).\r\n");
        textoBatalla.setText(textoBatalla.getText() + "\r\n");

        heroe.setNivelResistenciaArmadura(nivelArmaduraReducido);


        int resultado = 0;
        fuerzaAtaque = calcularPotenciaAtaqueBestia();

        if (fuerzaAtaque > heroe.getNivelResistenciaArmadura()) {
            resultado = fuerzaAtaque - heroe.getNivelResistenciaArmadura();
        } else if (heroe.getNivelResistenciaArmadura() > fuerzaAtaque) {
            resultado = heroe.getNivelResistenciaArmadura() - fuerzaAtaque;
        }


        if (fuerzaAtaque > heroe.nivelResistenciaArmadura) {

            if (getPuntosDeVida() > 0) {
                heroe.setPuntosDeVida(heroe.puntosDeVida - resultado);
                textoBatalla.setText(textoBatalla.getText() + getNombre() + " saca " + fuerzaAtaque +
                        " puntos y le quita " + resultado + " puntos a " + heroe + ".\r\n");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");

            }


        } else if (fuerzaAtaque < heroe.nivelResistenciaArmadura) {

            if (getPuntosDeVida() > 0) {
                textoBatalla.setText(textoBatalla.getText() + "La fuerza del ataque de " + getNombre() + " no es suficiente. No le resta puntos a " + heroe + "\r\n");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");
            }

        }

        heroe.setNivelResistenciaArmadura(nivelArmaduraOponente);


    }
}
