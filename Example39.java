// Example 39 from page 31
//


class Point {
  int x, y;

  Point(int x, int y) { this.x = x; this.y = y; }

  Point(Point p) { this(p.x, p.y); }    // calls the above constructor

  void move(int dx, int dy) { x += dx; y += dy; }

  @Override
  public String toString() { return "(" + x + ", " + y + ")"; }
}

