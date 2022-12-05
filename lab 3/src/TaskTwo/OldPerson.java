package TaskTwo;

public class OldPerson extends Person{
    private int age;
    private int pension;

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public int getPension(){return pension;}
    public void setPension(){this.pension = pension;}
    public OldPerson(String name, String gender, int height, int weight,int age, int pension) {
        super(name, gender, height, weight);
        this.age = age;
        this.pension = pension;
    }
}
