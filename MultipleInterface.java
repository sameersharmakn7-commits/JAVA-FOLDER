interface MusicPlayer {
    void playMusic();
}

interface Camera {
    void clickPhoto();
}

class Smartphone implements MusicPlayer, Camera {

    public void playMusic() {
        System.out.println("Playing music");
    }

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        s.playMusic();
        s.clickPhoto();
    }
}
