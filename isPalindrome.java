package GLiu;

public class isPalindrome {
    public static Boolean isPa(String x)
    {
     int half=(x.length())/2;
     String front=x.substring(0,half);
     //get the first half of the string
     String back=x.substring(half);
     //get the second half of the string
     int compare=front.compareToIgnoreCase(back);
     //compare them
     if(compare>0 || compare<0)
     {
         return (false);
     }
    return (true);
    }

}
