 import java.util.Scanner;
    public class Exercicio_alex {
        public static void main(String[] args) {
            int num;
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            if (input.hasNextInt()) {
                num = Integer.parseInt(input.nextLine());
                System.out.println("Numero digitado: "+num);
            } else {
                System.out.println("Caractere invalido detectado.");
                input.next();
        }
    }
}