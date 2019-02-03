import java.util.*;
class Diamond{
  public static void main(String []args)
  {
    int n;
    Scanner in=new Scanner(System.in);
    n = in.nextInt();

    int m=n;
    for(int i=0;i<n;i++)
    {
      System.out.println("");
      int k=2*m-1;
      while(k>-(2*(n-1)))
      {
        System.out.print(" ");
        k=k-2;
      }

      for(int j=(2*i+1);j>0;j--)
      {
        System.out.print("1");
      }
      m=m-1;
    }
    int b=n,count;
    int k=n-1;
    for(int i=0;i<n-1;i++)
    {
      System.out.println("");

      while(k>0)
      {
        System.out.print(" ");
        k--;
      }

      for(int x=n;x>0;x--)
      {
        System.out.print("1");
      }
     for(int c=(2*i+1);c>0;c--)
     {
       System.out.print(" ");
     }
     for(int x=n;x>0;x--)
     {
       System.out.print("1");
     }
      b=b-1;
      k=b-1;
    }
     b=n;
     k=n-1;
     int d=0;
     count =0;
    for(int i=n-1;i>=0;i--)
    {
      System.out.println("");

      while(d>0)
      {
        System.out.print(" ");
        d--;
      }
      for(int x=0;x<n;x++)
      {
        System.out.print("1");
      }

     for(int c=(2*i+1);c>1;c--)
     {
       System.out.print(" ");
     }
     System.out.print(" ");
     for(int x=n;x>0;x--)
     {
       System.out.print("1");
     }
      b=b-1;
      k=b-1;
      count++;
      d=count;

    }
    m=n;
    k=n;
    for(int i=n-1;i>=0;i--)
    {
      System.out.println("");

      while(k>0)
      {
        System.out.print(" ");
        k--;
      }

      for(int j=(2*i+1);j>0;j--)
      {
        System.out.print("1");
      }
      m=m+1;
      k=m;
    }


  }
}
