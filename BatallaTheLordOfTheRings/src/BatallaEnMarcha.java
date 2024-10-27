import personajes.Bestia;
import personajes.Heroe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BatallaEnMarcha extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelResultadoBatalla;
    private JTextArea textoBatallaResultado;
    private JComboBox comboHeroes;
    private JComboBox comboBestias;
    private JList listaHeroes;
    private JList listaBestias;
    private JButton botonBatalla;
    private JButton botonIncluirHeroe;
    private JButton botonBorrarHeroe;
    private JButton botonIncluirBestia;
    private JButton botonBorrarBestia;
    private JScrollPane barraScroll;
    private JButton botonReanudar;

    DefaultListModel miModeloHeroes;
    DefaultListModel miModeloBestias;

    List<Heroe> ejercitoHeroes = new ArrayList<>();
    List<Bestia> ejercitoBestias = new ArrayList<>();

    Batalla batalla = new Batalla();


    public void setTextoBatalla(String valor) {

        textoBatallaResultado.setText(valor);
    }

    public JTextArea getTextoBatalla() {

        return textoBatallaResultado;
    }


    public BatallaEnMarcha() {
        super("LA BATALLA POR LA TIERRA MEDIA");

        setContentPane(panelPrincipal);
        //textoBatallaResultado.setBounds(0,0,100,100);
        textoBatallaResultado.setSize(300, 300);


        //JScrollPane barraScroll = new JScrollPane(textoBatallaResultado);


        miModeloHeroes = new DefaultListModel();
        miModeloBestias = new DefaultListModel();

        listaHeroes.setModel(miModeloHeroes);
        listaBestias.setModel(miModeloBestias);


        botonIncluirHeroe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String selected = comboHeroes.getSelectedItem().toString();
                    boolean repetido = false;


                    for (int i = 0; i < miModeloHeroes.getSize(); i++) {
                        if (miModeloHeroes.getElementAt(i).equals(selected)) {
                            repetido = true;

                        }


                    }

                    if (!repetido) {
                        miModeloHeroes.addElement(selected);
                        batalla.seleccionHeroe(comboHeroes.getSelectedIndex());


                    } else {
                        JOptionPane.showMessageDialog(null, "ESTE HÉROE YA HA SIDO SELECCIONADO. POR FAVOR ELIGE A OTRO GUERRERO.");
                    }

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, "¡UPS! OPCIÓN NO VÁLIDA");


                }


            }
        });
        botonIncluirBestia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String selected = comboBestias.getSelectedItem().toString();
                    boolean repetido = false;


                    for (int i = 0; i < miModeloBestias.getSize(); i++) {
                        if (miModeloBestias.getElementAt(i).equals(selected)) {
                            repetido = true;

                        }


                    }

                    if (!repetido) {
                        miModeloBestias.addElement(selected);
                        batalla.seleccionBestia(comboBestias.getSelectedIndex());


                    } else {
                        JOptionPane.showMessageDialog(null, "ESTA BESTIA YA HA SIDO SELECCIONADA. " +
                                "POR FAVOR, ELIGE A OTRO GUERRERO");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "¡UPS! OPCIÓN NO VÁLIDA");

                }
            }
        });
        botonBorrarHeroe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int selected = listaHeroes.getSelectedIndex();
                    miModeloHeroes.removeElementAt(selected);
                    batalla.eliminarHeroe(comboHeroes.getSelectedIndex());

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, "¡UPS! OPCIÓN NO VÁLIDA");

                }


            }


        });
        botonBorrarBestia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int selected = listaBestias.getSelectedIndex();
                    miModeloBestias.removeElementAt(selected);
                    batalla.eliminarBestia(comboBestias.getSelectedIndex());

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, "¡UPS! OPCIÓN NO VÁLIDA");
                }

            }
        });
        botonBatalla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Batalla.batallaenMarcha(ejercitoHeroes, ejercitoBestias, textoBatallaResultado);


            }
        });
        botonReanudar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    textoBatallaResultado.setText(null);
                    miModeloHeroes.removeAllElements();
                    miModeloBestias.removeAllElements();
                    listaHeroes.removeAll();
                    listaBestias.removeAll();
                    ejercitoBestias.clear();
                    ejercitoHeroes.clear();
                    Batalla.resetearBatalla();


                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "¡UPS! OPCIÓN NO VÁLIDA");
                }

            }
        });
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BatallaEnMarcha marco = new BatallaEnMarcha();
                marco.setBounds(190, 100, 1000, 550);
                marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
                marco.setVisible(true);


            }
        });


    }


}
