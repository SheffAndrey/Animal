package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Animal {       // поменяем модификатор private на protected. Чтобы поле было доступно в классе, и в классе наследнике
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;  
    


    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }


    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public List<String> getVaccinations() {
        return this.vaccinations;
    }

    public String getIllness() {
        return this.illness;
    }
 

    public String getOwner() {
        return this.owner;
    }
    
    private void wakeup (){
        System.out.println("Animal is wakeup");
    }

    private void eat (){
        System.out.println("Animal ate");
    }

    private void play(){
        System.out.println("Animal played");
    }


    private void sleep(){
        System.out.println("Animal sleeping");

    }

    private void toGo(){
        System.out.println("Animal began to move");
    }

    private void fly(){
        System.out.println("Animal flew");
    }

    private void swim(){
        System.out.println("Animal swam");
    }



    public void lifeCyrcle() {
        wakeup();
        eat();
        play();
        sleep();
        toGo();
        fly();
        swim();

        
    }
}

