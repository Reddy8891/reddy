public class VariableArguments {
    static void fun(int... a)
    {
        if(a.length==0){
        System.out.println("welcome message ");}
        else if (a.length==1){
            System.out.println(a[0]+10);
        }
        else if (a.length==2) {

                float average = 0;

                average = (a[0]+a[1])/2;


                System.out.println(average);

        }
        else{
            int sum=a[0]+a[1]+a[2];
            System.out.println(sum);
        }
    }

    public static void main(String args[])
    {
        fun();
        fun(1);
        fun(1,2);
        fun(1,2,3);


    }
}
// Create a method with variable arguments where if no parameter is passed
// then a welcome message will be displayed.
// for single parameter: add 10 and display
// for two parameters: average of the numbers
// for three parameters: sum of the numbers