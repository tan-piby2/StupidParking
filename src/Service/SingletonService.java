package Service;

public class SingletonService {

    private static SingletonService instance;
    public SingletonService() {
        // Private constructor to prevent instantiation
        if(instance==null) {
            instance = this;
        } else {
            throw new IllegalStateException("SingletonService already instantiated");
        }
    }

    public static SingletonService getInstance() {
        if (instance == null) {
            System.out.println("Creating new instance of SingletonService");
            instance = new SingletonService();
        } else {
            System.out.println("instance of SingletonService existent!");
        }
        return instance;
    }
}
