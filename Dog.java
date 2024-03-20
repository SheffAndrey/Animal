package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {

    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
    
}
