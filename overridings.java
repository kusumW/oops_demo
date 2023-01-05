class SuperClass{
   public static void sample(){
      System.out.println("in rectangle");
   }
}

class Subclass extends SuperClass{
   public static void sample(){
      System.out.println("in shape");
   }
}
public class overridings extends SuperClass {
   public static void sample(){
      System.out.println("in area");
   }
   public static void main(String args[]){
      SuperClass obj1 = new overridings();
      Subclass obj3 = new Subclass();
      overridings obj2 = new overridings();
      
      obj1.sample();
      obj2.sample();
      obj3.sample();
   }
}