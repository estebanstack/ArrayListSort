package ejercicio;

import java.util.ArrayList;

public class Main {
        static ArrayList<Integer> lista=new ArrayList<>();

    public static void main(String[] args) {
        llenarArreglo();
        for(int i =0;i<10;i++){
            System.out.println(lista.get(i));
        }
    }

    public static void llenarArreglo(){
        for(int i=0;i<10;i++){
            Integer numero= (int) (Math.random()*30);
            lista.add(numero);

        }
        lista.reversed().sort(null);
    }
}