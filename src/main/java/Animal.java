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

  // public static List<Task> all() {
  //   String sql = "SELECT id, description FROM tasks";
  //   try(Connection con = DB.sql2o.open()) {
  //     return con.createQuery(sql).executeAndFetch(Task.class);
  //   }
  // }

  // @Override
  // public boolean equals(Object otherTask) {
  //   if (!(otherTask instanceof Task)) {
  //     return false;
  //   } else {
  //     Task newTask = (Task) otherTask;
  //     return this.getDescription().equals(newTask.getDescription());
  //   }
  // }
}
