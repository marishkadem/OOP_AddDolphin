package sem2;

public class Dolphin extends Herbivores implements Sayable, SwimmingSpeed{
    public Dolphin (String nickname) {
        super(nickname);
    }




        public String toString(){
            return "I'm dolphin. " + super.toString()
                    + ". My swimming speed " + speedSwimming() + ".";}



        @Override
        public String say() {
            return "Kikiki";
        }



        public int speedSwimming() {
            return 50;
        }
}
