import java.util.ArrayList;
import java.util.Iterator;

public class Elements {
    public static void main(String[] args){
        ArrayList<Integer> str=new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        str.add(4);
        str.add(5);
        int sum=0;
        System.out.println(str);
        for(Integer i:str){


        if(!(i % 2==0)){

            sum=sum+i;
            System.out.println(i);

        }}


        System.out.println(sum);
}}
