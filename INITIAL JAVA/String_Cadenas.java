public class String_Cadenas {
    public static void main(String[] args) {

        // String (Cadenas) de java

    /*  Las cadenas se utilizan para almacenar texto.
        Una variable contiene una colección de caracteres entre comillas dobles:String

    */

        //Ejemplo: Cre una variable de tipo y asignale un valor: String
        String variableString = "dataVariable";
        System.out.println(variableString);


        /*  Logintud de la cadena
         
        Una cadena en Java es en realidad un objeto, que contiene métodos que pueden realizar ciertas operaciones en cadenas. 
        Por ejemplo, la longitud de una cadena se puede encontrar con el método:length()

        con el metodo:  length() podemos medir la longitud de una variable
        */

        
        //Ejemplo: 
        String txt = "validar metodo de impresion para la data variable";
        System.out.println("La longitud de la variable txt es: " + txt.length()); 
        //>>>La longitud de la variable txt es: 49



        /*  Mas metodos de Cadenas
         
        Hay muchos métodos de cadena disponibles, por ejemplo
        
         * toUpperCase()    ESTE METODO TRNASFORMA EL CONTENIDO DE UNA VARIABLE STRING EN TODAS LA LETRAS MAYUSCULAS 
         * toLowerCase()    
         
         */

         String txt_1 = "Hello";
         System.out.println(txt_1.toUpperCase());   //PALABRAS MAYUSCULAS
         System.out.println(txt_1.toLowerCase());   //PALABRAS MINUSCULAS
        

         /* Busqueda de caracter en una String (cadena) 
          
            El método devuelve el índice (la posición) de la primera aparición de un texto especificado en una cadena 
            (incluidos los espacios en blanco):indexOf()

            NOTA: Java cuenta las posiciones desde cero.
            0 es la primera posición en un cuerda, 1 es la segunda, 2 es la tercera...

         */

         //Ejemplo:
         String variable = "Donde esta ubicado el valor de la variable en la data?";
         System.out.println(variable.indexOf("valor"));
         //>>>22

        
    }
}
