package aspecto2;

import javax.swing.*;
import java.awt.*;

public class Aspecto2 extends JFrame{
    JTextField input;
    JTextArea numCargados, numPrint;
    JButton cargarSinBorrar, cargarYBorrar, borrar, impTodos, impUno, cambiarOrden, borrarUltimo, borrarPrimero,
            borrarNumMenor, borrarNumMayor;
    GridBagConstraints rest;

    public Aspecto2() {
        super("GUI: Aspecto Nº2");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        rest = new GridBagConstraints();
        rest.insets = new Insets(7, 7, 7, 7);

        // Input de usuario

        JLabel usuario = new JLabel("Ponga un número:");
        rest.gridx = 0;
        rest.gridy = 0;
        panel.add(usuario, rest);

        input = new JTextField(30);
        rest.gridx = 0;
        rest.gridy = 1;
        rest.gridwidth = 3;
        panel.add(input, rest);
        rest.gridwidth = 1;

        // Botones de carga

        cargarSinBorrar = new JButton("Cargar sin borrar");
        rest.gridx = 0;
        rest.gridy = 2;
        panel.add(cargarSinBorrar, rest);

        cargarYBorrar = new JButton("Cargar y borrar");
        rest.gridx = 1;
        rest.gridy = 2;
        panel.add(cargarYBorrar, rest);

        borrar = new JButton("Borrar");
        rest.gridx = 2;
        rest.gridy = 2;
        panel.add(borrar, rest);

        // Output de números cargados

        JLabel LabelNumCargados = new JLabel("Números cargados:");
        rest.gridx = 0;
        rest.gridy = 3;
        panel.add(LabelNumCargados, rest);

        numCargados = new JTextArea(10, 30);
        numCargados.setEditable(false);
        JScrollPane desliza = new JScrollPane(numCargados);
        rest.gridx = 0;
        rest.gridy = 4;
        rest.gridwidth = 3;
        panel.add(desliza, rest);
        rest.gridwidth = 1;
        setContentPane(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Aspecto2();
    }


}
