// Example 98 from page 73
//


class WeekdayException extends Exception {
  static final long serialVersionUID = 50L;
  public WeekdayException(String wday) { 
    super("Illegal weekday: " + wday); 
  }
}

