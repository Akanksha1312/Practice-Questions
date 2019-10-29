import java.util.Scanner;
public class basicRec{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
    int n=scn.nextInt();
    printInc(1, n);
  }

    
    public static void printInc(int st,int end){
        if(st==end+1){
            return;
        }

        System.out.print(st+" ");
        printInc(st+1, end);

       }
    
    }
