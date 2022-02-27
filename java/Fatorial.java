import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = input.nextInt(), fatorial = 1;

        for(int i = n; i >= 1; i--){
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é %d\n", n, fatorial);
    }
}
