public class TwoSum{
    public static int[] twosum(int[] arr, int target){
        int[] res= new int[2];
        for(int i=0;i<arr.length;i++){
            int t= target-arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[j]==t){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }

            }
        }
        return res;
    }

    public static void main(String[] args){
        int arr[]= {2,7,9,10,11};
        int target=9;
        int[] result= twosum(arr,target);
        for(int i: result){
            System.out.print(i+"\t");

        }
        
    }
    
    
}