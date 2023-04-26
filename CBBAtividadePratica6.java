import java.util.Scanner;
import java.util.Arrays;

public class CBBAtividadePratica6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inteiros[] = new int[10];
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Informe um número inteiro: ");
            inteiros[i] = entrada.nextInt();
        }
        entrada.close();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Imprimindo a array: ");
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print(inteiros[i] + " ");
        }
        System.out.println("\nO maior inteiro da array é " + Arrays.stream(inteiros).max().getAsInt() + ".");
    }
}
