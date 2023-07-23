public class Main {
    public static void main(String[] args) {
        // Uso de la estructura while
        int contador = 0;
        int total = 0;
        // Mientras que contador sea menor que 10
        while (contador < 10) {
            total += contador;
            contador++;
        }
        System.out.println("El total es: " + total);
    }
}