package EJ3;

import java.util.ArrayList;

public class MemoriaModelo {

    ArrayList<Integer> numeros;

    public MemoriaModelo(){
        new ArrayList<Integer>(12);
    }
    public void cargarNumero(Integer numero){
        numeros.add(numero);
    }

    public ArrayList<Integer> devuelveTodos() {
        return numeros;
    }
}
