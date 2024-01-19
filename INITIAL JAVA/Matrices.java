public class Matrices {
    public static void main(String[]args) {

        /*

        Las matrices se utilizan para almacenar varios valores en una sola variable, en lugar de declarar variables separadas para cada una valor.
        Para declarar una matriz, defina el tipo de variable entre corchetes:
        
        Ejemplo: String[] Carros;

        Ahora hemos declarado una variable que contiene una matriz de cadenas. Para insertar valores, puede colocar los valores en un archivo Lista separada por comas, dentro de llaves:

        Ejemplo: String[] carros = {"Ford", "Aveo", "Corsa"};

        Para escribir una matriz de numeros enteros, puedes escribir:

        int[] numeros = {1, 2, 3, 4};

        */

        /* Acceder a los elements de una Matriz
         
        Puede acceder a un elemento de matriz haciendo referencia al número de índice.

        Esta instrucción accede al valor del primer elemento en cars:
         */

        String[] cars = {"Aveo", "Corsa", "Ford", "fia"};
        System.out.println(cars[3]);
        //>>>fia


        String[] carro = {"Volvo", "BMW", "Ford", "Mazda"};
        carro[0] = "Toyota"; // se cambio el valor Volvo por la nueva declaracion Toyota
        System.out.println(carro[0]);
        //Toyota

        /*  Longitud de la Matriz

            Para averiguar cuántos elementos tiene una matriz, use la propiedad: length
         */

        String[] Motos = {"Owen", "Suzuki", "Horse"};
        System.out.println("La cantidad de letras de Suzuki son: " + Motos[1].length()); 
        //>>>Suzuki: 6 letras


        //  Bucles atravez de Matrices

        /*  Puede recorrer en bucle los elementos de la matriz con el bucle y utilizar la propiedad para especificar 
            cuántas veces debe ejecutarse el bucle.forlength

            En el ejemplo siguiente se muestran todos los elementos de la matriz cars: */

            String[] laptops = {"Lenovo", "dell", "asus", "acer"};
            for(int contador = 0; contador < laptops.length; contador ++ ) {
                System.out.println(laptops[contador]);
            }


            // Matrices Multidimencionales

            /*
             Una matriz multidimensional es una matriz de matrices.

            Las matrices multidimensionales son útiles cuando se desea almacenar datos como una forma tabular, como una tabla con filas y columnas.

            Para crear una matriz bidimensional, agregue cada matriz dentro de su propio conjunto de llaves:

             */

            int [][] Num = { {1,2,3,4}, {5,6,7}};

            // https://www.w3schools.com/java/java_arrays_loop.asp

    }
}
