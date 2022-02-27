import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite quantos termos da sequência você quer ver: ");
        int n = input.nextInt(), termo1 = 0, termo2 = 1, termo3;

        if(n < 2)
            System.out.println(termo1);
        else if(n < 3)
            System.out.printf("%d, %d", termo1, termo2);

        System.out.printf("%d, %d", termo1, termo2);

        for(int i = 3; i <= n; i++){
            termo3 = termo1 + termo2;
            System.out.printf(", %d",termo3);
            termo1 = termo2;
            termo2 = termo3;
        }
    }
}
