import java.util.*;
public class Product3_5
{
    public static void main(String args[])
    {
        int sum = 0;
        for(int i = 1 ; i<1000 ;i++){
            if(i%3==0){
                sum+=i;
            }else if(i%5==0){
                sum+=i;
            }
        }
        System.out.println("Sum:"+sum);
    }
}