public class BucleWhile {
    public static void main(String[] args) {

     

    /*  Bucles

        El bucle while en Java es una estructura de control que permite repetir una o más instrucciones mientras se cumpla una condición1. 
        Para usar el bucle while, se necesita una variable que controle el número de iteraciones, 
        una condición que evalúe el valor de la variable, y una o más instrucciones que se ejecuten dentro del bucle. 





        Los bucles pueden ejecutar un bloque de código siempre que se alcance una condición especificada.
        Los bucles son útiles porque ahorran tiempo, reducen los errores y crean código más legible. 

        Bucle while de Java
        El bucle recorre un bloque de código siempre que una condición especificada sea: while true


    */



    // En el ejemplo siguiente, el código del bucle se ejecutará, una y otra vez, siempre que Una variable (i) es menor que 5:

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }


        /*El bucle Do/While 
         
        El bucle es una variante del bucle. Este bucle ejecute el bloque de código una vez, 
        antes de verificar si la condición es verdadera, Repita el bucle siempre que la condición sea verdadera.do/whilewhile

        En el ejemplo siguiente se utiliza un bucle. 
        El bucle siempre será ejecutado al menos una vez, incluso si la condición es falsa, porque el bloque de código se ejecuta antes de probar la condición:do/while

        */

        int  o = 0;
        do {
            System.out.println(o);
            o++;
        }
        while (o < 5);

        //Imprima siempre que sea inferior a 6 
        int j = 1;
        while (j < 6) {
            System.out.print(j);
            j++;
        } //>>>12345

        
        //Para realizar bucles a la inversa se apleca una inversion 
        int x = 10;
        while (x >=1) {
            System.out.println(x);
            x--;
        }





    }
}