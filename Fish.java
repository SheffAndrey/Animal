package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal {
    private int finsCount;

    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int finsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.finsCount = finsCount;

    }
    
}