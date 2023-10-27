package lesson3;

public class Main3 {
    public static void main(String[] args) {
        InjectedBeanServiceImpl injectedBeanService = new InjectedBeanServiceImpl();
        ExampleBeanService exampleBeanService = new ExampleBeanServiceImpl();
        exampleBeanService.setIncectedBeanService(injectedBeanService);
        System.out.println(exampleBeanService.sampleMethod());
    }
}
