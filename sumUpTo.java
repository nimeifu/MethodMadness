package GLiu;

public class sumUpTo {
    public static int sum(int num)
    {   int sum=0;
        int sumNum=0;
        for(int i=0;i<num;i++)
        {
           sum+=i;
           //sum=sum+i,where i would keep increasing as it approaching num
           sumNum=sum+num;
           //add the input to the sum
        }
        return (sumNum);
    }
}
