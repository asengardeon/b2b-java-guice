import com.google.inject.Guice;
import com.google.inject.Injector;
import launch.Webserver;

public class Main {

   public static void main(String[] args) throws Exception {
       Injector injector = Guice.createInjector();
       injector.getInstance(Webserver.class).start();
    }
}
