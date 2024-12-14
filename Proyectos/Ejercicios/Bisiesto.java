import java.util.Scanner;                                                                                                                             
                                                                                                                                                      
public class DiaBisiesto{

        public static void main(String [] args){                                                                                                       
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Este programa sirve para saber si un año es bisiesto o no.");                                                                                                          
        System.out.print("Ingresa el año: ");                                                                
        
        int a = entrada.nextInt();                                                                                                                      
                                                                                                                                                      
        if ((a % 4 == 0) && (a % 100 != 0 || a / 400 == 0)){                                                                                 
                                                                                                                                                      
        System.out.println (a + " es bisiesto");                                                                                        
                                                                                                                                                      
        } else {
          
                System.out.println(a+" no es bisiesto");
          
        }//Fin if else es bisiesto 
          
    }//Fin main      
  
}//Fin class 
