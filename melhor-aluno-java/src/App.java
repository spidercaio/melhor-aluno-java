import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String melhorAluno = "";
        double maiorNota = -1;

        System.out.println("Quantos alunos deseja analisar? ");
        int numeroAlunos = scanner.nextInt();

        for (int alunosAnalisados = 0; alunosAnalisados < numeroAlunos; alunosAnalisados++){
            System.out.println("Digite o nome do " + (alunosAnalisados + 1) + "o aluno: ");
            String nome = scanner.next();

            System.out.println("Digite a nota deste aluno: ");
            Double nota = scanner.nextDouble();

            if (nota > maiorNota){
                maiorNota = nota;
                melhorAluno = nome;
            }
        }
        System.out.println("O melhor aluno é " + melhorAluno + ", com nota sendo " + maiorNota);
    }
}
