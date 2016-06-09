package busqueda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("introduce el numero de elementos: ");
       int escribir = sc.nextInt();
       System.out.print("introduce el digito: ");
       int digito= sc.nextInt();
       
       
        
        int[] numeros = new int[escribir];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, digito, 0, numeros.length - 1);
        System.out.print("El indice del valor "+digito+" es: " + indice);
    }
//merge realizado
    //commit subido
    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
