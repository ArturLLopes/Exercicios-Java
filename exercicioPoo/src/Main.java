import java.util.Scanner;

public class Main {

    //colocado fora do escopo para que toda os loops possam identificar
   private final static Scanner scanner = new Scanner(System.in);

   private final static  PetMachine petMachine = new PetMachine();

    public static void main(String[] args){
        var option = -1;

        do{
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho");
            System.out.println("2 - Abastecer com agua");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar o nivel da agua");
            System.out.println("5 - verificar o nivel do shampoo");
            System.out.println("6 - Verificar se tem pet na maquina");
            System.out.println("7 - Colocar o pet na maquina");
            System.out.println("8 - Retirar o pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            
            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> getPetFromMachine();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida");
            }

        }while (true);
    }


    //case2
    private static void setWater(){
        System.out.println("tentando colocar agua na maquina");
        petMachine.addWater();
    }
    //case 3
    private static void setShampoo(){
        System.out.println("tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }




    //case 4
    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("A maquina esta no momento com " + amout + " litros de agua");
    }


    //case 5
    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com " + amout + " litros de shampo");
    }

    //case6
    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? " Tem pet na maquina" : " nao tem pet na maquina");
    }

    //case 8
    private static void getPetFromMachine() {
        petMachine.removePet();
    }


    //caso 7
    private static void setPetInPetMachine() {
        scanner.nextLine();
        var name = "";
        while (name == null || name.isEmpty()){
        System.out.println("imforme o nome do pet");
        name = scanner.nextLine();

        }

        var pet = new Pet(name);
        petMachine.setPet(pet);

    }
}
