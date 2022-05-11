package Exercise4;

public class SelectionSoft extends NumberList implements Sort{
    public SelectionSoft(int n, int[] arr) {
        super(n, arr);
    }

    @Override
    public void sort() {
        int[] arr = this.getArr();
        for (int i = 0; i < this.getN(); i++){
            for (int j = i+1; j < this.getN();j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        this.Print(this.getN(),this.getArr());
    }
}
