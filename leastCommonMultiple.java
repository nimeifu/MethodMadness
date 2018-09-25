package GLiu;

public class leastCommonMultiple {
    public static int LCM(int num1,int num2,int num3)
    {
        int gcf = 1;
        int lcm = 1;
        int lcmAll=1;
        for(int i=1;i<=num1 && i<=num2 ;i++)
        {
            if (num1% i==0 && num2% i==0)
            {
                gcf=i;
            }
        //i keeps adding until it becomes the common factor of num 1 & num 2
             lcm=((num1*num2)/gcf);
        }
        //find the least common multiple for num 1 and num 2
        // using their product divided by their greatest common factor.
        for(int i=1;i<=lcm && i<=num3;i++)
        {
            if(lcm %i==0 && num3% i==0)
            {
                gcf=i;
            }
            lcmAll=((lcm*num3)/gcf);
            //same method to find the gcf of lcm and num 3 as used for num1 and num 2
        }
        return(lcmAll);
    }
}
