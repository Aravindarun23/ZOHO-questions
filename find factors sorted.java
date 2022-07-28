17. To find the factors of the numbers given in an array and to sort the numbers in
descending order according to the factors present in it.

Input:
Given array : 8, 2, 3, 12, 16
Output:    12, 16, 8, 2, 3
    
    
public class Main {
    static int numberoffactors(int value){
            int cnt=0;
            for(int i=2;i<value;i++){
                if(value%i==0){
                    cnt++;  
                }
            }
            return cnt;
        }
        
    static int[] sorted(int[] arr,int[] factors){
        for(int i=0;i<factors.length;i++){
            for(int j=i;j<factors.length;j++){
                if(factors[i]<factors[j]){
                    int temp1=factors[i];
                    int temp2=arr[i];
                    factors[i]=factors[j];
                    arr[i]=arr[j];
                    factors[j]=temp1;
                    arr[j]=temp2;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={8,2,3,12,16};
        int[] factors=new int[arr.length];
        int j=0;
        for(int a:arr){
            factors[j]=numberoffactors(a);
            j++;
        }
        sorted(arr,factors);
        System.out.println(Arrays.toString(arr));
    }
}
