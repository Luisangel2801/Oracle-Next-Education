public class EjemploCondicionales2 {
    public static void main(String[] args) {
        int edad = 21;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;
        System.out.println("Valor de la condición " + esPareja);

        // Condicional if 
        if(puedeEntrar){
            System.out.println("Puede entrar");
        }else{
            System.out.println("No puede entrar");
        }
    }
}
