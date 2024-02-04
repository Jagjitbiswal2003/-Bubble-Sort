import java.util.Scanner;

 class bubblesort{
         static void bubble(int arr[],int n)
         {
             
                
             
              for(int i=0;i<n-1;i++){
                 for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                       int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                 }
              }
         } 
    
        public static void main(String[] args) {
         Scanner sca = new Scanner(System.in);
         int n;
          System.out.println("Enter the length of array:");
          n=sca.nextInt();
          int arr[] = new int[n];
          System.out.println("Enter elements of array:");
          for (int i = 0; i < n; i++) {
              arr[i]=sca.nextInt();
          }
            System.out.println("Before Swapping:" + " ");
               for(int i=0;i<n;i++)
               System.out.println(arr[i]);
               System.out.println("After Swapping:" + " ");
                bubble(arr,n);
               for(int i=0;i<n;i++)
               System.out.println(arr[i]);
                 
     }
 }

   