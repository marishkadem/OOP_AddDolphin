package sem2;

public class Duck extends Herbivores implements Flyable, Runable, SwimmingSpeed{
    public Duck(String nickname) {super(nickname);}

    @Override
    public int speedOfFly() {
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My speed is " + speedOfRun() + ", speed of fly  " + speedOfFly()
                + ", swimming speed " + speedSwimming() + ".";
    }
    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String say() {
        return "Krya-krya";
    }


    @Override
    public int speedSwimming() {
        return 15;
    }
}
