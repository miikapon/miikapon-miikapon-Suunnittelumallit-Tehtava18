
public class Main {

    public static void main(String[] args) {

        Kello c = new Kello("kello A", 00, 00, 00);
        Kello d = c.clone();

        c.getName();
        c.aika();
        d.getName();
        d.aika();

        c.setTime(10, 20, 2);
        c.setName("kello B");

        System.out.println();
        c.getName();
        c.aika();
        d.getName();
        d.aika();
    }
}
