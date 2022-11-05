/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton_problema2;

import java.util.Scanner;

/**
 *Programa que cuenta las vocales de una cadena de entrada
 * @author megan
 */
public class Hackaton_problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Ingrese una cadena");    //imprimo mensaje para desplegar
        Scanner cadena = new Scanner(System.in);     //recibo el texto de entrada
        String entrada = (cadena.nextLine());
        String cadenaLower = entrada.toLowerCase();
        char[] cadenaEntrada =  cadenaLower.toCharArray();  //lo convierto en array
        int contadorVocales = 0;
        
        
        for(int i= 0; i < cadenaLower.length(); i++ ){ // recorro el array de chars y lo comparo 
            
            if(cadenaEntrada[i] == 'a' ||cadenaEntrada[i] == 'e'||cadenaEntrada[i] == 'i'||cadenaEntrada[i] == 'o' ||cadenaEntrada[i] == 'u'){
                contadorVocales++;
            }
        }
        System.out.println(contadorVocales);     // imprimir el resultado
    }
    
}
