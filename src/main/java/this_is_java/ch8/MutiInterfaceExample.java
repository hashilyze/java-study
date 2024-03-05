package this_is_java.ch8;

public class MutiInterfaceExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
        RemoteControl[] s = new SmartTelevision[2];
    }
}
