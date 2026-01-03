public class BubbleSort{

    //Intuition : swap adjacent elements[Relevant Swapping]

    public static void main(String[] args) {
        int[] arr={12,23,8,27,16,7,32};
        bubbleSort(arr);
        optimisedBubbleSort(arr);
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       }   //t.c. - O(n^2)

        //Optimised version 

        public static void optimisedBubbleSort(int[] arr){
           for(int i=0; i<arr.length; i++){
              int swap=0;
              for(int j=0;j<arr.length-1-i;j++){    //we are doing n-1-i because the end is already getting sorted
                    if(arr[j]<arr[j+1]){
                        int temp= arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        swap++;
                    }
                    if(swap==0)  break;
              }
            }
            System.out.println();
              for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
              }
           
        } /*  time complexity:
          best case: O(n)
          Avg case: O(n^2)
          Worst case: O(n^2)        
        */



    
}
