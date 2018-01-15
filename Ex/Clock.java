public class Clock {
  private int hours, minutes, seconds;
  private static final int ADD = 1;

  Clock() {
    hours = 0;
    minutes = 0;
    seconds = 0;
  }

  Clock(int hrs) {
    setHrs(hrs);
    minutes = 0;
    seconds = 0;
  }
  Clock(int hrs, int min) {
    setHrs(hrs);
    setMins(min);
    seconds = 0;
  }
  Clock(int hrs, int min, int sec) {
    setHrs(hrs);
    setMins(min);
    setSec(sec);
  }

  public int getHrs() {
    return hours;
  }

  public void setHrs(int h) {
    if (h >= 24 || h < 0) {
      hours = 0;
    }
    else {
      hours = h;
    }
  }

  public int getMins() {
    return minutes;
  }

  public void setMins(int m) {
    if (m >= 60 || m < 0) {
      minutes = 0;
    }
    else {
      minutes = m;
    }
  }

  public int getSec() {
    return seconds;
  }

  public void setSec(int s) {
    if (s >= 60 || s < 0) {
      seconds = 0;
    }
    else {
      seconds = s;
    }
  }

  public int secplus() {
    setSec(ADD);
    if (getSec() == 0) {
      setMins(minutes++);
      if (getMins() == 0) {
        setHrs(hours++);
      }
    }
  }

  public String toString() {
    return "Ore: " + hours + " Minuti: " + minutes + " Secondi: " + seconds;
  }
}
