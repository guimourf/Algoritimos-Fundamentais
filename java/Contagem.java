import java.util.Scanner;

public class Contagem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de notas: ");
        int n = input.nextInt(), nota = 0, contagem = 0, i = 0;

        while(i < n){
            System.out.println("Digite a nota: ");
            nota = input.nextInt();

            if(nota >= 5){
                contagem++;
            }
            i++;
        }
        System.out.printf("Número de alunos que passaram: %d\n", contagem);
    }
}
