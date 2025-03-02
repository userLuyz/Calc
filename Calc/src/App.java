import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner 
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = input.nextInt();

        System.out.println("Qual operação deseja realizar: ");

        System.out.println("0 - Finalizar a operação !");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Modulo ou resto da divisão");

        int code = input.nextInt();

        switch (code) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
        
            case 2:
                System.out.println(valor1 - valor2);
                break;

            case 3:
                System.out.println(valor1 * valor2);
                break;

            case 4:
                System.out.println(valor1 / valor2);
                break;

            case 5: 
                System.out.println(valor1 % valor2);
                break;

            default:
                System.out.println("Operação finalizada !");
                break;
        }
        input.close();
    }
}
