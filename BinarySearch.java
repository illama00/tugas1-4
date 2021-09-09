public class BinarySearch{
    public static void binarySearch(int arr[], int start, int last, int key){
      int mid = (start + last)/2;
      while( start <= last ){
         if ( arr[mid] < key ){
           start = mid + 1;   
         }else if ( arr[mid] == key ){
           System.out.println("ditemukan di dalam index ke: " + mid);
           break;
         }else{
            last = mid - 1;
         }
         mid = (start + last)/2;
      }
      if (start > last){
         System.out.println("tidak ada di dalam index");
      }
    }
    public static void main(String args[]){
           int arr[] = {1,2,3,4,5,6,7,8,9};
           int key = 3;
           int last=arr.length-1;
           binarySearch(arr,0,last,key);	
    }
   }