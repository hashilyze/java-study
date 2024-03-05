package this_is_java.ch8;

public class SmartTelevision implements RemoteControl, Searchable{
    public int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
