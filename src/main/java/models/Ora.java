package models;

public class Ora {

    private int ora;
    private int minute;

    public Ora(int ora, int minute) {
        this.ora = ora;
        this.minute = minute;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String showOra() {
        String oraString;
        String minutString;

        if(ora < 10) {
            oraString = "0" + String.valueOf(ora);
        } else {
            oraString =  String.valueOf(ora);
        }

        if(minute < 10) {
            minutString = "0" + String.valueOf(minute);
        } else {
            minutString =  String.valueOf(minute);
        }

        return oraString + ":" + minutString;
    }
}
