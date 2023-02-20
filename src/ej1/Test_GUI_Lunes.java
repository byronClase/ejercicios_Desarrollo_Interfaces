package ej1;

import javax.swing.*;

public class Test_GUI_Lunes extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GUI_Lunes();
                frame.setSize(400,300);
                frame.setVisible(true);
            }
        });
    }
}
