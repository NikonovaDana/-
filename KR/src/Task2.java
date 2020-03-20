public class Task2 {
    public static void main(String[] args) {
        int[] myArray = new int[8];

        int s = 0;

        for (int i: myArray)
        {
            myArray[i] = s;
            s=s+3;
            System.out.print (myArray[i] + " ");
        }
    }
}

