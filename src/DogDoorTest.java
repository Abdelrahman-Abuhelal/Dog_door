public class DogDoorTest {

    public static void main(String[] args) {
        DogDoor door=new DogDoor();
        Remote remote=new Remote(door);
        BarkRecognizer barkrec=new BarkRecognizer(door);

        remote.pressButton();
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }
        System.out.println("...but he’s stuck outside!");
        // Simulate the hardware hearing a bark again
        System.out.println("Fido starts barking.");

        System.out.println("\nFido’s back inside...");
    }



    }

