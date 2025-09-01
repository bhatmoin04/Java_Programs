import java.util.Scanner;

// Interface for Camera features
interface Camera {
    void takePhoto();

    void recordVideo();
}

// Interface for Music Player features
interface MusicPlayer {
    void playMusic();

    void stopMusic();
}

// Smartphone class implementing both interfaces
class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Photo captured!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}

// Main class

public class SmartphoneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphone phone = new Smartphone();

        try {
            System.out.println("Choose an action: ");
            System.out.println("1. Take Photo  2. Record Video  3. Play Music  4. Stop Music");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    phone.takePhoto();
                    break;
                case 2:
                    phone.recordVideo();
                    break;
                case 3:
                    phone.playMusic();
                    break;
                case 4:
                    phone.stopMusic();
                    break;
                default:
                    System.out.println("❌ Invalid choice!");
            }

        } catch (Exception e) {
            System.out.println("❌ Error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}
