
public class Viisari implements Cloneable {

    private int aika;

    public Viisari(int t) {
        this.aika = t;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int t) {
        this.aika = t;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
