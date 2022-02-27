import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = input.nextInt(), numero, soma=0, i = 0;

        while(i < n){
            numero = input.nextInt();
            soma += numero;
            i++;
        }
        System.out.printf("Resultado da soma: %d\n", soma);
    }
}
