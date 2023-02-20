package ej1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;
import java.util.ArrayList;

import static java.awt.Color.*;

public class GUI_Lunes extends JFrame {
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

    GUI_Lunes() {
        super("Prueba ejercicio 1:");
        setContentPane(GUI_main);
        ArrayList<Integer> lista = new ArrayList<>();
        v1 = new Vector(lista);

        menuBar = new JMenuBar();
        archivo = new JMenu("Archivo");//PESTAÑA ARCHIVO
        salir = new JMenuItem("Salir");//ITEM SALIR
        ajustes = new JMenuItem("Ajustes");//ITEM AJUSTES
        informacion = new JMenuItem("Informacion");// PESTAÑA INFORMACION - LLAMAS A UNA VENTANA

        menuBar.add(archivo);
        archivo.add(salir);
        archivo.add(ajustes);
        archivo.add(informacion);

        setJMenuBar(menuBar);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hasta pronto.");
                dispose();
                System.exit(0);
            }
        });

        informacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Autor: Byron Nasimba" + "\n" + "Licencia: Open Source" + "\n" + "Fecha: 19/02/2023 17:58" + "\n" + "Agradecimientos a Mario, Raul, Nicole, Ángel, Javier, Miguel y Nacho");
            }
        });

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


        cargarSinBorrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num = Integer.parseInt(numerosEntradaTextPane.getText());
                lista.add(num);
                System.out.println("Has cargado un nuevo número a la lista.(" + num + ")");
            }
        });
        borrarMayorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //numerosCargadosTextFiled.setText("");
                v1.borrarMayor();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println("Has quitado el número mayor.");
            }
        });
        imprimirTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
        imprimirUnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numerosCargadosTextFiled.setText(String.valueOf(v1.cogerPrimero()));
                System.out.println(v1.cogerPrimero());
            }
        });
        ordenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.cambiarOrden();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }//no ordena de mayor a menor. Nada que ver solo mueve de lugar los números.
        });
        quitarElÚltimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.borrarUltimo();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }//quita el último elemento
        });
        quitarElPrimeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.borrarPrimero();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
        quitarElNúmeroMenorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.borrarMenor();
                numerosCargadosTextFiled.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
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
