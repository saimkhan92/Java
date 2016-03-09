public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        binarySearch(444);
     }
    
     public static boolean binarySearch(int key)
     {
        int[] list={1,3,5,7,9,11,44,66,88,99,123,456};
        int left=0;
        int right=list.length;
        int middle=left+right/2;
        
        while(right>left)
        {
            
            
        if(key>list[middle])
        {
            left=middle+1;
        }
        else{right=middle-1;}
        middle=(left+right)/2;
        
        if(list[middle]==key)
            {System.out.println("Key Found!");
                return true;}
            
            
        }       
        System.out.println("NOT FOUND");
        return false;
        
    
     }

}
