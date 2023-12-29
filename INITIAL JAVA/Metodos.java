public class Metodos {
    public static void main(String[] args) {


/*    Metodos de tipos String
            METODOS                        |    Descripcion

        * charAt()                          | Devuelve el carácter en el índice (posición) especificado
        
        * codePointAt()                     |  Devuelve el Unicode del carácter en el índice especificado.
     
        * codePointBefore()                 |  Devuelve el Unicode del carácter antes del índice especificado.

        * codePointCount()                  |  Devuelve el número de valores Unicode encontrados en una cadena.

        * codePointCount()                  |  Compares two strings lexicographically	

        * compareToIgnoreCase()             |  Compara dos cadenas lexicográficamente, ignorando las diferencias entre mayúsculas y minúsculas.

        * concat()                          |  Agrega una cadena al final de otra cadena

        * contains()                        |  Comprueba si una cadena contiene una secuencia de caracteres

        * contentEquals()                   |  Comprueba si una cadena contiene exactamente la misma secuencia de caracteres del CharSequence o StringBuffer especificado

        * copyValueOf()                     |  Devuelve un String que representa los caracteres del array de caracteres

        * endsWith()                        | Checks whether a string ends with the specified character(s)	

        * equals()                          | Compares two strings. Returns true if the strings are equal, and false if not	

        * equalsIgnoreCase()                | Compara dos cadenas, ignorando consideraciones de mayúsculas y minúsculas

        * format()                          | Devuelve una cadena formateada utilizando la configuración regional, la cadena de formato y los argumentos especificados.

        * getBytes()                        | Codifica esta cadena en una secuencia de bytes utilizando el conjunto de caracteres nombrado, almacenando el resultado en una nueva matriz de bytes.

        * getChars()                        | Copia caracteres de una cadena a una matriz de caracteres

        * hashCode()                        | Devuelve el código hash de una cadena

        * indexOf()                         | Devuelve la posición de la primera aparición encontrada de caracteres especificados en una cadena

        * intern()                          | Devuelve la representación canónica del objeto de cadena.

        * isEmpty()                         | Comprueba si una cadena está vacía o no

        * lastIndexOf()                     | Devuelve la posición de la última aparición encontrada de caracteres especificados en una cadena

        * length()                          | Devuelve la longitud de una cadena especificada

        * matches()                         | Busca en una cadena una coincidencia con una expresión regular y devuelve las coincidencias.

        * offsetByCodePoints()              | Devuelve el índice dentro de esta cadena que está desplazado del índice dado por los puntos de código codePointOffset

        * regionMatches()                   | Prueba si dos regiones de cadena son iguales

        * replace()                         | Busca una cadena para un valor específico y devuelve una nueva cadena donde se reemplazan los valores especificados

        * replaceFirst()                    | Reemplaza la primera aparición de una subcadena que coincide con la expresión regular dada con el reemplazo dado

        * replaceAll()                      | Reemplaza cada subcadena de esta cadena que coincide con la expresión regular dada con el reemplazo dado

        * split()                           | Divide una cadena en una matriz de subcadenas

        * startsWith()                      | Comprueba si una cadena comienza con caracteres específicos

        * subSequence()                     | Devuelve una nueva secuencia de caracteres que es una subsecuencia de esta secuencia

        * substring()                       | Devuelve una nueva cadena que es la subcadena de una cadena especificada

        * toCharArray()                     | Converts this string to a new character array	

        * toLowerCase()                     | Convierte una cadena a letras minúsculas

        * toString()                        | Devuelve el valor de un objeto String

        * toUpperCase()                     | Convierte una cadena a letras mayúsculas

        * trim()                            | Elimina espacios en blanco de ambos extremos de una cadena.

        * valueOf()                         | Devuelve la representación de cadena del valor especificado.


*/              


        String variable = "Data variable valores asignados";

        System.out.println(variable.toUpperCase()); //>>>DATA VARIABLE VALORES ASIGNADOS

        System.out.println(variable.toLowerCase()); //>>>data variable valores asignados

        System.out.println(variable.length()); //>>>31

        System.out.println(variable.indexOf("valores"));    //>>>14



        //


    }
}
