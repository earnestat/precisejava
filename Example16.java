// Example 16 from page 15
//

import java.util.Date;
import java.util.Locale;

class Example16 {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.format("%tc%n", now);                    // default locale
    System.out.format(Locale.US, "%tc%n", now);         // en_US locale
    System.out.format(Locale.GERMANY, "%tc%n", now);    // de_DE locale
  }
}

