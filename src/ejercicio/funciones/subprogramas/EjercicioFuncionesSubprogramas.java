/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.funciones.subprogramas;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 *
 * @author Ivan Ramirez
 */
public class EjercicioFuncionesSubprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leersecuencia = new Scanner(System.in);
        
        System.out.println("Ingrese una secuencia de caracteres");
        String secuencia = leersecuencia.nextLine();
        String nuevasecuencia;
       
        nuevasecuencia = reemplazo(secuencia);  //llamado a la funcion "reemplazo"
        //System.out.println(nuevasecuencia);
    }
        public static String reemplazo(String secuencia) {   //este procedimiento tipo void no devuelve ningun valor
       
            
            String salida, letra = "null";
            int longitud;
            
            longitud = secuencia.length();
             
            
            for (int i = 0; i < longitud; i++) {
                 
                letra = secuencia.substring(i, i+1);
                
                switch (letra){
                    
                    case "a" :
                        letra = "@";
                    break;  
                    
                    case "e" :
                        letra = "#";
                    break; 
                    
                    case "i" :
                        letra = "$";
                    break; 
                    
                    case "o" :
                        letra = "%";
                    break; 
                    
                    case "u" :
                        letra = "*";
                    break; 
                    
                    default:
                        letra = secuencia.substring(i, i+1);   
                }
                
                
                System.out.print(letra);
                
            }
            salida = letra;
            return salida;
     
            } 
}            
        

        
                     

   

