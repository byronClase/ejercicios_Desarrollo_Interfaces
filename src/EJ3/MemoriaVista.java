package EJ3;

import javax.swing.*;
import java.awt.*;

public class MemoriaVista {

    JTextField pantalla;
    JTextField campoSalida1;//izquierda
    JTextField campoSalidaLabel1;//izquierda
    JTextField campoSalidaLabel2;//izquierda
    JTextField campoSalida2;//derecha
    JTextField campoResultado;//abajo ocupando toda las celdas
    JButton botonAddIzquierda;//abajo de la pantalla principal
    JButton botonDescartar;//abajo de la pantalla principal
    JButton botonAddDerecha;//abajo de la pantalla principal
    JFrame frame;
    public MemoriaVista(){
        crearVentana();
    }
    public void crearVentana(){
        JPanel panelPrincipal = new JPanel();//creo un panel
        panelPrincipal.setLayout(new GridBagLayout());//le doy la categoria de gridBagLayout
        GridBagConstraints c = new GridBagConstraints();//le asigno la capacidad de constraint

        c.fill = GridBagConstraints.HORIZONTAL;//le asigno un recorrido horizontal
        c.gridx = 0;//columna de la ventana como una cuadricula
        c.gridy = 0;//fila de la ventana como una cuadricula
        c.insets = new Insets(5, 5, 5, 5);//margenes a cada componente de la ventana

        ////////////////////////////TEXTFIELD PRINCIPAL
        c.gridwidth=3;
        pantalla = new JTextField();
        pantalla.setText("0");//le agrego un valor inicial
        panelPrincipal.add(pantalla, c);
        ///////////////////////////BOTON ADD IZQUIERDA
        c.gridy=1;//fila 1
        c.gridx=0;//columna 0
        c.gridwidth = 1; // Ocupa una sola celda
        c.gridheight = 1; // Ocupa una sola celda
        botonAddIzquierda = new JButton();
        botonAddIzquierda.setText("Añadir");
        panelPrincipal.add(botonAddIzquierda,c);
        //////////////////////////BOTON DESCARTAR
        //c.gridy=1;//fila 1
        c.gridx=1;//columna 1
        botonDescartar = new JButton();
        botonDescartar.setText("descartar");
        panelPrincipal.add(botonDescartar,c);
        /////////////////////////BOTON ADD DERECHA
        //c.gridy=1;//fila 1
        c.gridx=2;//columna 2
        botonAddDerecha = new JButton();
        botonAddDerecha.setText("Añadir");
        panelPrincipal.add(botonAddDerecha,c);
        ///////////////////////LABEL 1 IZQUIERDA
        c.gridy=2;//FILA
        c.gridx=0;//COLUMNA
        campoSalidaLabel1 = new JTextField("BARAJA 1");
        panelPrincipal.add(campoSalidaLabel1,c);
        ////////////////////////CAMPO 1 IZQUIERDA
        c.gridy=3;//FILA 3
        c.gridx=0;//COLUMNA 0
        campoSalida1 = new JTextField();
        panelPrincipal.add(campoSalida1, c);
        //////////////////////LABEL 2 DERECHA
        c.gridx=2;//FILA
        c.gridy=2;
        campoSalidaLabel2 = new JTextField("BARAJA 2");
        panelPrincipal.add(campoSalidaLabel2,c);
        ////////////////////////CAMPO 2 DERECHA
        c.gridy=3;//fila 3
        c.gridx=2;//columna 2
        campoSalida2 = new JTextField();
        panelPrincipal.add(campoSalida2, c);
        ///////////////////////CAMPO RESULTADO
        c.gridwidth=3;
        c.gridy=4;//fila 4
        c.gridx=0;//columna 0
        campoResultado = new JTextField();
        panelPrincipal.add(campoResultado, c);
        ////////////////////////////
        frame = new JFrame("Byron Saul Nasimba Nasimba - ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//si salgo de la ventana se termina su servicio
        frame.setContentPane(panelPrincipal);//le agrego contexto a mi frame
        frame.pack();//lo ajusto al tamaño de mis componentes
        frame.setVisible(true);//le doy visibilidad
    }

}
