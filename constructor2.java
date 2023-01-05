class constructor2 {

    String languages;
  
    // constructor accepting single value
    constructor2(String lang) {
      languages = lang;
      System.out.println(languages + " Programming Language");
    }
  
    public static void main(String[] args) {
  
      // call constructor by passing a single value
      constructor2 obj1 = new constructor2("Java");
      constructor2 obj2 = new constructor2("Python");
      constructor2 obj3 = new constructor2("C");
    }
  }
