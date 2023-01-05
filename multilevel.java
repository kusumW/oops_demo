class Shape {
     int a;

   Shape(int a ) {
      this.a=a;
       System.out.println(("sd"));
       
    }
 }
 class Rectangle extends Shape {
    int b; 
      Rectangle(int a,int b){
      super(a);
      this.b=b;
       System.out.println(("dsf"));
    }
  /*   public void area2() {
      System.out.println("Inside area");
   }
   public void area3() {
      System.out.println("Inside area");
   }*/
 }
 class Cube extends Rectangle {
   int c;
    Cube(int a, int b,int c) {
      super(a,b);
      this.c=c;
       System.out.println("sdf");
     //  Cube cube = new Cube();
       //cube.volume();
    }
 }
 public class multilevel {
    public static void main(String[] arguments) {
      
       Cube cube = new Cube(1,2,3);//if we write Shape instead of cube it will aceess only shape
      Shape s = new Shape(5);
      Rectangle r = new Rectangle(2,2 );

       //System.out.println("enter value of a and b");
      // cube.display(a,b);
      // cube.area(3,3);
      // cube.area2();
       //cube.area3();
      // cube.volume(a);
    }
 }
