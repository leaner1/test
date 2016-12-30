import entity.HelloWorld;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by husiq on 12/30/2016.
 */
public class log4jtest {
    private static final Logger LOGGER = Logger.getLogger(log4jtest.class.getName());
    public static void main(String[] agrs){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setMessage("123");
//        helloWorld.getMessage();
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
        LOGGER.debug("This is debug message!");
        LOGGER.info("This is info message!");
        LOGGER.warn("This is warn message!");
        LOGGER.error("This is error message!");

    }

}
