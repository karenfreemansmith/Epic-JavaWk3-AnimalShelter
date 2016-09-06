import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    Animal cat = new Animal();
      cat.mName="Spot";
      cat.mAge=2;
      cat.mSpecies="cat";
      //cat.mBreeds[]={"domestic shorthair"};
      cat.mHouseBroke=true;
      cat.mFixed=false;
      cat.mShots=true;
    Animal dog = new Animal();
      dog.mName="Fido";
      dog.mAge=0;
      dog.mSpecies="dog";
      //dog.mBreeds={"german shepheard", "irish setter"};
      dog.mHouseBroke=false;
      dog.mFixed=true;
      dog.mShots=true;

    Animal[] allAnimals = {cat, dog};

    System.out.println("Do you prefer mature animals? (yes/no)");
    String response = c.readLine();

    for(Animal pet:allAnimals) {
      if(response.equals("yes") && pet.adultPet()) {
        System.out.println("----------------");
        System.out.println(pet.mName);
        System.out.println("A " + pet.mAge + "-year-old " + pet.mSpecies);
        // if(pet.mBreeds.length>1) {
        //   System.out.println(pet.Breeds[0] + " mix");
        // } else {
        //   System.out.println(pet.Breeds[0]);
        // }
        System.out.println("----------------");
      } else if(response.equals("no") && !pet.adultPet()) {
        System.out.println("----------------");
        System.out.println(pet.mName);
        System.out.println("A " + pet.mAge + "-year-old " + pet.mSpecies);
        // if(pet.mBreeds.length>1) {
        //   System.out.println(pet.Breeds[0] + " mix");
        // } else {
        //   System.out.println(pet.Breeds[0]);
        // }
        System.out.println("----------------");
      }

    }
  }
}
