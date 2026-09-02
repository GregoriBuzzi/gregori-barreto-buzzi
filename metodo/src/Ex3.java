import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        mostrarNumeros(numero);
    }

    public static void mostrarNumeros(int numero) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(numero + i);
        }
    }
}
