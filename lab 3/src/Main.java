import TaskTwo.OldPerson;
import TaskTwo.Person;

public class Main {
    public static void main(String[] args) {
        Person testObjPerson = new Person("Iva","Man",169,65);
        OldPerson testObjOldPerson = new OldPerson("Bogdan","Man",171,63,67,12000);
        System.out.println("Persons data:"
                +testObjPerson.getName() + " "
                +testObjPerson.getGender() + " "
                +testObjPerson.getHeight() + " "
                +testObjPerson.getWeight());

        System.out.println("OldPersons data:"
                +testObjOldPerson.getName() + " "
                +testObjOldPerson.getGender() + " "
                +testObjOldPerson.getHeight() + " "
                +testObjOldPerson.getWeight() + " "
                +testObjOldPerson.getAge() + " "
                +testObjOldPerson.getPension());

    }
}