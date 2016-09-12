class Animal {
  public String mName;
  public int mAge;
  public String mSpecies;
  //public String[] mBreeds;
  public boolean mHouseBroke;
  public boolean mFixed;
  public boolean mShots;

  public Animal (String petName, int petAge, String petSpecies, boolean petHouseBroke, boolean petFixed, boolean petShots) {
    mName = petName;
    mAge = petAge;
    mSpecies = petSpecies;
    mHouseBroke = petHouseBroke;
    mFixed = petFixed;
    mShots = petShots;
  }

  public boolean adultPet() {
    return(mAge>0);
  }
}
