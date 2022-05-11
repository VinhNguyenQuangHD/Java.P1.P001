package Exercise4;

public class QuickSoft extends NumberList implements Sort{
    public QuickSoft(int n, int[] arr) {
        super(n, arr);
    }

    public void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int partition(int arr[], int l, int r, int pivot) {
        int leftPointer = l - 1;
        int rightPointer = r;

        while (true) {

            while (arr[++leftPointer] < pivot) {
                // khong lam gi
            }

            while (rightPointer > 0 && arr[--rightPointer] > pivot) {
                // khong lam gi
            }

            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(arr, leftPointer, rightPointer);
            }

        }
        swap(arr, leftPointer, r);
        return leftPointer;
    }

    public void quickSort(int arr[], int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partition(arr, left, right, pivot);
            quickSort(arr, left, partitionPoint - 1);
            quickSort(arr, partitionPoint + 1, right);
        }
    }

    @Override
    public void sort() {
        int[] arr = this.getArr();
        quickSort(arr,0, arr.length-1);
        this.Print(this.getN(),arr);
    }
}
