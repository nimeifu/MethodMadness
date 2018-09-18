package GLiu;

public class GLiuLib {
    public static void println(String dstr)
    {
        String mm="01";
        String dd="30";
        String yyyy="2000";
      dstr=(mm+"/"+dd+"/"+yyyy);
      int index=dstr.indexOf("/");
      String month=dstr.substring(0,index);
      String day=dstr.substring(index+1);

      String dayend=day.substring(0,index);
      String year=day.substring(index+1,day.length());
      String fin=dayend+"-"+month+"-"+year;
      System.out.println(fin);
    }
}
