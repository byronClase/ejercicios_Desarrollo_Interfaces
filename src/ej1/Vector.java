package ej1;

import java.util.ArrayList;
import java.util.Collections;

public class Vector {

    //He copiado el vector de Miguel Angel
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    int numeroRecogido;

    public Vector(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }


    public void escribirNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }


    //BOTONES


    public void annadir(int n) {
        numeros.add(n);
    }


    // Segundos botones

    public ArrayList<Integer> devuelveTodos() {
        return numeros;
    }


    public int cogerPrimero() {
        return numeros.get(0);
    }


    //Se supone que se tiene que imprimir en la ventana del controlador por lo que se devuelve
    public int cogerUltimo() {
        return numeros.get(numeros.size());
    }


    public void cambiarOrden() {
        Collections.reverse(numeros);
    }


    public void borrarUltimo() {
        numeros.remove(numeros.size());
    }


    public void borrarPrimero() {
        numeros.remove(0);
    }


    public void borrarMenor() {


        if (numeros.isEmpty()) {
            return;
        }


        int posicionMenor = 0;
        int valorMenor = numeros.get(0);


        for (int i = 1; i < numeros.size(); i++) {
            int valorActual = numeros.get(i);
            if (valorActual < valorMenor) {
                valorMenor = valorActual;
                posicionMenor = i;
            }
        }


        numeros.remove(posicionMenor);


    }


    public void borrarMayor() {


        if (numeros.isEmpty()) {
            return;
        }


        int posicionMayor = 0;
        int valorMayor = numeros.get(0);


        for (int i = 1; i < numeros.size(); i++) {
            int valorActual = numeros.get(i);
            if (valorActual > valorMayor) {
                valorMayor = valorActual;
                posicionMayor = i;
            }
        }


        numeros.remove(posicionMayor);
    }


}
