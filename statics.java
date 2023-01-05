public class statics {
    static void display() {
       System.out.println("Inside display");
    }
 
 
    public void area() {
       System.out.println("Inside area");
    }
 
 
    public static void main(String[] args) {
      display();
      statics obj =new statics();
      obj.area();
    }}