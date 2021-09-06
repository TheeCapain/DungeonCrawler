package Item;

import java.util.ArrayList;

public class Unlockable {
  private boolean lockStatus;
  ArrayList<Unlockable> unlockables = new ArrayList();

  void unlock() {
    System.out.println("This is now unlocked");
  }

  boolean checkLockStatus(Unlockable unlockable) {
    if (unlockable.lockStatus==false){
      System.out.println("Is locked");
    } else {
      System.out.println("Is opened");
    }
    return unlockable.lockStatus;
  }

  public void setLockStatus(boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  boolean getLockStatus() {
    return lockStatus;
  }
}
