public class Concatenacion {
    public static void main(String[] args) {
        
    /*  Concatenacion de String (cadenas) 
        
        El operador (+) se puede usar entre cadenas para combínalos. A esto se le llama concatenación:+
    */


        //Ejemplo:

        String name = "Jose";
        String surName = "Escalona";
        System.out.println(name +  " " + surName);


        //También se puede usar el método para concatenar dos cadenas: concat()
        //Ejemplo
        System.out.println(name.concat(" ").concat(surName));


        String Cifrax = "Cinco";
        String Cifray = "Cien";

        System.out.println(Cifrax.concat(Cifray));

    }
}
