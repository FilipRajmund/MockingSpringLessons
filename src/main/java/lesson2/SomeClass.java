package lesson2;

public class SomeClass {
    private SomeOtherClass someOtherClass;

    public SomeClass(SomeOtherClass someOtherClass) {
        this.someOtherClass = someOtherClass;
    }

    public String interactionSomeOtherMethod(){
      return someOtherClass.showName();

    }
}
