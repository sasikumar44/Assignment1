public class Q8{  
    
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {1,1,2,2,2,3,3,4,4,4,4};   
          int count=1;
          int i = 0;
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(i = 0; i < arr.length-1; i++) {  
            if(arr[i]==arr[i+1]){
                count++;
            }else{
            System.out.println("\t"+arr[i]+"\t\t\t\t"+count);
        count=1;
            } 
        }
        System.out.println("\t"+arr[i]+"\t\t\t\t"+count);
    }  
}