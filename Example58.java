// Example 58 from page 43
//

import java.util.ArrayList;

class SPoint {
  static ArrayList<SPoint> allpoints = new ArrayList<SPoint>();
  int x, y;

  SPoint(int x, int y) { allpoints.add(this); this.x = x; this.y = y; }
  void move(int dx, int dy) { x += dx; y += dy; }
  public String toString() { return "(" + x + ", " + y + ")"; }
  int getIndex() { return allpoints.indexOf(this); }
  static int getSize() { return allpoints.size(); }
  static SPoint getPoint(int i) { return allpoints.get(i); }
}

