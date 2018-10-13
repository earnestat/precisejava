// Example 43 from page 33
//

import java.util.Iterator;

class Example43 {
  public static void main(String[] args) {
    if (args.length != 1) 
      System.out.println("Usage: java Example43 <string>\n");
    else {
      Iterator<String> seq = suffixes(args[0]);
      while (seq.hasNext())
        System.out.println(seq.next());
    }
  }

  // Create and return an iterator over all non-empty suffixes of s
  static Iterator<String> suffixes(final String s) {
    class SuffixIterator implements Iterator<String> {
      int startindex=0;
      public boolean hasNext() { return startindex < s.length(); }
      public String next() { return s.substring(startindex++); }
      public void remove() { throw new UnsupportedOperationException(); }
    }
    return new SuffixIterator();
  }
}

