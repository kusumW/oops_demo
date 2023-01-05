class over{  
    public void Shape(){
    System.out.println("inside shape"); }
    }  
    //Creating child classes.  
    class Rectangle extends over{  
    public void perimeter() {System.out.println("inside rectangleasd"); 
    }}  
      
    class Circle extends over{  
    public void area () {System.out.println("inside circle");}
    }  
    class Triangle extends over{  
    public void square() {System.out.println("inside triangle");}
    }  
    //Test class to create objects and call the methods  
    class Test2 extends over{  
    public static void main(String args[]){  
   // Rectangle s=new Rectangle();  
    Circle i=new Circle();  
    Triangle a=new Triangle();  
   // s.perimeter();  
    i.area();  
    a.square();  
    }  
    }  
    