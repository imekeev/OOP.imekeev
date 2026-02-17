package Practice2.Problem3;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        Time tim = new Time(23, 5, 6);
        System.out.println(tim.toUniversal());
        System.out.println(tim.toStandard());
        Time t1 = new Time(23,30,40);
        Time t2 = new Time (2,40,30);
        Time sum = t1.add(t2);
        System.out.println(sum.toUniversal());
        System.out.println(sum.toStandard());
    }
}
