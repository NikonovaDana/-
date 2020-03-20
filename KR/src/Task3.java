public class Task3 {
    public static void main(String[] args) {

        int[] myArray =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        for (int i = 0; i < 12; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 12; i++)
        {
            if(myArray[i] < 6){
                myArray[i] = myArray[i] * 2;
            }
            System.out.print (myArray[i] + " ");
        }
    }
}
