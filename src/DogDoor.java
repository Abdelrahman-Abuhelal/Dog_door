import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private ArrayList<Bark> bark;

    public DogDoor(){
    this.open=false;
    this.bark=new ArrayList<>();
    }
    public void open(){
        System.out.println("the dog door opens");
        open=true;
        final Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        },5000);
    }
    public void close(){
        System.out.println("the dog dor closes");
        open=false;
    }
    public boolean isOpen(){
        return open;
    }
    public void addAllowedBark(Bark b){
        bark.add(b);
    }

    public ArrayList<Bark> getAllowedBark() {
        return bark;
    }
}
