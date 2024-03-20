package lesson1;
import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);       // Отправляет компилятор к родидельскому файл, и говорит, какие данные взять
        this.legsCount = legsCount;     // Все параметры наследовали от класса животные. Но в класс Коты, добавили - количество лап.

    }
    
}
