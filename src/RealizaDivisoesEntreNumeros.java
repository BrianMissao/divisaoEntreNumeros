import java.util.Scanner;

public class RealizaDivisoesEntreNumeros {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroDeDivisoesQueOUsuarioDesejaRealizar = obterNumeroDeDivisoesQueOUsuarioDesejaRealizar();
        realizarDivisoes(numeroDeDivisoesQueOUsuarioDesejaRealizar);
    }

    private static int obterNumeroDeDivisoesQueOUsuarioDesejaRealizar() {
        System.out.println("Digite o número de divisões que deseja realizar:");
        return scanner.nextInt();
    }

    private static void realizarDivisoes(int numeroDeDivisoesQueOUsuarioDesejaRealizar) {
        double dividendo;
        double divisor;
        double resultadoDaDivisao;
        for (int divisaoSendoRealizadaNoMomento = 1; divisaoSendoRealizadaNoMomento <= numeroDeDivisoesQueOUsuarioDesejaRealizar; divisaoSendoRealizadaNoMomento++) {
            dividendo = obterTermosParaDivisao("Digite o dividendo:");
            divisor = obterTermosParaDivisao("Digite o divisor:");
            if (divisor != 0) {
                resultadoDaDivisao = dividendo / divisor;
                System.out.printf("O Resultado desta divisão é: %.1f%n", resultadoDaDivisao);
            } else {
                System.out.println("Divisão impossível.");
            }
        }
    }

    private static double obterTermosParaDivisao(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextDouble();
    }
}
