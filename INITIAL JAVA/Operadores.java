public class Operadores {
    public static void main(String[] args) {

        //  Operadores Javas 

    // Los operadores se utilizan para realizar operaciones sobre variables y valores.

        //Ejemplo:
        int x = 100 + 50;
        System.out.println(x);
        System.out.println("__________________");

    /*Aunque el operador se usa a menudo para sumar dos valores, como en el ejemplo anterior, 
        también se puede usar para sumar una variable y un valor, o una variable y otra variable:+s
    */

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

    
        /*Java divide los Operadores en los siguientes Grupos 
         
         * Operadores aritmeticos 
         * Operadores de asignacion
         * Operadores de comparacion
         * Operadores logicos
         * Operadores bit a bit
        */ 

        /*Operadores aritmeticos
         
        Los operadores aritméticos se utilizan para realizar operaciones matemáticas comunes.

        Operator        name                        Descripcion                                          Ejemplo
        
        (+)             Suma
        (-)             Resta
        (*)             Multiplicacion
        (/)             Division
        (%)             Modulo                      (Devuelve el resto de la division)                     x % y
        (++)            Incremento                  (Aumenta el valor de una variable en 1)                ++x
        (--)            Decremento                  (Disminuye el valor de unavariable en 1)               --x


         */


         /*Operadores de asignacion de java
        
         Los operadores de asignación se utilizan para asignar valores a las variables.

        //En el siguiente ejemplo, usamos el operador de asignación () Para asignar el valor 10 a una variable llamada x:=

        int = x = 10;
        x += 5;

        Operator	    Example	        Same As	
        =	            x = 5	        x = 5	
        +=	            x += 3	        x = x + 3	
        -=	            x -= 3	        x = x - 3	
        *=	            x *= 3	        x = x * 3	
        /=	            x /= 3	        x = x / 3	
        %=	            x %= 3	        x = x % 3	
        &=	            x &= 3	        x = x & 3	
        =	            x |= 3	        x = x | 3	
        ^=	            x ^= 3	        x = x ^ 3	
        >>=	            x >>= 3	        x = x >> 3	
        <<=	            x <<= 3	        x = x << 3
                    
                          
         */



        /*Operadores de Comparacion 
          
        Los operadores de comparación se utilizan para comparar dos valores (o variables). Esto es importante en programación, 
        porque nos ayuda a encontrar respuestas y tomar decisiones.

        El valor devuelto de una comparación es o . Estos valores se conocen como valores booleanos, 
        y aprenderá más sobre ellos en los valores booleanos e if. Capítulo Else.truefalse

        En el siguiente ejemplo, usamos el operador mayor que () para averiguar si 5 es mayor que 3:>

        */

        //Ejemplo 01:
        int VariableI = 5;
        int VariableII = 3;
        System.out.println(VariableI > VariableII );
        //>>>true
 

        //Ejemplo 02:s
        int v_II = 10;
        int v_III = 10;
        System.out.println(v_II == v_III);
        //>>>true

        //Ejemplo 03:
        int a = 100;
        int b = 500;
        System.out.print(a >= b);
        //>>>false

        
        /* Operadores Logicos

        También puede probar los valores de or con operadores lógicos.truefalse
        Los operadores lógicos se utilizan para determinar la lógica entre variables o valores:

            imagen de muestra en la carpeta img
        */



    }
}
