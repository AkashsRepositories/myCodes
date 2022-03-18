public class orderAgnostic_BinarySearch {   
//Order agnostic binary search : used when order is unknown but array is sorted
   static int orderAgnosticBinarySearch(int []arr, int target) {
       int index = -1;

       int start = 0;
       int end = arr.length-1;

       while(start <= end){
           int mid = (start+end)/2;
           if(arr[0] < arr[arr.length-1]) {
               //for ascending order
               if(target < arr[mid]){
                   end = mid - 1;
               } else if(target > arr[mid]) {
                   start = mid + 1;
               } else {
                   index = mid;
                   break;
               }
           } else {
               //for descending order
               if(target > arr[mid]){
                   end = mid - 1;
               } else if(target < arr[mid]) {
                   start = mid + 1;
               } else {
                   index = mid;
                   break;
               }
           }
       }

       return index;
   }
  
  
  public static void main(String []args) {

       //order agnostic binary search
       int []myArray = {1,2,3,45,56,76,87,98,100};
       int []myArray2 = {100,98,85,43,21,-1};
       System.out.println(orderAgnosticBinarySearch(myArray, 56));
       System.out.println(orderAgnosticBinarySearch(myArray2, 43));
    
  } 
}
