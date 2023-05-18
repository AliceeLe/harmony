package harmony;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import java.io.*;

public class TestLogger implements LambdaLogger {
  private static final Logger logger = LoggerFactory.getLogger(TestLogger.class);
  public TestLogger(){}
  public void log(String message){
    System.out.println(message);
  }
  public void log(byte[] message){
    System.out.println(new String(message));
  }
}