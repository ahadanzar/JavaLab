import java.util.Scanner;

public class sort {
    static void swap(String arr[], int x, int y){
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(String arr[], int low, int high){
        String pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j].compareToIgnoreCase(pivot) < 0){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    static void quicksort(String arr[], int low, int high){
        if(low<high){
            int location = partition(arr, low, high);
            quicksort(arr, low, location-1);
            quicksort(arr, location+1, high);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n=sc.nextInt();
        String arr[]= new String[n+1];
        System.out.println("Enter names :");
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextLine();
        }
        quicksort(arr, 0, n);
        System.out.print("\nSorted names :");
        for (String i : arr)
            System.out.println(i);
    }
}
