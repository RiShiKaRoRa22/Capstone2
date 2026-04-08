class Dutch{
    
     public static void sortColors(int[] nums) {

        int len= nums.length;

        int i=0;
        int j=0;
        int k=0;

        while(k<3 ){
            j=i;;
            
            while( j<len && i<len){
                 if(nums[j]==k){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                 } 
                 j++;

            }
            k++;
        }
        
        
        
    }
    public static void main(String[] args){
        int[] arr= {2,0,0,2,2,1,1,0};
        sortColors(arr);
        for(int i: arr){
            System.out.print(i+" ");

        }
        

    }
}