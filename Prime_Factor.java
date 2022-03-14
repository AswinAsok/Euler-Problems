public class Prime_Factor
{
    public static void main(String args[])
    {
        long output = 0;
        for(long i = 2;i<Math.sqrt(600851475143L)+1;i++){
            if(600851475143L%i == 0)
            {
                if(check(i)){
                    output = i;
                }
            }
        }
        System.out.println(output);
    }

    public static boolean check(long num){
        for(long i = 2;i<Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}