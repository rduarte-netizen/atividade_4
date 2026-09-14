import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Informe o percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * percentualDesconto / 100;
        double valorFinal = valorProduto - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}
