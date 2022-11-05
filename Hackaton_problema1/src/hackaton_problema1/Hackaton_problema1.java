/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton_problema1;

import java.util.Scanner;

/**
 * 
 * Programa realizado para calcular las operaciones de suma y resta en base binario, 
 * decimal y hexadecimal según el usuario.
 * @author megan
 */
public class Hackaton_problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido
        Scanner sc = new Scanner(System.in);
        int operacion = 0;
        int base = 0;
        // Imprimir menu
        while(true){
            try{
                System.out.println("""
                                   ==========MENU==========
                                   Presione
                                   (1) Sumar
                                   (2) Restar
                                   """);
                // entrada de una cadena
                int entrada = Integer.valueOf(sc.nextLine());
                switch (entrada){
                    case 1:
                        System.out.println("Escogio la opción SUMAR");
                        operacion = 1;
                        break;
                    case 2:
                        System.out.println("Escogio la opción RESTAR");
                        operacion = 2;
                        break;
                    default:
                        System.out.println("Entrada no válida.");
                        base = 0;
                        continue;
                }
                System.out.println("""
                                   ==========MENU==========
                                   Presione
                                   (1) Binario
                                   (2) Decimal
                                   (3) Hexadecimal
                                   """);
                // entrada de una cadena
                entrada = Integer.valueOf(sc.nextLine());
                switch (entrada){
                    case 1:
                        System.out.println("Escogio la opción BINARIO");
                        base = 1;
                        break;
                    case 2:
                        System.out.println("Escogio la opción DECIMAL");
                        base = 2;
                        break;
                    case 3: 
                        System.out.println("Escogio la opción HEXADECIMAL");
                        base = 3;
                        break;
                    default:
                        System.out.println("Entrada no válida.");
                        base = 0;
                        continue;
                }
                System.out.println("Ingresar numero 1: ");
                String numero1 = (sc.nextLine());
                System.out.println("Ingresar numero 2: ");
                String numero2 = (sc.nextLine());
                // Realizar el calculo con los datos
                int resultado = calcularNumeros(operacion, base, numero1, numero2);
                
                //Imprimir resultados
                System.out.println("El resultado en decimal: "+resultado);
                String resultado_Hex = Integer.toString(resultado, 16);
                System.out.println("El resultado en hexadecimal: "+resultado_Hex);
                String resultado_Bin = Integer.toString(resultado, 2);
                System.out.println("El resultado en binario: "+resultado_Bin);
                
                
            }catch(Exception e){
                System.out.println("Posible error, verifique sus entradas");
            }
        }
    }
    /**
     * Método para calcular dos números como entradad en la base que se seleccione
     * @param operacion (1) -> Suma, (2) -> Resta
     * * @param base (1) -> binario, (2) -> decimal, (3) -> hexadecimal
     * @param numero1 numero en la base especificada, sino saltara un error seguramente.
     * @param numero2 numero en la base especificada, sino saltara un error seguramente.
     * @return 
     */
    public static int calcularNumeros(int operacion, int base, String numero1, String numero2){
        int resultado = 0;
        if(operacion != 0 || base != 0){
            int numero1_valor = 0, numero2_valor = 0;
            switch (base){
                //Caso binario
                case 1:
                    numero1_valor = Integer.parseInt(numero1, 2);
                    numero2_valor = Integer.parseInt(numero2, 2);
                    break;
                //Caso decimal
                case 2:
                    numero1_valor = Integer.parseInt(numero1, 10);
                    numero2_valor = Integer.parseInt(numero2, 10);
                    break;
                //Caso hexadecimal
                case 3:
                    numero1_valor = Integer.parseInt(numero1, 16);
                    numero2_valor = Integer.parseInt(numero2, 16);
                    break;
            }
            
            switch(operacion){
                //suma
                case 1:
                    resultado = numero1_valor+numero2_valor;
                    break;
                // resta
                case 2:
                    resultado = numero1_valor -numero2_valor;
                    break;
            }
            return resultado;
        }else{
            System.out.println("Entradas no validas.");
            return 0;
        }
    }       
}
