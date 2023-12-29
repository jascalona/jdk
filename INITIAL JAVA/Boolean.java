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





         */

    }
}
