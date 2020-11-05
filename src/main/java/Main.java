import com.google.inject.Guice;
import com.google.inject.Injector;
import launch.Webserver;
import modules.MongoModule;

public class Main {

   public static void main(String[] args) throws Exception {
       Injector injector = Guice.createInjector(new MongoModule());
       injector.getInstance(Webserver.class).start();
    }
}
