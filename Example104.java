// Example 104 from page 79
//


class Example104 {
  public static void main(String[] args) {
    StringBuilder res = new StringBuilder();
    for (int i=0; i<args.length; i++)
      res.append(args[i]);
    System.out.println(res.toString());
  }
}

