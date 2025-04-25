import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        var scanner = new Scanner(System.in);
        System.out.println("Escreva um numero");
        var primeiro = scanner.nextInt();
        System.out.println("Escreva um numero maior que o anterior");
        var segundo = scanner.nextInt();

        while (segundo <= primeiro) {
            System.out.println("O segundo número precisa ser maior que o primeiro. Tente novamente:");
            segundo = scanner.nextInt();
        }

        System.out.println("voce quer par ou impar?");
        String escolha = scanner.next().toLowerCase();
        System.out.println("\nNúmeros no intervalo (" + primeiro + " a " + segundo + ") em ordem decrescente:");
        for (int i= segundo; i>= primeiro; i--){
            if(escolha.equals("par") && i% 2 == 0){
                System.out.println(i);

            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);

            }

        }













        /*IMC
        var scanner = new Scanner(System.in);
        System.out.println("vamos calccular o seus IMC!!!");
        System.out.println("Qual é sua altura em centimetros?");
        var alturaCm = scanner.nextDouble();
        double altura = alturaCm/100;
        System.out.println("qual é o seu peso?");
        double peso = scanner.nextInt();
        double imc = peso/(altura*altura);
        System.out.printf("Seu IMC é: %s \n", imc);

                if(imc <18.5){
                    System.out.println("abaixo do peso");
                }

                else if (imc<25){
                    System.out.println("peso normal");
                }

                else if (imc <30){
                    System.out.println("sobrepeso");
                }
                else {
                    System.out.println("obesidade");
                }

         */









        /*tabuada
        var scanner = new Scanner(System.in);
        System.out.println("qual tabuada voce quer saber?");
        var number = scanner.nextInt();
        for (var i=1; i<=10; i++){
            var resultado = number * i;
            System.out.printf("a tabuada de %s é: %s X "+i+" = %s \n",number,number, resultado);
        }

         */







/*
        var scanner =new Scanner(System.in);
        System.out.println("Informe um numero");
        var number = scanner.nextInt();
        while (true){
            System.out.println("Infomer o numero para verificação");
            var toVerfy = scanner.nextInt();
            if (toVerfy < number){
                System.out.printf("informe um numero maior que %s \n", number);
                continue;
            }
            var result = toVerfy % number;
            System.out.printf(" %s %% %s = %s \n", toVerfy,number, result);
            if (result != 0) break;

        }

 */

    }
}
