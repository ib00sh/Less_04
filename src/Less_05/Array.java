package Less_05;


public class Array {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    long a = System.currentTimeMillis();

   void create_arr(){
       for (int i = 0; i < arr.length ; i++) {
           arr[i] = 1;
       }
       System.out.println(" Время наполнения массива: " + a);

       for (int i = 0; i < arr.length ; i++) {
           arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) *
                   Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
       }
       System.out.println(" Время выполнения метода №1: " + (System.currentTimeMillis() - a));
   }
    void part_arr(){
    final int THREADS_COUNT = 2;
    final float[][] arr2 = new float [THREADS_COUNT][h] ;
    Thread[] t = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
        System.arraycopy(arr, h*i, arr2[i], 0, h);


        t[i] = new Thread(new Runnable() {
            @Override
            public void run() {
                //
            }
        });
        t[i].start();

    }
        try {
        for (int i = 0; i < THREADS_COUNT; i++) {
            t[i].join();
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        for (int i = 0; i < THREADS_COUNT; i++) {
        System.arraycopy(arr2[i], 0, arr, i * h, h);
    }
        System.out.println(" Время выполнения метода №2: " + (System.currentTimeMillis() - a));
    }
}
