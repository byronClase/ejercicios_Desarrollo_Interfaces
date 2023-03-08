package EJ3;

import javax.swing.*;

public class MemoriaControlador {

    public final MemoriaModelo mmodelo;

    public MemoriaControlador(MemoriaModelo mmodelo) {
        this.mmodelo = mmodelo;
    }

    /*public void cargarNumero(JFrame frame, JTextField input, JTextField input2) {
        try {
            int numero = Integer.parseInt(input.getText());//recojo el numero en el input1 o input2
            int numero2 = Integer.parseInt(input2.getText());//recojo el numero en el input1 o input2
            mmodelo.a(numero);//lo guardo en mi arrayList
            mmodelo.agregarNumero(numero2);//lo guardo en mi arrayList
            input.setText("cargado");//vacio mi input despues de guardarlo
            input2.setText("cargado");//vacio mi input despues de guardarlo
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Debe ingresar un número entero válido");
        }
    }//ME QUEDO CON EL NUMERO EN INPUT1 E INPUT2*/
    public void limpiarPantalla(JTextField input, JTextField input2) {
        input.setText("");
        input2.setText("");
        //vacio mis input con espacios en blanco para ello le paso mis JTextField
    }
}
