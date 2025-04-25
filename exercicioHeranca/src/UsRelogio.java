
public non-sealed class UsRelogio extends Relogio {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }



    public void setBeforeMidDay() {
        this.periodIndicator = "AM";
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setHour(int hour) {
        //mantem a regra AM PM

        setBeforeMidDay();
        if((hour > 12) && (hour<= 23)){
            setAfterMidDay();
            this.hour = hour - 12;
        }

    }




    @Override
    Relogio convert(final Relogio relogio) {
        this.second = relogio.getSecond();
        this.minute = relogio.getMinute();

        switch (relogio){
            case UsRelogio usRelogio ->{
                    this.hour = usRelogio.getHour();
                    this.periodIndicator =  usRelogio.getPeriodIndicator();
            }


            case BrRelogio brRelogio ->
                    this.setHour(brRelogio.getHour());

        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime()+ " " + this.periodIndicator;
    }
}
