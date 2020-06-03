import java.util.Arrays;

public class Metods {
    final int SIZE = 10000000;
    final int HALF = SIZE / 2;
    float test;

    public static void main(String[] args) {
        Metods Metod = new Metods ( );
        Metod.Metod1 ( );
        Metod.Metod2 ( );
    }

    void Metod1() {
        float[] arr = new float[SIZE];
        Arrays.fill (arr, 1);

        long a = System.currentTimeMillis ( );

        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin (0.2f + i / 5) * Math.cos (0.2f + i / 5) * Math.cos (0.4f + i / 2));

        System.out.printf ("Время работы первого метода = " + (System.currentTimeMillis ( ) - a));
        System.out.println ( );
    }

    void Metod2() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        Arrays.fill (arr, 1);

        long a = System.currentTimeMillis ( );

        System.arraycopy (arr, 0, arr1, 0, HALF);
        System.arraycopy (arr, HALF, arr2, 0, HALF);

        Thread one = new Thread (new RunnableClass (arr1, 0));
        Thread two = new Thread (new RunnableClass (arr2, HALF));
        one.start ( );
        two.start ( );

        try {
            one.join ( );
            two.join ( );
        } catch (InterruptedException ex) {
            ex.printStackTrace ( );
        }

        System.arraycopy (arr, 0, arr, 0, HALF);
        System.arraycopy (arr, 0, arr, HALF, HALF);

        System.out.printf ("Время работы второго метода = " + (System.currentTimeMillis ( ) - a));
        System.out.println ( );
    }
}
class RunnableClass implements Runnable{
        private float[] array;
        private int shift;

        RunnableClass(float[] array, int shift){
            this.array = array;
            this.shift = shift;
        }
    @Override
    public void run(){
            for(int i = 0; i < array.length; i++){
                array[i] = (float)(array[i] * Math.sin (0.2f + (i+shift) / 5) * Math.cos (0.2f + (i+shift) / 5) * Math.cos (0.4f + (i+shift) / 2));
            }
        }
    }



