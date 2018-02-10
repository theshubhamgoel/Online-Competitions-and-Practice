import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class cooling_pies
{
  public static void main(String[] args) throws NumberFormatException, IOException
  {
    int j = 0,result = 0,count1,count,temp;
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    int testcase = Integer.parseInt(buff.readLine());

    int i = 0;
    while (testcase-->0)
    {
      count = Integer.parseInt(buff.readLine());
      //System.out.println(count);
      
      temp = count1 = count;
      int[] al = new int[count];
      int[] al1 = new int[count];
      String[] str = buff.readLine().split(" ");
      i=0;
      while (count > 0)
      {
        int wt = Integer.parseInt(str[i]);
        al[i] = wt;
        i++;
        count--;
      }
      String[] str1 = buff.readLine().split(" ");
      i = 0;
      while (count1 > 0)
      {
        int lmt = Integer.parseInt(str1[i]);
        al1[i] = lmt;
        i++;
        count1--;
      }
      Arrays.sort(al);
      Arrays.sort(al1);

      result = 0;
      i = temp - 1; for (j = temp - 1; i >= 0; )
      {
        if (al[i] > al1[j]) {
          i--;
        }
        else {
          i--;
          j--;
          result++;
        }
      }
      System.out.println(result);
    }
  }
}