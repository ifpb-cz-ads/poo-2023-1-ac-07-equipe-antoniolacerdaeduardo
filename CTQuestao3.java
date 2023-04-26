import java.util.Scanner;

public class CTQuestao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas[] = new double[10];
        double somatorio = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Informe a nota do " + (i+1) + "º aluno: ");
            notas[i]  = entrada.nextDouble();
            somatorio += notas[i];
        }
        entrada.close();
        double media = somatorio / notas.length;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("A média das notas informadas é " + media + ".");
        int notasbaixas = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media) {
                notasbaixas++;
            }
        }
        System.out.println(notasbaixas + " alunos tiraram notas baixas e " + (notas.length - notasbaixas) + " alunos tiraram nota acima ou na média.");
    }
}
