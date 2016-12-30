import org.apache.log4j.Logger;

/**
 * Created by husiq on 12/30/2016.
 */
public class log4jtest {
    private static final Logger LOGGER = Logger.getLogger(log4jtest.class);
    public static void main(String[] agrs){
        LOGGER.debug("This is debug message!");
        LOGGER.info("This is info message!");
        LOGGER.warn("This is warn message!");
        LOGGER.error("This is error message!");

    }

}
