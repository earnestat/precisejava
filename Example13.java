// Example 13 from page 13
//


class Example13 {
  public static void main(String[] args) {
    String res = String.format("|%1$s|%1$7s|%1$-7s|", "Oslo");
    System.out.println(res);
  }
}

