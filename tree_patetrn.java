/* Tree pattern java program */

public class HelloWorld{

     public static void main(String []args){
         int i,j,d,c=1;
        for(i=10;i>0;i--)
        {
            for(j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            d=c;
            while(d>0){
            System.out.print("*");
            d--;
            }
            c=c+2;
            System.out.print("\n");
        }    
     }
}