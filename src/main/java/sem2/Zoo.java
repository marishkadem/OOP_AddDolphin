package sem2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Radio radio = new Radio();
    private List<Animal> animals = new ArrayList<>();

    public List<Animal> addAnimals(List<Animal> animals){
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayAble(){
        List<Sayable> result = new ArrayList<>();
        for (Animal item : animals) {
            result.add(item);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable){
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable){
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public List<SwimmingSpeed> getSwimmingSpeed() {
        List<SwimmingSpeed> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof SwimmingSpeed) {
                result.add((SwimmingSpeed) item);
            }
        }
        return result;
    }

    public String getWinner(){
        List<Runable> runanimals = getRunable();
        Runable winner = runanimals.get(0);
        for (Runable item : runanimals) {
            if (winner.speedOfRun() < item.speedOfRun()){
                winner = item;
            }
        }
        return "Победитель в скорости бега: " + winner;
    }

    public String getWinnerFly(){
        List<Flyable> flyanimals = getFlyable();
        Flyable winner = flyanimals.get(0);
        for (Flyable item : flyanimals) {
            if (winner.speedOfFly() < item.speedOfFly()){
                winner = item;
            }
        }
        return "Победитель в скорости полета: " + winner;
    }

    public String getWinnerSwimming(){
        List<SwimmingSpeed> swimminganimals = getSwimmingSpeed();
        SwimmingSpeed winner = swimminganimals.get(0);
        for (SwimmingSpeed item : swimminganimals) {
            if (winner.speedSwimming() < item.speedSwimming()){
                winner = item;
            }
        }
        return "Победитель в скорости плавания: " + winner;
    }
}
