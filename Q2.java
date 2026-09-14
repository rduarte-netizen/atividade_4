import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PRECO_POR_LITRO = 6.69;

        System.out.print("Informe o valor total do abastecimento: R$ ");
        double valorTotal = scanner.nextDouble();

        double totalLitros = valorTotal / PRECO_POR_LITRO;

        System.out.printf("Total abastecido: %.4f litros\n", totalLitros);
        scanner.close();
    }
}
