package ej1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Controlador extends JFrame {
    private JPanel GUI_main;
    private JButton cargarSinBorrarButton;
    private JButton cargarYBorrarButton;
    private JButton borrarMayorButton;
    public JTextPane numerosEntradaTextPane;
    private JTextField numerosCargadosTextFiled;
    private JLabel numerosIntroducidosLabel;
    private JLabel numerosCargadosLabel;
    private JButton imprimirTodosButton;
    private JButton imprimirUnoButton;
    private JButton ordenarButton;
    private JButton quitarElÚltimoButton;
    private JButton quitarElPrimeroButton;
    private JButton quitarElNúmeroMenorButton;
    private JTextField textFieldImprimir;

    private MODELO v1;
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

    Controlador() {
        super("Prueba ejercicio 1:");
        setContentPane(GUI_main);
        ArrayList<Integer> lista = new ArrayList<>();
        v1 = new MODELO(lista);

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
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(numerosEntradaTextPane.getText());
                lista.add(num);
                System.out.println("Has cargado un nuevo número a la lista.(" + num + ")");
                i++;
                if (i == 3) {
                    numerosEntradaTextPane.setBackground(Color.RED);
                }
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
                textFieldImprimir.setText(String.valueOf(v1.devuelveTodos()));
                System.out.println(v1.devuelveTodos());
            }
        });
        imprimirUnoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldImprimir.setText(String.valueOf(v1.cogerPrimero()));
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
                numerosEntradaTextPane.setText("");
                //para eliminar en el textPane coloco un valor vacio, pero guardo tambien en em modelo
            }
        });

        numerosEntradaTextPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        GUI_main = new JPanel();
        GUI_main.setLayout(new GridBagLayout());
        GUI_main.setBackground(new Color(-13726379));
        GUI_main.setToolTipText("Esta es la ventana del programa");
        numerosEntradaTextPane = new JTextPane();
        numerosEntradaTextPane.setToolTipText("Aqui el número");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        GUI_main.add(numerosEntradaTextPane, gbc);
        numerosIntroducidosLabel = new JLabel();
        numerosIntroducidosLabel.setHorizontalTextPosition(0);
        numerosIntroducidosLabel.setText("Introduce el número aqui");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        GUI_main.add(numerosIntroducidosLabel, gbc);
        numerosCargadosTextFiled = new JTextField();
        numerosCargadosTextFiled.setToolTipText("Se mostraran los números cargados");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.BOTH;
        GUI_main.add(numerosCargadosTextFiled, gbc);
        numerosCargadosLabel = new JLabel();
        numerosCargadosLabel.setText("Números cargados");
        numerosCargadosLabel.setToolTipText("Salida de números");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        GUI_main.add(numerosCargadosLabel, gbc);
        imprimirTodosButton = new JButton();
        imprimirTodosButton.setText("Imprimir todo");
        imprimirTodosButton.setToolTipText("Imprime todo");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(imprimirTodosButton, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Salida final:");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        GUI_main.add(label1, gbc);
        textFieldImprimir = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(textFieldImprimir, gbc);
        quitarElNúmeroMenorButton = new JButton();
        quitarElNúmeroMenorButton.setText("Quitar el número menor");
        quitarElNúmeroMenorButton.setToolTipText("Borrar el número mas pequeño");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(quitarElNúmeroMenorButton, gbc);
        borrarMayorButton = new JButton();
        borrarMayorButton.setText("Quitar el mayor número");
        borrarMayorButton.setToolTipText("Borrar el número mas grande");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(borrarMayorButton, gbc);
        quitarElÚltimoButton = new JButton();
        quitarElÚltimoButton.setText("Quitar el último");
        quitarElÚltimoButton.setToolTipText("borro el ultimo de la fila");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(quitarElÚltimoButton, gbc);
        quitarElPrimeroButton = new JButton();
        quitarElPrimeroButton.setText("Quitar el primero");
        quitarElPrimeroButton.setToolTipText("Borrar el primero de la fila");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(quitarElPrimeroButton, gbc);
        cargarSinBorrarButton = new JButton();
        cargarSinBorrarButton.setText("Cargar sin borrar");
        cargarSinBorrarButton.setToolTipText("Cargar sin borarr");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(cargarSinBorrarButton, gbc);
        ordenarButton = new JButton();
        ordenarButton.setText("No ordenar");
        ordenarButton.setToolTipText("Cambia de orden mayor > menor");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(ordenarButton, gbc);
        cargarYBorrarButton = new JButton();
        cargarYBorrarButton.setText("Cargar y borrar");
        cargarYBorrarButton.setToolTipText("Cargar y borrar");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(cargarYBorrarButton, gbc);
        imprimirUnoButton = new JButton();
        imprimirUnoButton.setText("Imprimir uno");
        imprimirUnoButton.setToolTipText("imprime el primero");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        GUI_main.add(imprimirUnoButton, gbc);
        numerosIntroducidosLabel.setLabelFor(numerosEntradaTextPane);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return GUI_main;
    }
}
