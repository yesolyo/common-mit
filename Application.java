import java.io.IOException;

public class Application {
    public static void main(String[] args) {
          MitController mitController = new MitController();
          try {
              while (!mitController.isDone()) {
                  mitController.getRequest();
              }
          } catch (IOException e) {
              System.out.println(e.getMessage());
          }
    }
}
