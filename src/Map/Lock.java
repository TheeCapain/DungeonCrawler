package Map;

import java.util.ArrayList;

public class Lock {
  private boolean lockStatus;

  boolean unlock() {
    System.out.println("This is now unlocked");
    return true;
  }

  boolean checkLockStatus(Lock unlockable) {
    if (!unlockable.lockStatus){
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
