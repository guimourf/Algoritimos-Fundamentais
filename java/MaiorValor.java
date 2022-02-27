import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista: ");
        int n = input.nextInt(), numero, maior;
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            numero = input.nextInt();
            array[i] = numero;
        }
        maior = array[0];
        for(int i = 0; i < n; i++){
            if(array[i] > maior)
                maior = array[i];
        }
        System.out.printf("O maior numero da lista é: %d\n", maior);
    }
}
