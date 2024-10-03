package A00_Sample_Test;

public class Q1_Find {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr={2,19,8,7,3,11,15,2,1,14,9};
        int[] sortedArr={2,3,5,7,11,15,19,22,25,29};
        // linearSearch(arr,98);
        linearSearch(sortedArr,29);
        binarySearch(sortedArr,29);
    }
    public static void linearSearch(int[] arr,int x){
        long startTime=System.nanoTime();
        int n=arr.length,index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at "+index);
        }
        long endTime=System.nanoTime();
        System.out.println("Linear Search took: "+(endTime-startTime));
    }
    
    public static void binarySearch(int[] arr,int x){
        long startTime=System.nanoTime();
        int n=arr.length,index=-1;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                index=mid;
                break;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at "+index);
        }
        long endTime=System.nanoTime();
        System.out.println("Binary Search took: "+(endTime-startTime));
        
    }

}