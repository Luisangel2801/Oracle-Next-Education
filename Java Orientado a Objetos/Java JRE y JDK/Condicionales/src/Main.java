public class Main {
    public static void main(String[] args) {
        // Condicional if
        int edad = 17;
        int cantidad = 2;

        if(edad >= 18){
            System.out.println("Puedes entrar");
            System.out.println("Bienvenido");
        }else{
            if (cantidad >= 2){
                System.out.println("Es menor de edad pero puede ingresar");
            }else {
                System.out.println("Usted no está permitido");
            }
        }

    }
}
