// Example 123 from page 93
//


class Hold<T> { 
  private T contents;

  @SuppressWarnings("unchecked")
  public void set(Object x) { 
    contents = (T)x;                    // Unchecked cast
  }

  public T get() { 
    return contents;
  }
}

class Example123 {
  public static void main(String[] args) {
    Hold<Integer> h = new Hold<Integer>();
    h.set("foo");                       // Succeeds at run-time
    System.out.println("Succesfully executed  h.set(\"foo\")");
    h.get();                            // Succeeds at run-time
    System.out.println("Succesfully executed  h.get()");
    // String s = h.get();              // Illegal, rejected by compiler
    Integer i = h.get();                // Legal, but fails at run-time
    System.out.println("Succesfully executed  Integer i = h.get()");
  }
}


