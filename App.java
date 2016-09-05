public class App {
  public static void main(String[] args) {
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

    for(Animal pet:allAnimals) {
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
