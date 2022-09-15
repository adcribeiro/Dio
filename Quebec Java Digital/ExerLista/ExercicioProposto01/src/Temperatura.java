public class Temperatura implements Comparable<Temperatura> {
    private String mesesAno;
    private int tempMeses;

    public String getMesesAno() {
        return mesesAno;
    }

    public int getTempMeses() {
        return tempMeses;
    }

    public Temperatura(String mesesAno, int tempMeses) {
        this.mesesAno = mesesAno;
        this.tempMeses = tempMeses;
    }

    @Override
    public int compareTo(Temperatura o) {
        return nome;
    }

}
