public class Rotate{
    public static int[] rotatearr(int k, int[]nums){

    int len= nums.length;

        k=k%len;
        int i=0;
        int j=len-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
       
        i=0;
        j=k-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }

        i=k;
        j=len-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
        return nums;
    }

    public static void main(String[] args){
        int[] arr={2,7,8,9,10,12};

        int[] res=rotatearr(3,arr);
        for(int i:res){
            System.out.print(i+"\t");
        }
    }

        
        
}

