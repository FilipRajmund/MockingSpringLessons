package lesson3;

public class InjectedBeanServiceImpl implements InjectedBeanService{
    @Override
    public String anotherSampleMethod(String anywords) {
        return "some value: " + anywords;
    }
}
