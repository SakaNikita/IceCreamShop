package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{

    private Flavor[] balls;

    public Cone() {;
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public Flavor[] getBalls(){
        return balls;
    }

    @Override
    public void eat() {
        System.out.println("Take cone with " + Arrays.toString(this.balls));
    }

    public enum Flavor {

        TRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        TRACIATELLA,
        MOKKA,
        PISTACHE;
    }
}
