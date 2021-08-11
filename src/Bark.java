public class Bark {
    private String sound;

    public Bark(String sound){
        this.sound=sound;
    }
    public String getSound(){
        return sound;
    }
    public boolean equals(Object b) {
        if (b instanceof Bark) {
            Bark otherBark = (Bark) b;
            if (this.sound.equalsIgnoreCase(otherBark.sound)) {
                return true;
            }
        }
        return false;
    }


    }
