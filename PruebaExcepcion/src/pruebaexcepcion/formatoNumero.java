
package pruebaexcepcion;

    //excepción tratada
public static void formatoNumero(){
 
 int numero;   
 String cadena="  1";   
 	try{   
    		numero = Integer.parseInt(cadena);   
 	}   
 catch(NumberFormatException ex){   
 System.out.println("No es un número, es una cadena de texto."+ex.getMessage());   
    
 	}   
                 }
