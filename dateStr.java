/* Genjie Liu Pd2-3 9/20/18 */
package GLiu;

public class dateStr {
    public static String date(int mm,int dd,int yyyy)
    {
      //there are day,month and year in a date//
      String dstr=(mm+"/"+dd+"/"+yyyy);
      int index=dstr.indexOf("/");
      String month=dstr.substring(0,index);
      //take out the number of months from the dstr//
      String day=dstr.substring(index+1);
      String dayend=day.substring(0,index);
      //to find the string of days,find out the locations of front and end are needed//
      String year=day.substring(index+1,day.length());
      String fin=dayend+"-"+month+"-"+year;
      System.out.println(fin);
       return("Done!");
    }
}
