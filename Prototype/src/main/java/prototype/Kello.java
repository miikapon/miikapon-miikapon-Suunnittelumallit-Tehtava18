
public class Kello implements Cloneable {

    private String nimi;
    private Viisari s;
    private Viisari m;
    private Viisari h;

    public Kello(String name, int s, int m, int h) {
        this.nimi = name;
        this.s = new Viisari(s);
        this.m = new Viisari(m);
        this.h = new Viisari(h);
    }

    public void getName() {
        System.out.println(nimi);
    }

    public void setName(String n) {
        this.nimi = n;
    }

    public void setTime(int hh, int mm, int ss) {
        s.setAika(ss);
        m.setAika(mm);
        h.setAika(hh);
    }

    public void aika() {
        System.out.println(h.getAika() + ":" + m.getAika() + ":" + s.getAika());
    }

    public Kello clone() {
        Kello c = null;
        try {
            c = (Kello) super.clone();
            c.s = (Viisari) s.clone();
            c.m = (Viisari) m.clone();
            c.h = (Viisari) h.clone();
            return c;
        } catch (CloneNotSupportedException e) {
            return c;
        }
    }
}
