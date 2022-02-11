package peaksoft.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Hello I'm a Dog";
    }

}
