import java.util.Scanner;

public class ExercicioUmCombustivel {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o tempo da viagem em horas: ");
            double tempoViagem = sc.nextDouble();
            System.out.println("Informe a velocidade média da viagem em km: ");
            double velocidadeViagem = sc.nextDouble();
            double distanciaViagem = 0;
            distanciaViagem = tempoViagem * velocidadeViagem;
            double litrosUsados = 0;
            litrosUsados = distanciaViagem/12;
            System.out.println("Velocidade média da viagem: " + velocidadeViagem + " km");
            System.out.println("Tempo gasto na viagem: " + tempoViagem + " horas");
            System.out.println("Distância percorrida na viagem: " + distanciaViagem + " km");
            System.out.println("Quantidade de combustivel utilizado na viagem: " + litrosUsados + " litros");
        }
    }

