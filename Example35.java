// Example 35 from page 27
//


class Access {
  private static int x; 

  static class SI {
    private static int y = x;       // access private x from enclosing class
  }

  static void m() { 
    int z = SI.y;                   // access private y from nested class
  }
}

