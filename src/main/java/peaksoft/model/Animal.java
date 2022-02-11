package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Animal {
    @Autowired
    private Cat cat;

    @Autowired
    private Dog dog;

    @Override
    public String toString() {
        return "Animal :" +
                "cat= " + cat +
                ", dog= " + dog;
    }
}
