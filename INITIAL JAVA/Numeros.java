public class Numeros {
    public static void main(String[] args) {

        /*Numeros en JAVA 
         
        Los tipos de números primitivos se dividen en dos grupos:
        Los tipos enteros almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son , y . 
        El tipo que debe usar depende del valor numérico.byteshortintlong
        Los tipos de coma flotante representan números con una parte fraccionaria, que contenga uno o más decimales. Hay dos tipos: y .floatdouble
        A pesar de que hay muchos tipos numéricos en Java, el más utilizado para los números are (para números enteros) y (para números de coma flotante).
        Sin embargo, los describiremos todos a medida que continúe leer.intdouble
        */

        // Tipos Enteros

        //  Byte
        /*El tipo de datos puede almacenar números enteros de -128 a 127. 
        Esto se puede usar en lugar de u otros tipos enteros para Guarde memoria cuando esté seguro de que el valor estará entre -128 y 127:byteint */
        
        byte numByte = -128;
        System.out.println(numByte);


        //  short 
        //El tipo de dato puede almacenar números enteros de -32168 a 32767

        short numShort = -5000;
        System.out.println(numShort);

        //  int
        /*El tipo de datos puede almacenar números enteros de -2147483648 a 2147483647. En general, y en nuestro tutorial, 
        el tipo de datos es El tipo de datos preferido cuando creamos variables con un valor numérico.intint */

        int numInt = 100000;
        int numInt2 = -100000;
        System.out.println(numInt);
        System.out.println(numInt2);

        //  long
        /*El tipo de datos puede almacenar números enteros de -9223372036854775808 a 9223372036854775807. 
        Esto se usa cuando int no es lo suficientemente grande como para almacenar el valor. Tenga en cuenta que debe terminar el valor con una "L":long */

        long numLong = 15000000000L;
        System.out.println(numLong);



        // Tipos de Coma Flotante

        /*Debe usar un tipo de punto flotante siempre que necesite un número con un decimal, como 9,99 o 3,14515.
        Los tipos de datos y pueden almacenar números fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para los flotantes
        y una "d" para los dobles:floatdouble */
    
        //Ejemplo de flotacion
        float numFloat = 5.75f;         //PARA USAR ESTA FUNCION LA MISMA DEBE TERMINAR SIEMPRE EN "f"
        System.out.println(numFloat);


        //Doble ejemplo
        double numDouble = 19.99d;         //PARA USAR ESTA FUNCION LA MISMA DEBE TERMINAR SIEMPRE EN "d"
        System.out.println(numDouble);
    
    
    

        // Numeros y Cadenas en JAVA
       
       // Si sumas dos números, el resultado será un número:

        int var1 = 10;
        int var2 = 20;
        int var3 = var1 + var2; // SE PUEDE ALAMACENAR LA SUMA DE OTRAS VARIABLES
        System.out.println(var3);


    // Si agrega un número y una cadena, el resultado será una concatenación de cadenas:

        String Var1 = "10";
        int Var2 = 20;
        String x = Var1 + Var2;
        System.out.println(x);

    
        System.out.println("\fUsuario: Jescalona");
        System.out.println("_______________________");

        // NUMEROS ALETORIOS 

        /*  METODO Math.Random()

        Para obtener mas control sobre el numero aletorio, por ejemplo, si solo desea un numero entre 0 y 100, se puede utilizar la siguiente formula:
        */
                int variableRandom = (int)(Math.random() *101); 
                System.out.println(variableRandom);

    }
}
