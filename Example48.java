// Example 48 from page 39
//


class Example48 {
  public static void main(String[] args) {
    int max = 2147483647;
    int min = -2147483648;
    println(max+1);                             // Prints -2147483648
    println(min-1);                             // Prints  2147483647
    println(-min);                              // Prints -2147483648
    print(   10/3); println(   10/(-3));        // Prints  3 -3
    print((-10)/3); println((-10)/(-3));        // Prints -3  3
    print(   10%3); println(   10%(-3));        // Prints  1  1
    print((-10)%3); println((-10)%(-3));        // Prints -1 -1
  }

  static void print(int i)   { System.out.print(i + " "); }

  static void println(int i) { System.out.println(i + " "); }
}

