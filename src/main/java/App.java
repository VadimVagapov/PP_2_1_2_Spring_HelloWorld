import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        System.out.println(beanOne==beanTwo);

        Cat one =
                (Cat) applicationContext.getBean("cat");
        System.out.println(one.getName() + " " + one.getVoice());
        Cat two =
                (Cat) applicationContext.getBean("cat");
        System.out.println(two.getName() + " " + two.getVoice());
        System.out.println(one==two);
    }
}