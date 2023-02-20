package aspecto1;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Aspecto 1 Nicole y Raúl");
        this.getContentPane().setLayout (new GridBagLayout()); // Le ponemos el GridBagLayout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField areaTexto = new JTextField ("Escribe Número");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa dos columnas.
        constraints.gridheight = 1; // El área de texto ocupa 2 filas.
        this.getContentPane().add (areaTexto, constraints);



        // Panel central con los botones
        JPanel panelCentral = new JPanel(new GridLayout(3, 3));
        JButton boton1 = new JButton ("Boton 1");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton1, constraints);

        JButton boton2 = new JButton ("Boton 2");
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton2, constraints);

        JButton boton3 = new JButton ("Boton 3");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton3, constraints);

        JLabel campoTexto = new JLabel ("OutPut1");
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (campoTexto, constraints);


        // Panel principal que contiene los tres paneles anteriores
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        // Agregamos el panel principal a la ventana
        add(panelPrincipal);

        JButton boton4 = new JButton ("Boton 4");
        constraints.gridx = 5;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton4, constraints);

        JButton boton5 = new JButton ("Boton 5");
        constraints.gridx = 5;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton5, constraints);

        JButton boton6 = new JButton ("Boton 6");
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton6, constraints);

        JLabel campoTexto2 = new JLabel ("OutPut2");
        constraints.gridx = 6;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (campoTexto2, constraints);

        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new Ventana();
    }

}
