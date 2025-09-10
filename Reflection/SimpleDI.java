import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    public void serve() { System.out.println("Service is running..."); }
}

class Client {
    @Inject
    private Service service;

    public void useService() { service.serve(); }
}

public class SimpleDI {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field field : Client.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, field.getType().getDeclaredConstructor().newInstance());
            }
        }
        client.useService();
    }
}