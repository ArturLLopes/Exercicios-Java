public class Main {

    public static void main(String[] args){
        Relogio brRelogio = new BrRelogio();
        brRelogio.setSecond(0);
        brRelogio.setMinute(0);
        brRelogio.setHour(20);

        System.out.println(brRelogio.getTime());

        System.out.println(new UsRelogio().convert(brRelogio).getTime());


    }
}
