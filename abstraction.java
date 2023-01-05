
abstract class Shape{  
    char c='s';
    int numb=12;
    abstract void draw();  
    }  
    //In real scenario, implementation is provided by others i.e. unknown by end user  
    class Rectangle extends Shape{  
    void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle1 extends Shape{  
    void draw(){System.out.println("drawing circle");}  
    }  
     
    class abstraction{  
    public static void main(String args[]){ 
        
    Shape s=new Circle1();
    s.draw();  
    }  
    }  
