
class Adder{  
    static int add(int a,int b)
    {return a+b;}  
    static int add(int a,int b,int c)
    {return a+b+c;}  
    } 

    public class overloading {
        public static void main(String[] arguments) {
            System.out.println(Adder.add(2, 2));
            System.out.println(Adder.add(2, 2,3));
        }
    
    }


/*class Adder{  
    static int add(int a,int b){return a+b;}  
    static int add(int a,int b,int c){return a+b+c;}  
    }  
    class TestOverloading1{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11,11,11));  
    }}  */