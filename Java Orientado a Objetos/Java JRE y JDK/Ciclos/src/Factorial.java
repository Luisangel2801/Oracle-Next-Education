public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int numero = 6;

        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
