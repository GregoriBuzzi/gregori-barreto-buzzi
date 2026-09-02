import java.util.Scanner;

public class Exe3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número : ");
        int numero = input.nextInt();
    imprimir20Numeros(numero);
    }

    public static void imprimir20Numeros(int num) {

        for ( int i = num; i < num + 20; i++) {
            System.out.println(i);
        }


    }


}
