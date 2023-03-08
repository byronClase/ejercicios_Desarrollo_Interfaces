package ordinariaPsp;

import java.io.*;
import java.util.Scanner;

public class Calculadorabn {


    public static void operacion(String operacion) throws IOException {
        Scanner sc = new Scanner(System.in);
        double resultado =0;
        /*DataInputStream in = new DataInputStream(new BufferedInputStream(System.in));*/
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        System.out.println("Introduce numeros para las operaciones:");
        System.out.print("num1: ");
        String num1 = br.readLine();

        System.out.print("num2: ");
        String num2 = br.readLine();

        /*double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();*/

        if(operacion.isEmpty()){
            System.err.println("Falta el args[0] que determina la operacion que se va a realizar");
            System.exit(1);
        }else{
            if(operacion.equalsIgnoreCase("Suma")){
                resultado = Double.parseDouble(num1)+Double.parseDouble(num2);
                System.out.println("OPERACION: suma -> "+num1+" + "+num2+" = "+resultado);
                System.exit(0);
            }else if(operacion.equalsIgnoreCase("Resta")){
                //resultado = num1-num2;
                System.out.println("OPERACION: resta -> "+num1+" - "+num2+" = "+resultado);
                System.exit(0);
            } else if (operacion.equalsIgnoreCase("Multiplicacion")) {
                //resultado = num1*num2;
                System.out.println("OPERACION: multiplicacion -> "+num1+" * "+num2+" = "+resultado);
                System.exit(0);
            } else if (operacion.equalsIgnoreCase("Division")) {
                //resultado = num1/num2;
                System.out.println("OPERACION: division -> "+num1+" / "+num2+" = "+resultado);
                System.exit(0);
            } else if (operacion.equalsIgnoreCase("Modulo")) {
                //resultado = num1%num2;
                System.out.println("OPERACION: division -> "+num1+" mod "+num2+" = "+resultado);
                System.exit(0);
            }else{
                System.err.println("No es ninguna de las operacion posibles");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        if(args.length==0){
            System.err.println("No pueden estar los argumentos vacios");
        }else{
            operacion(args[0]);
        }

    }
}
