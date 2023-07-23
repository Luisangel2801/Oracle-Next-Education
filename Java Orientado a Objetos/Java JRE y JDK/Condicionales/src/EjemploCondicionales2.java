public class EjemploCondicionales2 {
    public static void main(String[] args) {
        int edad = 21;
        int cantidadPersonas = 2;
        boolean esPareja = true;

        // Condicional if 
        if(edad >= 18 && esPareja){
            System.out.println("Puede entrar");
        }else{
            System.out.println("No puede entrar");
        }
    }
}
