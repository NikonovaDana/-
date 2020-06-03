import java.util.Scanner;

public class Array {
    public int [] intArray;
    public int n;

    public Array(int N){
        n = N;
        intArray = new int[N];
    }

    public void InputArr() {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите эл-ты массива рамерностью " + n);
        for (int i = 0; i < n; i++){
            intArray[i] = in.nextInt();
        }
    }

    public void ShowArr() {
        System.out.println ("Массив:");
        for (int i = 0; i < n; i++){
            System.out.println (intArray[i]);
        }
    }

    public void SortArr() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < n; i++) {
                if (intArray[i] < intArray[i - 1]) {
                    int t = intArray[i-1];
                    intArray[i-1]=intArray[i];
                    intArray[i] = t;
                    needIteration = true;
                }
            }
        }
    }


}
