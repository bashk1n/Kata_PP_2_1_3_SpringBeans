package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal animal;
    private Animal animal1;

    @Autowired
    private Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal, @Qualifier("dog") Animal animal1) {
        this.animal = animal;
        this.animal1 = animal1;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString() +", " + animal1.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
