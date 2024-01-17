    // fecha 13/12/23

/*  Variables en Javas

    Las variables son contenedores para alamacenar valores de datos
        TIPOS DE VARIABLES EN JAVA

            *String -- Almacena texto
            *int -- Almaena numeros enteros
            *float -- Almacena numeros de como flotante (desimales)
            *char -- Almacena caracteres inidividuales, como "a" o "b"
            *boolean -- Almacena valores con dos estados: Verdaderos o falso
  
 */



/*  Declarar (crear) variables 

    Para crear una variable, debe especificar el tipo y asignarle un valor
            EJEMPLO #01:
                type variableName = value;

            EJEMPLO #02:
                String variableI = "Desarrollo jdk"

            EJEMPLO #03:
                int id = 1010;

*/

public class Variables {
    public static void main(String[] agrs) {

        String nameI = "Jose Escalona";
        String nameII = "jescalona";
        int id = 1010;
        System.out.println(nameI);
        System.out.println(nameII);
        System.out.println(id);



/*  Variables finales
    
        Para evitar que otra persona cambie o sobrescriban los datos de una variable, 
        usamos la palabra clave "final", lo que significa inalterable y de solo lectura.

            EJEMPLO #01
                final int myNum = 15;
                myNum = 20;     //  generara un error por q no se puede remplazar el valor de la variable
*/
        final int myNum = 10;
 //     myNum = 15;   no se puede remplazar la variable
        System.out.println(myNum);

        System.out.println("______________________");

//  Impresion de otros tipos

        //EJEMPLO: #01
            int NumI = 550;
            float NumF = 10.5f;
            char NumChar = 'D';
            boolean myBool = true;
            String myText = "texto";

    
        System.out.println(NumI);
        System.out.println(NumF);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.print(NumChar);


        System.out.println("___________________________");


        // Declarar multiples variables 

       int y = 10, z = 15, q = 20;
       System.out.println(y + z + q);
       System.out.println("___________________");


       // Un valor para cada variables
       
       int o, p, m;
       o = p = m = 100;
       System.out.println(o + p + m);



















    }
}
