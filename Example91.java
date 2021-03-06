// Example 91 from page 65
//


class Example91 {
  public static void main(String[] args) {
    if (args.length != 1) 
      System.out.println("Usage: java -ea Example91 <integer>\n");
    else {
      int x = Integer.parseInt(args[0]);
      System.out.println("Integer square root of " + x + " is " + sqrt(x));
    }
  }

  // Modified for Java from C code on Paul Hsieh's square root page

  static int sqrt(int x) {  // Algorithm by Borgerding, Hsieh, Ulery
    if (x < 0) 
      throw new IllegalArgumentException("sqrt: negative argument");
    int temp, y = 0, b = 0x8000, bshft = 15, v = x;;
    do {
      if (v >= (temp = (y<<1)+b << bshft--)) {
        y += b; v -= temp;
      }
    } while ((b >>= 1) > 0);
    assert (long)y * y <= x && (long)(y+1)*(y+1) > x;
    return y;
  }
}

