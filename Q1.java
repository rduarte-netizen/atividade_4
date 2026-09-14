import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidade = scanner.nextDouble();

        double tempoTotalHoras = capacidade / 1000.0;
        int horas = (int) tempoTotalHoras;
        int minutos = (int) Math.round((tempoTotalHoras - horas) * 60);

        if (minutos == 60) {
            horas++;
            minutos = 0;
        }

        System.out.printf("Tempo necessario: %d:%02d horas\n", horas, minutos);
        scanner.close();
    }
}
