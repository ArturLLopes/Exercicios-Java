public class PetMachine {

    private boolean clean = true;

    private  int water = 30;

    private int shampoo = 10;

    private  Pet pet;





    //maquina funcionando
    public void  takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet "+ pet.getName() + " esta limpo");
    }
    //abastecer
    public void addWater(){
        if (water == 30){
            System.out.println("A maquina ja esta cheia");
            return;
        }
        water +=2;
    }
    //abastecer
    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A maquina ja esta cheia");
            return;
        }
        shampoo +=2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    //ver se tem pet na maquina
    public boolean hasPet(){
        return  pet !=null;
    }

    //pedido para por o pet na maquina
    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A maquina esta suja, limpe ela para por o pet");
            return;
        }

       if (hasPet()){
           System.out.println("O pet " + this.pet.getName() + " esta na maquina agora");
           return;
       }
       this.pet=pet;
        System.out.println("O pet " +  pet .getName() + " foi colocado na maquina");
    }

    public void  removePet(){
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover.");
            return;
        }

        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + (this.clean ? " está limpo." : " não está limpo."));
        this.pet = null;
    }


    //limpando a maquina
    public void  wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina foi limpa");
    }

}
