public sealed abstract class Relogio permits BrRelogio, UsRelogio {

    protected   int hour;

    protected   int minute;

    protected   int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        //mantem a regra
        if(hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {

        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60){
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }


    //para deixar o padrao de 00:00:00
    private String format(int value){
        return value <9 ? "0" + value : String.valueOf(value);
    }
    //formato das horas
    public String getTime(){
        return format(hour) + " : " + format(minute) + " : " + format(second);
    }


    abstract Relogio convert(Relogio relogio);


}
