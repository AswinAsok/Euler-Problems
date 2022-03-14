import java.util.*;
public class Fib_Series
{
    public static void main(String args[]){
        int first_term = 1;
       int second_term = 2;
       int next_term = first_term+second_term;
       
       //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
       
       int sum = 2;
       
       for(int i = first_term;next_term < 4000000 ; i++){
          if(next_term % 2 == 0){
              sum+=next_term;
          }
          
           first_term = second_term;
           second_term = next_term;
           next_term = first_term+second_term;
       }
       System.out.println(sum);
    }
}