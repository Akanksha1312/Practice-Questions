import java.util.Scanner;

public class basicRec
    {
        public static Scanner scn=new Scanner(System.in);
    
        public static void main(String[] args)
        {
               int n=scn.nextInt();

               printDec(1, n);     
        }

       //recursive function to print numbers in decreasing order from n to 1
       public static void printDec(int st,int end)
       {
            if(st==end+1)
            {
                return;
            }
           
            printDec(st+1, end);
            System.out.print(st+" ");
        }

}
