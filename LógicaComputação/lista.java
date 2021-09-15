package listas;

import java.util.ArrayList;


public class LISTAS {
 ArrayList<String> lista = new ArrayList<>();
    
    public static void main(String[] args) {
     
            ArrayList<String> lista = new ArrayList<>();
            
           String a = "produto"; 
               lista.add("carro");
               lista.add(a);
               lista.add("maçã");
               lista.add("frango");
               lista.add("açúcar");
               lista.add("foguete");
               lista.add("azeite");
               lista.add("ogiva");
               lista.add("galaxia");
               lista.remove("maçã");
               imprimeLista(lista);
               
    }
    public static void imprimeLista( ArrayList<String> lista){
        for(String s:lista){
            System.out.println(s);
        }
        System.out.println("_______");
    } 
}
