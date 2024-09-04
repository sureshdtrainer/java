import com.siemens.util.log.Logger;
import com.siemens.util.log.NonSingletonLogger;

public class App {
    public static void main(String[] args) throws Exception {
       //Non Singleton Logger instances
       NonSingletonLogger nslogger1 = new NonSingletonLogger();
       nslogger1.log("My first message" +nslogger1);
       NonSingletonLogger nslogger2 = new NonSingletonLogger();
       nslogger2.log("My second message"+nslogger2);
       NonSingletonLogger nslogger3 = new NonSingletonLogger();
       nslogger3.log("My third message"+nslogger3);
       NonSingletonLogger nslogger4 = new NonSingletonLogger();
       nslogger4.log("My fourth message"+nslogger4);
       
       java.util.logging.Logger.getLogger(null)
       
        Logger logger1 = Logger.getInstance();
       logger1.log("My first message" +logger1);
       Logger logger2 = Logger.getInstance();
       logger2.log("My second message"+logger2);
       Logger logger3 = Logger.getInstance();
       logger3.log("My third message"+logger3);
       Logger logger4 = Logger.getInstance();
       logger4.log("My fourth message"+logger4);
    }
}
