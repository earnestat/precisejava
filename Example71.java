// Example 71 from page 53
//


class Example71 {
  public static void main(String[] args) {
    System.out.println(absolute(-12));
    System.out.println(absolute(12));
    System.out.println(absolute(0));
  }

  // Behaves the same as absolute on page~\pageref{pgm-absolute-conditional}: 
  static double absolute(double x) { 
    if (x >= 0)
      return x;
    else 
      return -x;
  }
}

