public class SelectionSort {
    //Selection sort - It sorts repeteadly selecting the smallest(or Largest) element from the unsorted portion and swapping it with unsorted element.

     public static void main(String[] args) {
        
        int[] arr={8,4,1,9,-3,6,5};
        selectionSort(arr);
     }

      public static void selectionSort(int[] arr){

        // finding the smallest element at each point 

           for(int i=0;i<arr.length-1;i++){
                
                   int min= Integer.MAX_VALUE;
                // int max= Integer.MIN_VALUE;  -- for sorting in descending order
                 int minIdx=-1;
                   for(int j=i;j<arr.length;j++){
                        
                        if(arr[j]<min){
                            min=arr[j];
                            minIdx=j;
                        }
                   }

                   //swapping
                      int temp= arr[i];
                      arr[i]=arr[minIdx];
                      arr[minIdx]=temp;
           }

           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           }
      }

}
