package ordinariaPsp;

import java.io.*;

public class LeerCalculadorabn {
    public static void main(String[] args) throws InterruptedException, IOException {
        File miDir = new File(".");
        System.out.println ("Directorio actual: " + miDir.getCanonicalPath());

        //creamos objeto File al directorio donde esta Ejemplo2
        File directorio = new File("./src/ordinariaPsp");

        //El proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java","Calculadorabn.java","suma");

        //se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

        System.out.printf("Directorio de trabajo: %s%n",pb.directory());
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);


        //se ejecuta el proceso
        Process p = pb.start();
        //Se pausa

        int tiempo = p.waitFor();
        System.out.println("Tiempo: "+ tiempo);

        //obtener la salida devuelta por el proceso
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(er));
            String liner = null;
            while((liner = brer.readLine()) != null) System.out.println("Error > " + liner);
        }catch (IOException ioe){ ioe.printStackTrace();}
    }
}
