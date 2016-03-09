/* pattern 3 left justified tree */

public class HelloWorld{
     public static void main(String []args){
        System.out.println("Hello World");
        int i,j;
        char c='A';
        for(i=1;i<=6;i++)
        {   
            for(j=1;j<=i;j++)
            {
                System.out.print(c);
            }
        c++;
        System.out.print("\n");
        } 
     }
}
