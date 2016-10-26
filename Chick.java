class Chick implements Animal {
  private String myType;
  private String mySound1, mySound2;
  private boolean twoSounds;
  public Chick(String type, String sound) {
    myType = type;
    mySound1 = sound;
    twoSounds = false;
  }
  public Chick(String type, String sound1, String sound2) {
    myType = type;
    mySound1 = sound1;
    mySound2 = sound2;
    twoSounds = true;
  }
  public Chick() {
    myType = "unknown";
    mySound1 = "unknown";
    twoSounds = false;
  }
  public String getSound() {
    if (Math.random()<0.5 && twoSounds) {
      return mySound2;
    } else return mySound1;
  }
  public String getType() {return myType;}
}
