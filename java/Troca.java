import java.util.Scanner;

public class Troca {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = 0,b = 0, aux;

        System.out.println("Digite o valor de A: ");
        a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        b = input.nextInt();

        aux = b;
        b = a;
        a = aux;

        System.out.printf("Valor de A depois da troca: %d\n",a);
        System.out.printf("Valor de B depois da troca: %d\n",b);
    }
}