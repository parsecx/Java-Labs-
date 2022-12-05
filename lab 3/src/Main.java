import TaskTwo.OldPerson;
import TaskTwo.Person;
import TaskString.MyStringProcessor;

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
        System.out.println(MyStringProcessor.edAtTheEndChecker("ed"));
        System.out.println(MyStringProcessor.sumOfNumInString("123sum5"));
        System.out.println(MyStringProcessor.maxLengthOfSameSymbols("eddddda"));
        System.out.println(MyStringProcessor.concatStringsByIndex("edgar", "12345"));
        MyStringProcessor.wordsInString("Hello to the World!!!");
    }
}