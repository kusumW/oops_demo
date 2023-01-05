class default_constructor {

    int a;
    boolean b;
  
    public static void main(String[] args) {
  
      // A default constructor is called
      default_constructor obj = new default_constructor();
  
      System.out.println("Default Value:");
      System.out.println("a = " + obj.a);
      System.out.println("b = " + obj.b);
    }
  }