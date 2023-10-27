package lesson2;

public class Main {
    public static void main(String[] args) {

        SomeOtherClass someOtherClass = new SomeOtherClass();
        SomeClass someClass = new SomeClass(someOtherClass);

        String s2 = someClass.interactionSomeOtherMethod();

        System.out.println(s2);
        //someClass.interactionSomeOtherMethod();
    }
}
