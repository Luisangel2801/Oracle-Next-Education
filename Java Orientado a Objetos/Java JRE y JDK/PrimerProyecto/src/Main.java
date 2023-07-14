public class Main {
    public static void main(String[] args) {
        int edad = 23;                              // variable de tipo entero
        System.out.println("edad: " + edad);
        edad = 22 + 45;
        System.out.println("edad: " + edad);
        double salario = 1250.50;                   // variable de tipo flotante
        System.out.println("Salario: " + salario);

        // Conversiones
        double variableDecimal = 10.84;
        int variableEntero = (int)variableDecimal;  // Cast
        System.out.println("moldeo: " + variableEntero);

        // Manejo de caracteres
        char caracter = '@';
        System.out.println(caracter);
        caracter = 65;
        System.out.println(caracter);
        caracter = (char)(caracter + 1);            // Cast
        System.out.println(caracter);

        // Manejo de cadenas de caracteres
        String palabra = "Alura Cursos";
        System.out.println(palabra + " ONE");
    }
}