public class Scope {
    public static void main(String[] args) {
        int edad = 21;
        int cantidadPersonas = 2;
        boolean esPareja = false;

        // Declarar una variable dentro las llaves de un bloque de código
        // hace que la variable solo exista dentro de ese bloque de código

        if (cantidadPersonas > 1){
            esPareja = true;
        }

        boolean puedeEntrar = edad >= 18 && esPareja;

        // Condicional if
        if(puedeEntrar){
            System.out.println("Puede entrar");
        }else{
            System.out.println("No puede entrar");
        }
    }
}
