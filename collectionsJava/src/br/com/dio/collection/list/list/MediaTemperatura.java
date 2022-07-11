package br.com.dio.collection.list.list;

public class MediaTemperatura {
    private double janeiro, fevereiro, marco, abril, maio, junho;

    public void mediaTemperatura1(double janeiro, double fevereiro, double marco, double abril, double maio, double junho) {
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
        this.abril = abril;
        this.maio = maio;
        this.junho = junho;
    }

    public double getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(double janeiro) {
        this.janeiro = janeiro;
    }

    public double getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(double fevereiro) {
        this.fevereiro = fevereiro;
    }

    public double getMarco() {
        return marco;
    }

    public void setMarco(double marco) {
        this.marco = marco;
    }

    public double getAbril() {
        return abril;
    }

    public void setAbril(double abril) {
        this.abril = abril;
    }

    public double getMaio() {
        return maio;
    }

    public void setMaio(double maio) {
        this.maio = maio;
    }

    public double getJunho() {
        return junho;
    }

    public void setJunho(double junho) {
        this.junho = junho;
    }

    @Override
    public String toString() {
        return "mediaTemperatura{" +
                "janeiro=" + janeiro +
                ", fevereiro=" + fevereiro +
                ", marco=" + marco +
                ", abril=" + abril +
                ", maio=" + maio +
                ", junho=" + junho +
                '}';
    }
}
