import personajes.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Batalla {


    static List<Heroe> ejercitoHeroes = new ArrayList<>();
    static List<Bestia> ejercitoBestias = new ArrayList<>();


    public void eliminarHeroe(int el) {

        Heroe heroe = ejercitoHeroes.get(el);
        ejercitoHeroes.remove(heroe);


    }

    public void eliminarBestia(int el) {

        Bestia bestia = ejercitoBestias.get(el);
        ejercitoBestias.remove(bestia);

    }


    public static void seleccionHeroe(int s) {
        int seleccion = s;

        switch (seleccion) {

            case 0:

                ejercitoHeroes.add(new Humano("Aragorn", 150, 50));
                break;
            case 1:

                ejercitoHeroes.add(new Humano("Boromir", 100, 60));
                break;
            case 2:

                ejercitoHeroes.add(new Elfo("Celeborn", 180, 40));
                break;
            case 3:

                ejercitoHeroes.add(new Elfo("Faramir", 120, 60));
                break;
            case 4:

                ejercitoHeroes.add(new Hobbit("Frodo", 30, 10));
                break;
            case 5:

                ejercitoHeroes.add(new Humano("Gandalf", 300, 30));
                break;
            case 6:

                ejercitoHeroes.add(new Elfo("Legolas", 150, 30));
                break;
            case 7:

                ejercitoHeroes.add(new Hobbit("Merry", 20, 10));
                break;

            case 8:

                ejercitoHeroes.add(new Hobbit("Pippin", 20, 10));
                break;
            case 9:

                ejercitoHeroes.add(new Hobbit("Sam", 30, 30));
                break;


        }
    }

    public static void seleccionBestia(int b) {

        int sel = b;

        switch (sel) {

            case 0:

                ejercitoBestias.add(new Trasgo("Azog", 110, 30));
                break;
            case 1:

                ejercitoBestias.add(new Orco("Bolg", 50, 50));
                break;
            case 2:

                ejercitoBestias.add(new Trasgo("El Gran Trasgo", 150, 60));
                break;
            case 3:

                ejercitoBestias.add(new Trasgo("Gorkil", 30, 10));
                break;
            case 4:

                ejercitoBestias.add(new Orco("Gothmog", 50, 40));
                break;

            case 5:

                ejercitoBestias.add(new Orco("Guritz", 50, 30));
                break;
            case 6:

                ejercitoBestias.add(new Orco("Lurtz", 200, 60));
                break;

            case 7:

                ejercitoBestias.add(new Trasgo("Mauhúr", 100, 30));
                break;

            case 8:

                ejercitoBestias.add(new Orco("Shagrat", 220, 50));
                break;
            case 9:

                ejercitoBestias.add(new Trasgo("Uglúk", 120, 30));
                break;


        }


    }


    public Batalla() {

    }

    public static void resetearBatalla() {
        ejercitoHeroes.clear();
        ejercitoBestias.clear();
    }

    public static void batallaenMarcha(List<Heroe> ejercitoH, List<Bestia> ejercitoB, JTextArea textoBatalla) {
        ejercitoH = ejercitoHeroes;
        ejercitoB = ejercitoBestias;
        Heroe heroeEnTurno = new Heroe();
        Bestia bestiaEnTurno = new Bestia();

        List<Heroe> ejercitoHeroes = ejercitoH;
        List<Bestia> ejercitoBestias = ejercitoB;


        Iterator<Heroe> itHeroes = ejercitoHeroes.iterator();
        Iterator<Bestia> itBestias = ejercitoBestias.iterator();

        int contadorHeroes = 0;
        int contadorBestias = 0;

        int turno = 1;


        textoBatalla.setText(textoBatalla.getText() + "\" ***¡¡¡¡COMIENZA EL JUEGO DE EL SEÑOR DE LOS ANILLOS!!!!***\r\n");
        textoBatalla.setText(textoBatalla.getText() + "\r\n");
        textoBatalla.setText(textoBatalla.getText() + "\r\n");
        while (itHeroes.hasNext() && itBestias.hasNext()) {

            if (contadorHeroes == ejercitoHeroes.size()) {

                contadorHeroes = 0;

            }

            if (contadorBestias == ejercitoBestias.size()) {

                contadorBestias = 0;


            }


            textoBatalla.setText(textoBatalla.getText() + "Turno : " + turno + "\r\n");

            textoBatalla.setText(textoBatalla.getText() + "------------------------------------------------------------------------\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


            heroeEnTurno = ejercitoHeroes.get(contadorHeroes);
            bestiaEnTurno = ejercitoBestias.get(contadorBestias);

            textoBatalla.setText(textoBatalla.getText() + "Lucha entre " + heroeEnTurno + " (vida=" + heroeEnTurno.getPuntosDeVida() + ", armadura=" +
                    +heroeEnTurno.getNivelResistenciaArmadura() + ") y " + bestiaEnTurno + " (vida=" + bestiaEnTurno.getPuntosDeVida() +
                    ", armadura=" + bestiaEnTurno.getNivelResistenciaArmadura() + "):\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


            heroeEnTurno.ataca(bestiaEnTurno, textoBatalla);

            if (bestiaEnTurno.getPuntosDeVida() > 0) {
                textoBatalla.setText(textoBatalla.getText() + "Lucha entre " + bestiaEnTurno + " (vida=" + bestiaEnTurno.getPuntosDeVida() + ", armadura=" +
                        +bestiaEnTurno.getNivelResistenciaArmadura() + ") y " + heroeEnTurno + " (vida=" + heroeEnTurno.getPuntosDeVida() +
                        ", armadura=" + heroeEnTurno.getNivelResistenciaArmadura() + "):\r\n");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");
            }


            if (itHeroes.hasNext()) {
                bestiaEnTurno.ataca(heroeEnTurno, textoBatalla);
            }
            if (bestiaEnTurno.getPuntosDeVida() <= 0) {

                textoBatalla.setText(textoBatalla.getText() + "¡" + bestiaEnTurno + " HA MUERTO! !" + bestiaEnTurno + " HA AGOTADO SU NIVEL DE VIDA!\r\n");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");
                ejercitoBestias.remove(contadorBestias);

                contadorBestias--;


            }


            if (heroeEnTurno.getPuntosDeVida() <= 0) {

                textoBatalla.setText(textoBatalla.getText() + "!" + heroeEnTurno + " HA MUERTO!¡" + heroeEnTurno + " HA AGOTADO SU NIVEL DE VIDA!!\r\n");
                textoBatalla.setText(textoBatalla.getText() + "\r\n");
                ejercitoHeroes.remove(contadorHeroes);
                contadorHeroes--;


            }


            contadorHeroes++;
            contadorBestias++;

            turno++;


            if (contadorHeroes == ejercitoHeroes.size() && itBestias.hasNext()) {
                contadorBestias = 0;

            }

            if (contadorBestias == ejercitoBestias.size() && itHeroes.hasNext()) {
                contadorHeroes = 0;

            }

            if (contadorHeroes == ejercitoHeroes.size()) {

                contadorHeroes = 0;


            }

            if (contadorBestias == ejercitoBestias.size()) {

                contadorBestias = 0;


            }


        }

        if (ejercitoHeroes.size() == 0) {


            textoBatalla.setText(textoBatalla.getText() + "El JUEGO HA TERMINADO. ¡HA GANADO EL EJÉRCITO DE LAS BESTIAS!\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");

        } else if (ejercitoBestias.size() == 0) {
            textoBatalla.setText(textoBatalla.getText() + "EL JUEGO HA TERMINADO. ¡HA GANADO EL EJÉRCITO DE LOS HÉROES!\r\n");
            textoBatalla.setText(textoBatalla.getText() + "\r\n");


        }

    }


}
