package Exercise4;

import java.util.Scanner;

public class NumberList {
    private  int n;
    private int[] arr;

    public NumberList(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Input(int n, int[] arr){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n;i++){
            System.out.println("Nhap vao so:");
            arr[i] = sc.nextInt();
        }
    }

    public void Print(int n,int[] arr){
        for (int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
