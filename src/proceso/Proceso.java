package proceso;

import java.io.File;
import java.util.Scanner;

public class Proceso {
    private String[] lineas;
    private String[] palabra;
    
    public Proceso(String url) throws Exception{
        String []a = this.leerLinea(this.abrirArchivo(url));
        this.separar(a);
    }
    
    private Scanner abrirArchivo(String url) throws Exception{
        File doc = new File(url);
        Scanner obj = new Scanner(doc);
        return obj;
    }
    
    private String[] leerLinea(Scanner objeto){
        while(objeto.hasNextLine()){
            this.lineas = objeto.nextLine().split(";");
        }
        
        return this.lineas;
    }
    
    private void separar(String lineas[]){
        for(String a : lineas){
            for(int x=0; x < a.length(); x++){
                this.palabra = a.split(" ");
            }
        }
        
        for(String j : this.palabra){
            System.out.println(j);
        }
    }
}
