public class RBS {

    static int Search(int[] arr,int target){
        int pivot = Pivot(arr);
        if(pivot==-1){
            return BS(arr,target,0,arr.length-1);
        }
        else if(arr[pivot]==target){
            return pivot;
        }
        else if(arr[0]>target){
            return BS(arr,target,pivot+1,arr.length-1);
        }
        else if(arr[0]<target){
            return BS(arr,target,0,pivot-1);
        }

    return -1;

    }

    static int BS(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = (start + end)/2;

            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid + 1;

            }
            else{
                return mid;
               
            }
        
        }
        return -1;
    }

    static int Pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;

            }
            else if(mid<end && arr[mid]<arr[mid-1]){
                return mid-1;
            
            }
            else if(arr[start]>arr[mid]){
                end = mid-1;
            }
            else if(arr[start]<arr[mid]){
                start = mid+1;
            }

        }

        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("element is at index: "+Search(arr,1));
        //System.out.println(BS(arr, 3, 0, arr.length-1));
        
        
    }


    
}
