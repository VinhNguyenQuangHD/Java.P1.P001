package Exercise4;

public class Test {
    public static void main(String[] args){
        int[] arr = new int[5];
        NumberList numberList = new NumberList(5,arr);
        numberList.Input(numberList.getN(),arr);
        numberList.Print(numberList.getN(),arr);
        System.out.println("\n");
        SelectionSoft sls = new SelectionSoft(numberList.getN(),arr);
        sls.sort();
        System.out.println("\n");
        QuickSoft qs = new QuickSoft(numberList.getN(),arr);
        qs.sort();
    }
}
