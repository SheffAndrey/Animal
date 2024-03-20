package lesson1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        // String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount
        Cat kokos = new Cat("Kokos", LocalDate.of(1988,5,20),
        ArrayList<>(), "Panos", "Aydarov", 4);

        System.out.println(kokos);
        
        Animal dog = new Dog("Bobik", LocalDate.of(1988,5,20),
        ArrayList<>(), "Panos", "Aydarov");

        Animal bird = new Bird("Sparrow", LocalDate.of(1988,5,20),
        ArrayList<>(), "Panos", "Aydarov", 2);

        Animal fish = new Fish("Carp", LocalDate.of(1988,5,20),
        ArrayList<>(), "Panos", "Aydarov",4);

        // Создаем список, в котором будут храниться все пациенты
        List<Animal> animals = new ArrayList<>();
        animals.add(kokos);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);


        System.out.println("------------------------------------------------");
        
        kokos.lifeCyrcle();
    }
}