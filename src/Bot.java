import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        String name = scanner.nextLine();

        System.out.println("\nHola "+ name +"! Soy Rocío. ¿De qué ciudad eres?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        String city = scanner.nextLine();

        System.out.println("He escuchado que " + city + " es un encanto. Yo nací en El Prat de Llobregat.");
        System.out.println("\n¿Cuántos años tienes?");

        //Recoge el dato
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        int age = scanner.nextInt();

        System.out.println("\nEntonces me dices que tienes " + age + " años. Yo tengo 27 años.");
        System.out.println("Eso quiere decir que soy " + (27 / age) + " veces más vieja que tú.");

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println("\nBasta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        //Añade una nueva línea.

        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println("\n" + language + ", ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner
        scanner.close();


    }
}