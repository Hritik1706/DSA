class left_rotate{

    public static void leftRotate(int arr[], int d){
        int n =arr.length;
        d = d%n;

        int []temp = new int [d];
        

        for(int i=0 ; i<d;i++){
            temp[i]=arr[i];
        }

        for(int i=d ; i<n;i++){
            arr[i-d]=arr[i];
        }

        for(int i=0 ;i<d; i++){
            arr[n-d+i]=temp[i];
        }



    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        leftRotate(arr, 2);
        for(Integer  i : arr){
            System.out.print(i+" ");
        }
        
    }
}
