import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String name = scanner.nextLine();

        System.out.println("\n¿Cuál es tu apellido?");
        String lastname = scanner.nextLine();

        System.out.println("\n¿Cuál es tu nombre de usuario?");
        String username = scanner.nextLine();

        System.out.println("\n¿Cuál es tu contraseña?");
        String password = scanner.nextLine();


        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        System.out.println("\nHola "+ name + " " + lastname + ", tu nombre de usuario es " + username + " y tu contraseña es " + password + ", gracias por registrarte.");

        scanner.close();
    }
}