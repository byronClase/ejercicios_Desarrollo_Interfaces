package ej1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador {
    private JPanel GUI_main;
    private JButton cargarSinBorrarButton;
    private JButton cargarYBorrarButton;
    private JButton borrarMayorButton;
    private JTextPane numerosEntradaTextPane;
    private JTextField numerosCargadosTextFiled;
    private JLabel numerosIntroducidosLabel;
    private JLabel numerosCargadosLabel;
    private JButton imprimirTodosButton;
    private JButton imprimirUnoButton;
    private JButton ordenarButton;
    private JButton quitarElÚltimoButton;
    private JButton quitarElPrimeroButton;
    private JButton quitarElNúmeroMenorButton;

    private Vector v1;
    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;
    private JMenuItem ajustes;
    private JMenuItem informacion;
    private static Color color;
    ArrayList<Integer> lista = new ArrayList<>();
    //v1 = new Vector(lista);


    static Color getColor(String col) {
        switch (col.toLowerCase()) {
            case "black":
                color = Color.BLACK;
                break;
            case "blue":
                color = Color.BLUE;
                break;
            case "cyan":
                color = Color.CYAN;
                break;
            case "darkgray":
                color = Color.DARK_GRAY;
                break;
            case "gray":
                color = Color.GRAY;
                break;
            case "green":
                color = Color.GREEN;
                break;
            case "yellow":
                color = Color.YELLOW;
                break;
            case "lightgray":
                color = Color.LIGHT_GRAY;
                break;
            case "magneta":
                color = Color.MAGENTA;
                break;
            case "orange":
                color = Color.ORANGE;
                break;
            case "pink":
                color = Color.PINK;
                break;
            case "red":
                color = Color.RED;
                break;
            case "white":
                color = Color.WHITE;
                break;
        }
        return color;
    }

    private void menuSalir() {
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hasta pronto.");
                //dispose();
                System.exit(0);
            }
        });
    }

    private void menuInformacion() {
        informacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Autor: Byron Nasimba" + "\n" + "Licencia: Open Source" + "\n" + "Fecha: 19/02/2023 17:58" + "\n" + "Agradecimientos a Mario, Raul, Nicole, Ángel, Javier, Miguel y Nacho");
            }
        });
    }

    private void menuAjustes() {
        ajustes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*
                JColorChooser ventanaDeColores = new JColorChooser();
                color = ventanaDeColores.showDialog(null, "Seleccione un Color", Color.gray);
                GUI_main.setBackground(color);
                */
                String[] values = {"yellow", "blue", "gray"};
                Object selected = JOptionPane.showInputDialog(null, "¿Que color quieres de fondo?", "Selecciona", JOptionPane.DEFAULT_OPTION, null, values, "yellow");

                if (selected != null) {//null if the user cancels.
                    String select = selected.toString();
                    Color c = getColor(select);
                    GUI_main.setBackground(c);

                } else {
                    System.out.println("User cancelled");
                }
            }
        });
    }


    private void cargarEvento() {
        cargarSinBorrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num = Integer.parseInt(numerosEntradaTextPane.getText());
                lista.add(num);
                System.out.println("Has cargado un nuevo número a la lista.(" + num + ")");
            }
        });
    }

    private void borrarMayorEvento() {

        borrarMayorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //numerosCargadosTextFiled.setText("");
                v1.borrarMayor();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println("Has quitado el número mayor.");
            }
        });
    }

    private void imprimirTodoEvento() {
        imprimirTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
    }

    private void imprimirUnoEvento() {
        imprimirUnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numerosCargadosTextFiled.setText(String.valueOf(v1.cogerPrimero()));
                System.out.println(v1.cogerPrimero());
            }
        });
    }

    private void ordenarEvento() {
        ordenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.cambiarOrden();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }//no ordena de mayor a menor. Nada que ver solo mueve de lugar los números.
        });
    }

    private void quitarUltimoEvento() {
        quitarElÚltimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.borrarUltimo();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }//quita el último elemento
        });
    }

    private void quitarPrimeroEvento() {
        quitarElPrimeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.borrarPrimero();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
    }

    private void quitarMenorEvento() {
        quitarElNúmeroMenorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.borrarMenor();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
    }

    private void cargaryborrarEvento() {
        cargarYBorrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(numerosEntradaTextPane.getText());
                lista.add(num);
                System.out.println("Has cargado un nuevo número a la lista (" + num + ").");
                System.out.println("El último numero (" + v1.cogerUltimo() + ").");
                v1.borrarUltimo();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
    }

}

