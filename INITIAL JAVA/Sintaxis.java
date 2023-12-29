// Sintaxis Java    fecha 12/12/23

public class Sintaxis{
    public static void main(String[] args) {
        System.out.println("Ejemplo de primera sintaxis");
 

/* Para Imprimir el mensaje en pantalla se deben usar los siguientes comandos desde la consola
 * 
 *       javac nombre_de_clase.java  (este es para crear el compilador con formato .class)
 *       java nombre_de_clase        (este es para imprimir el compilado en panatalla)
 * 
 * #>>>Ejemplo de primera sintaxis
 */


 /*Cada línea de código que se ejecuta en Java debe estar dentro de un archivo . 
 En nuestro ejemplo, nombramos la clase Main. Una clase siempre debe comenzar con una primera letra mayúscula.class

 El nombre del archivo java debe coincidir con el nombre de la clase. Al guardar el archivo, 
 guárdelo con el nombre de la clase y agregue ".java" al final de el nombre del archivo.
 */


/* La palabra "public" esto se conoce en java como un modificador de accesos */


//15/12/23
/*  Proceso de edicion y compilacion 

    Java se basa en tres procesos antes de ejecutar la sentencia 
        1- Escribir el codigo fuente
        2- Debe pasar el codigo por un compilador se puede usar la consola aplicando el comando (javac nameArchivo.java)
        3- Programa de java compilado en Bytecode (Impresion en pantalla)
*/


/* 
    Mtedo: main()
    todos los programas java deben incluir el metodo main(). Este metodo indica las sentencias a realizar cuando se ejecuta un programa 
*/

/* Impresion en pantalla:
    Para escribir un mensaje por la consola se utilizan los metodos: 

    System.out.println()  // ESTO ES PARA ESCRBIR UN MENSAJE EN PANTALLA 

    System.out.print()   //ESTO IMPRIME EL MENSAJE EN PANTALLA  PERO EN LA MISMA LINEA  (SIN PASAR A LA SIGUIENTE LINEA)

    //Ejemplos:

    System.out.print("Hola");
    System.out.print(" ");
    System.out.print("Mundo");

    En este ejemplo se escribe el texto "Hola Mundo" en la pantalla. (sin salto de liena)
    #>>>Hola Mundo


    System.out.println();  //ESTO IMPRIME UN MENSAJE EN PANTALLA Y DA UN SALTO DE LINEA

    //Ejemplo:

    System.out.println("Hola");
    System.out.println("Mundo");
    
    #>>> Hola 
    #>>> Mundo
 */

 // Tipos de datos en java 
    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String

    System.out.println(myText + myBool + myLetter + myFloatNum + myNum);


        /*Tipos de datos no primitivos
    Los tipos de datos no primitivos se denominan tipos de referencia porque: se refieren a objetos.
    Las principales diferencias entre los tipos de datos primitivos y no primitivos son:
    
    Los tipos primitivos están predefinidos (ya definidos) en Java. 
    Los tipos no primitivos se pueden usar para llamar a métodos para realizar determinadas operaciones, mientrasque los tipos primitivos no.

    (Los tipos no primitivos son creados por el programador y no está definido por Java (excepto para ).String)

    Un tipo primitivo siempre tiene un valor, mientras que los tipos no primitivos pueden ser .null

    Un tipo primitivo comienza con una letra minúscula, mientras que los tipos no primitivos comienzan con una letra mayúscula.

    Ejemplos de tipos no primitivos son Strings, Arrays, Classes, Interface, etc. */




   }
}