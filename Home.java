public class Home {
    public static void main(String[] args) {
        Television obj=new Television();
        AudioSystem obj2=new AudioSystem();
        obj.powerOff();
        obj.powerOn();
        obj2.volumeUp();
    }
}
 interface RemoteControl {
void powerOff();
void powerOn();
void volumeUp();
}
 class Television implements RemoteControl {
public void powerOff(){
    System.out.println("Television is off");
}
public void powerOn(){
    System.out.println("Television is on");
}

public void volumeUp() {
    System.out.println("Volume is off");
}
    
}
 class AudioSystem implements RemoteControl {
 public void powerOff(){
    System.out.println("Speaker is off");
 }
    public void powerOn()
    {
        System.out.println("Audio is on");
    }
    @Override
    public void volumeUp() {
        System.out.println("Audio is booming");
    }
}
