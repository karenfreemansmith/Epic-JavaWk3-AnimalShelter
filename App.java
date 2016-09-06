import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    Animal cat1 = new Animal("Spot", 2, "cat", true, false, true);
    Animal dog1 = new Animal("Fido", 0, "dog", false, true, true);

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(cat1);
    allAnimals.add(dog1);

    System.out.println("Welcome to our animal shelter. What would you like to do?");
    System.out.println("Enter one of the following options: View All Animals, View Babies Only, Add Animal, or Quit");
    String navigationChoice = c.readLine();
    while(!navigationChoice.equals("Quit")) {
      if(navigationChoice.equals("View All Animals")) {
        for(Animal pet:allAnimals) {
          System.out.println("----------------");
          System.out.println(pet.mName);
          System.out.println("A " + pet.mAge + "-year-old " + pet.mSpecies);
          System.out.println("----------------");
        }
      } else if(navigationChoice.equals("View Babies Only")) {
        for(Animal pet:allAnimals) {
          if(!pet.adultPet()) {
            System.out.println("----------------");
            System.out.println(pet.mName);
            System.out.println("A " + pet.mAge + "-year-old " + pet.mSpecies);
            System.out.println("----------------");
          }
        }
      } else if(navigationChoice.equals("Add Animal")) {
        System.out.println("We are sorry you need to find a new home for your pet, what is it's name?");
        String petName = c.readLine();
        System.out.println("How old is your pet?");
        Integer petAge = Integer.parseInt(c.readLine());
        System.out.println("What kind of animal is your pet?");
        String petSpecies = c.readLine();
        System.out.println("Is your pet house trained? (y/n)");
        String trained = c.readLine();
        boolean petHouseBroke;
        if(trained.equals("y")) {
          petHouseBroke=true;
        } else {
          petHouseBroke=false;
        }
        System.out.println("Has your pet been spayed/neutered? (y/n)");
        String spayed = c.readLine();
        boolean petFixed;
        if(spayed.equals("y")) {
          petFixed=true;
        } else {
          petFixed=false;
        }
        System.out.println("Is your pet current on it's shots? (y/n)");
        String vaccinated = c.readLine();
        boolean petShots;
        if(vaccinated.equals("y")) {
          petShots=true;
        } else {
          petShots=false;
        }
        Animal yourPet = new Animal(petName, petAge, petSpecies, petHouseBroke, petFixed, petShots);
        allAnimals.add(yourPet);
        System.out.println("----------------");
        System.out.println(yourPet.mName);
        System.out.println("A " + yourPet.mAge + "-year-old " + yourPet.mSpecies);
        System.out.println("----------------");
      } else {
        System.out.println("Sorry, please try again and watch your spelling.");
      }
      System.out.println("Enter one of the following options: View All Animals, View Babies Only, Add Animal, or Quit");
      navigationChoice = c.readLine();
    }
  }
}
