public class LamdaDemo {
    public static void main(String[] args){

        InterfaceClass object =(a,b)->{
                if(a>b){
                return a;}
                else{
                    return b;
                }

            };
        System.out.println(object.compareNum(10,20));
        }


    }

// Create a functional interface that takes two numbers and return a number.
// Associate it with a lambda expression where you compare two numbers and returns the greater one