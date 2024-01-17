//  18/12/23

public class Boolean {
    public static void main(String[] args) {


        /*   Muy a menudo, en programación, necesitará un tipo de datos que solo pueda tener uno de dos valores, como:
                SÍ / NO
                ENCENDIDO / APAGADO
                VERDADERO / FALSO

            Para ello, Java tiene un tipo de datos, que solo puede tomar los valores o :booleantruefalse
         */

         //Ejemplo
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //Los valores booleanos se utilizan principalmente para pruebas condicionales.


        /*19/12/23
         
        Muy a menudo, en programación, necesitará un tipo de datos que solo puede tener uno de dos valores, como:

        SÍ / NO
        ENCENDIDO / APAGADO
        VERDADERO / FALSO
        Para ello, Java tiene un tipo de datos, que puede almacenar o valores.booleantruefalse


        EXPRESION BOOLEANA

        Una expresion booleana devuelve un valor booleano: o true false
        Esto es utilizado para construir logica y encontrar respuestas 

        Por ejemplo, puede utilizar un operador de comparación, como el operador mayor que (), 
        para averiguar si una expresión (o una variable) es verdadera o falsa:>


         */

        //Ejemplo:

        int variableBoolean = 100;
        int variableBoolean2 = 200;
        System.out.println(variableBoolean2 >= variableBoolean);

        String variableStr = "Jose";
        String variableStr2 = "Abraham";
        System.out.println(variableStr == variableStr2);


        //Ejemplo: con las funciones if y else
    //Salida "¡Edad suficiente para votar!" si es mayor o igual que . De lo contrario, genere "No tiene edad suficiente para votar"


        int mayorEdad = 20;
        int menorEdad = 17;

        if (mayorEdad <= menorEdad) {   // Si mayorEdad es IGUAL O MAYOR  a menorEdad  va imprimir el "if" 
            System.out.println("Tiene edad suficiente");
        } else {
            System.out.println("No tiene edad sufuciente"); // Si mayorEdad es IGUAL O MENOR A menorEdad va a imprimir el "else"
        }




        /* JAVA SI (if)... 
         
        Condiciones de Java y Sentencias (if) 

        Menor que: a < b
        Menor o igual que: a <= b
        Mayor que: a > b
        Mayor o igual que: a >= b
        Igual a a == b
        No es igual a: a != b


        Java tiene las siguientes sentencias condicionales:

       * Se utiliza para especificar un bloque de código que se va a ejecutar, si una condición especificada es verdadera if
       * Se utiliza para especificar un bloque de código que se va a ejecutar, si la misma condición es falsa else
       * Se usa para especificar una nueva condición para probar, si la primera condición es falsa else if
       * Se utiliza para especificar muchos bloques de código alternativos que se van a ejecutar switch

         */
        
        /*  Sisntaxis          
        if (condicion) {} // codigo que se ejecuta si la condision es verdadera
        */

        // En el siguinete ejemplo probamos dos valores para averiguar si 100 es mayor que 80 

        if (100 > 80) { // si 100 es mayor 80 va a imprimir el mensaje de abajo
            System.out.println("100 es mayor que 80 !" );
        }

        // Ejemplos con variables

        int var01_if = 20;
        int var02_if = 50;
        if (var01_if < var02_if) {  // si 20 es menor que 50 va a imprimir el mensaje de abajo. 
            System.out.println("la variable 01 es mayor que la variable 02 ! " );
        } 

        
        int var03_if = 400;
        int var04_if = 500;
        if  (var03_if >= var04_if) {
            System.out.println("La variable 03 es mayor que la variable 04 !!!");
        } else {
        System.out.println("la variable 03 no es mayor que la variable 04 !!!");
        }


        /* Setencia else
         
        Utilice la instrucción para especificar un bloque de código que se ejecutará si la condición es .elsefalse
        
        Sinstaxis
         if (condicion) {
            codigo que se ejecuta solo si la condicion es verdadera 
         } else {
            codigo que se ejecuta solo si la condicion es falsa
         }
 */

        int variable_else01 = 100;
        int variable_else02 = 20;
        if (variable_else01 < variable_else02) {
            System.out.println("100 es menor que 20");
        } else {
            System.out.println("100 no es menor que 20");
        }


        /* Sentencia else if 
        Utilice la instrucion para especificar una nueva condicion si la primera condicion es .else if false
        
        Sintaxis

        if (condicion1) {
            codigo que se ejecuta si la condicion es verdadera
        
        } else if (condicion2) {
            codigo que se ejecuta si la condicion1 es falsa y la condicion2 es verdadera 
        
        } else {
            codigo que se ejecuta solo si la condicion1 y la condicion2 son falsas
        }

        */

        //Ejemplo.

        int tempo = 22; 
        if (tempo < 10) {
            System.out.println("Buenos dias");
        } else if (tempo < 18) {
            System.out.println("Buen dia");
        }else {
            System.out.println("Buenas noches");
        }

        /*En el ejemplo anterior, el tiempo (22) es mayor que 10, por lo que la primera condición es . 
        La siguiente condición, en la instrucción, también es , por lo que pasamos a la condición, 
        ya que la condición1 y la condición2 son ambas, e imprimimos en la pantalla "Bueno noche".falseelse iffalseelsefalse
        
        Sin embargo, si la hora era 14, nuestro programa imprimiría "Buen día".
        */

        int Cifrax = 100;
        int Cifray = 100;

        if (Cifrax == Cifray){
            System.out.println("Amabas Cifras tienen la misma Cantidad");
        } else {
            System.out.println("Las Cifras son deciguales");
        }

    }
}
