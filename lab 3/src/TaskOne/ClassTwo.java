package TaskOne;

public class ClassTwo extends ClassOne {
    @Override
    public int Sum(int a, int b) {
        System.out.println("Used override method Sum");
        return super.Sum(a,b);
    }
}
