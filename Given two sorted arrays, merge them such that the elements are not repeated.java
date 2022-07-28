14. Given two sorted arrays, merge them such that the elements are not repeated
Eg 1: Input:
Array 1: 2,4,5,6,7,9,10,13
Array 2: 2,3,4,5,6,7,8,9,11,15
Output:
Merged array: 2,3,4,5,6,7,8,9,10,11,13,15





public class Main {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,9,10,13};
        int[] vrr={2,3,4,5,6,7,8,9,11,15};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>vrr[0]){
                int temp=arr[i];
                arr[i]=vrr[0];
                vrr[0]=temp;
                Arrays.sort(vrr);
            }
        }
        boolean f=true;
        int i=0;
        int last=0;
        while(f)
        { 
            if(i==((arr.length)-1)){
                last=arr[i];
                f=false;
            }
            else if((arr[i])!=(arr[i+1])){
                System.out.print(arr[i]+" "); 
            }
            i++;
        }
         if(last!=vrr[0]){
            System.out.print(last+" ");
        }
        i=0;
         boolean g=true;
         while(g)
        { 
            if(i==((vrr.length)-1)){
                g=false;
            }
            else if((vrr[i])!=(vrr[i+1])){
                System.out.print(vrr[i]+" "); 
            }
            i++;
        }
        System.out.print(vrr[i-1]);
    }
}
