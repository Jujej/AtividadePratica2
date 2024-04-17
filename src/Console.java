import java.util.Scanner;

public class Console {

    private static Scanner scan = new Scanner(System.in); // o private bloqueia que outra classe consiga acessar

    public static int lerInt() {
        int valor = scan.nextInt();
        scan.nextLine();
        return valor;
    }

    public static String lerString() {
        String txt = scan.nextLine();
        return txt;
    }

    public static float lerFloat() {
        float valor = scan.nextFloat();
        scan.nextLine();
        return valor;
    }

}