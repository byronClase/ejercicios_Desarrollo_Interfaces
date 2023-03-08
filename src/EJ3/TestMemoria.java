package EJ3;

import javax.swing.*;

public class TestMemoria {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MemoriaVista();
            }
        });
    }
}
