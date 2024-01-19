public class BucleFor {
    public static void main(String[]args) {

        /*
        Bucle For es mejor que Bucle while

        Cuando sepas exactamente cuántas veces quieres recorrer un bloque de código, use el bucle en lugar de un bucle:forwhile

        Un bucle for es una estructura de control que permite repetir un bloque de código un número fijo de veces. 
        Se utiliza una variable iteradora que se inicializa, se incrementa y se evalúa según una condición booleana. 
        El bucle for se escribe con la palabra clave for y un paréntesis que contiene las tres partes de la iteración4.

        *La instrucción 1 se ejecuta (una vez) antes de la ejecución del bloque de código.

        *La instrucción 2 define la condición para ejecutar el bloque de código.

        *La instrucción 3 se ejecuta (cada vez) después de que se haya ejecutado el bloque de código.

        */

        // Bucle for: Se usa para recorrido de vectores y matrices estas son controladas por un contador
        
         //En el siguiente ejemplo se imprimirán los números del 0 al 4
         for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }


        /*  Esta compuesta por tres partes:
         
         * Inicializacion de la variable: que utilazamos en acondicion (se ejecuta solo una vez al principio del ciclo)
            Ejem: int i=0;

         * Condicion de fin del ciclo: se evalua esta expresion a comienzo de cada iteracion (fin de ciclo)
            Ejem: i<=10;

         * Modificacion de la variable: se ejecuta al final de cada iteracion (incremento o decremento)
            Ejem: i++ // i--
         
         */

         //Ejemplo:
         for(int k = 0; k <= 10; k++) {
            //Sentencia
            System.out.println(k);
         }

         //Ejemplo 2
         for(int contador = 0; contador <= 10; contador++){
            System.out.println("Listado numero: " + contador);
         }


         //Ejemplo 3 
         for(int lista = 1; lista <= 20; lista++) {
            System.out.println("Listado de Alumnos: " + lista);
         }
       


         String[] cars = {"Corola", "Aveo", "Ford", "Machito"};
         for(String a: cars) {
            System.out.println(a);
         }



    }
}
