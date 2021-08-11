public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door=door;
    }
    public void recognizer(Bark bark){
        System.out.println("Bark Recognizer heard a "+bark.getSound());
        if(door.getAllowedBark().equals(bark))
        door.open();
        else{
            System.out.println("the dog isn't allowed");
        }

    }
}
