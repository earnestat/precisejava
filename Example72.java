// Example 72 from page 53
//


class Example72 {
  public static void main(String[] args) {
    System.out.println("Thursday is " + wdayno1("Thursday"));
  }

  static int wdayno1(String wday) {
    if      (wday.equals("Monday"))    return 1;
    else if (wday.equals("Tuesday"))   return 2;
    else if (wday.equals("Wednesday")) return 3;
    else if (wday.equals("Thursday"))  return 4;
    else if (wday.equals("Friday"))    return 5;
    else if (wday.equals("Saturday"))  return 6;
    else if (wday.equals("Sunday"))    return 7;
    else return -1;                             // Here used to mean `not found'
  } 
}

