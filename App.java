import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    Animal cat1 = new Animal("Spot", 2, "cat", true, false, true);
    Animal dog1 = new Animal("Fido", 0, "dog", false, true, true);

    Animal[] allAnimals = {cat1, dog1};

    System.out.println("Do you prefer mature animals? (yes/no)");
    String response = c.readLine();

    for(Animal pet:allAnimals) {
      if(response.equals("yes") && pet.adultPet()) {
        System.out.println("----------------");
        System.out.println(pet.mName);
        System.out.println("A " + pet.mAge + "-year-old " + pet.mSpecies);
        System.out.println("----------------");
      } else if(response.equals("no") && !pet.adultPet()) {
        System.out.println("----------------");
        System.out.println(pet.mName);
        System.out.println("A " + pet.mAge + "-year-old " + pet.mSpecies);
        System.out.println("----------------");
      }
    }
  }
}
