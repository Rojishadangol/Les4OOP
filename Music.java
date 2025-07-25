abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Playing piano melody...");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Strumming guitar chords...");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Playing violin notes...");
    }
}

public class Music {
    public static void main(String[] args) {
        Instrument i1 = new Piano();
        Instrument i2 = new Guitar();
        Instrument i3 = new Violin();
        i1.playSound();
        i2.playSound();
        i3.playSound();
    }
}
