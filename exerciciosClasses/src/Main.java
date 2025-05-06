import calc.Operation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Infomer a operação que deseja realizar (1=SUM, 2=SUBTRACTION)");
            var operationOperation = scanner.nextInt();



        while (operationOperation >2 || operationOperation <1){
            System.out.println("escolha uma opção valida");
            operationOperation = scanner.nextInt();
        }
        var selectedOperation = Operation.values()[operationOperation - 1];
        System.out.println("Infomer os numeros que serao usados separados por virgulas (ex: 1,2,3,4)");
        var numbers = scanner.next();
        var numbersArray = Arrays.stream(numbers.split(","))
                .mapToLong(Long::parseLong)
                .toArray();

        var result = selectedOperation.getOperationCallback().exec(numbersArray);
        var operationTOShow =  numbers.replaceAll("," , selectedOperation.getSignal());
        System.out.printf("o resultado da operação %s é %s \n ",operationTOShow, result);
    }
}
