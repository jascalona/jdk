//  18/12/23

public class Conversion {
    public static void main(String[] args) {

        //CONVERSIONES DE TIPOS JAVA

     /* La conversión de tipos se produce cuando se asigna un valor de un tipo de datos primitivo a otro tipo.

        En Java, hay dos tipos de casting:

        *Fundición de ensanchamiento (automáticamente): conversión de un tipo más pequeño a un tamaño de letra más grande
            byte -> short -> char -> int -> long -> float -> double

        *Fundición de estrechamiento (manualmente): conversión de un tipo más grande a un tipo de tamaño más pequeño
            double -> float -> long -> int -> char -> short -> byte
*/

//   Fundicion de ensanchamiento 
//  La funcion de ensanchamiento se realiza automaticamente al pasar un tipo de tamaño mas pequeño a un Tipo de tamaño mas grande:

        //Ejemplo:
        int myVariable = 9;
        double myDouble = myVariable; 
        
        System.out.println(myVariable);     //>>> 9
        System.out.println(myDouble);       //>>> 9.0

        //Procede a descomponerse en un decimal 


    } 
}
