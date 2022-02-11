package peaksoft.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Getter
@Component
public class AnimalsCage {

    @Qualifier("animal")
    private Animal animal;

    @Qualifier("timer")
    private Timer timer;

    public AnimalsCage(Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

}
