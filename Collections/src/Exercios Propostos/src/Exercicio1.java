import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/*
 * Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
        JAN     FEV     MAR     ABR     MAI     JUN     JUL     AGO     SET     OUT     NOV     DEZ
Temp.	23 °C	24 °C	23 °C	21 °C	19 °C	17 °C	17 °C	18 °C	19 °C	20 °C	21 °C	23 °C


 */

 class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        
        //recebendo as temperaturas

        int count = 0;

        while (true) {
            if (count == 6 ) {
                break;
            }
            System.out.println("Digite as temperaturas : ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        
        System.out.println("Entrada de Temperaturas (Graus Centigrados): ");
        System.out.println(temperaturas);
        //somando valores
        Iterator<Double> iterator = temperaturas.iterator();
        Double somaTemperatura = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            somaTemperatura += next;
        }
               
        System.out.println("\nSoma das temperaturas : " + somaTemperatura);

        double media = (somaTemperatura / temperaturas.size());
        
        System.out.println("\nMédia semestral das temperaturas: " + media + "\n");


        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator3 = temperaturas.iterator();

        count = 0;

        while (iterator3.hasNext()) {
            Double temp = iterator3.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;                
                    default:
                        break;
                }
            }
        }

        /*for (Double temp : temperaturas) {
            if (temp > media) {
                int index = temperaturas.indexOf(temp);

                switch (index) {
                    case 0:
                        System.out.println((index + 1 ) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1 ) + " - FEVEREIRO : " + temp + " oC");
                        break;
                    case 2:
                        System.out.println((index + 1 ) + " - MARÇO : " + temp + " oC");
                        break;
                    case 3:
                        System.out.println((index + 1 ) + " - ABRIL : " + temp + " oC");
                        break;
                    case 4:
                        System.out.println((index + 1 ) + " - MAIO : " + temp + " oC");
                        break;
                    case 5:
                        System.out.println((index + 1 ) + " - JUNHO : " + temp + " oC");
                        break;
                    
                    default:
                        break;
                }
            }
        }*/

        scan.close();
    }
 }