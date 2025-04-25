public non-sealed class BrRelogio extends Relogio{

    @Override
    public Relogio convert(final  Relogio relogio){
        this.second = relogio.getSecond();
        this.minute = relogio.getMinute();

        switch (relogio){
            case UsRelogio usRelogio ->
                this.hour = (usRelogio.getPeriodIndicator().equals("PM")) ?
                            usRelogio.getHour() + 12 :
                            usRelogio.getHour();


            case BrRelogio brRelogio ->
                this.hour = brRelogio.getHour();

        }
        return this;
    }
}
