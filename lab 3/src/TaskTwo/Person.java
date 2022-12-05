package TaskTwo;

public class Person {

    private String name;
    private String gender;
    private int height;
    private int weight;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    public int getHeight(){return height;}
    public void setHeight(int height){this.height = height;}

    public int getWeight(){return weight;}
    public void setWeight(int weight){this.weight = weight;}

    public Person(String name, String gender, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
}
