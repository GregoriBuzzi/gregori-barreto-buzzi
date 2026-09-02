import java.util.Scanner;

public class Metodo01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a estação do ano : ");

        int estacao = input.nextInt();

        switch (estacao) {
            case (1) -> ImprimirVerao();
            case (2) -> ImprimirOutono();
            case (3) -> ImprimirInverno();
            case (4) -> ImprimirPrimavera();
        }

    }
    public static void ImprimirVerao() {
        System.out.println("É verão \n o tempo está quente");
    }
    public static void ImprimirOutono() {
        System.out.println("É outono \nE as folhas estão caindo");
    }
    public static void ImprimirInverno() {
        System.out.println("É inverno\nE o tempo está frio");
    }

    public static void ImprimirPrimavera() {
        System.out.println("É primavera\nE as folhas estão florindo");
    }
    }


