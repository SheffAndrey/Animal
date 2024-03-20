package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal {
    private int wingsCount;

    public Bird(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int wingsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.wingsCount = wingsCount;
    }
    
}