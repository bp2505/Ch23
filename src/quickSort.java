import java.util.Random;

public class quickSort {
    public static void main(String[]Args){
        Integer[] test = new Integer[20];
        test = randomArrayGenerator();
        quickSortMethod(test,0,test.length-1);
        for (Integer y: test){
            System.out.println(y);
        }
    }
    public static Integer[] list = new Integer[20];
    public static Integer[] randomArrayGenerator(){
        Random random = new Random();
        for (int x = 0; x < 20; x++){
            list[x] = random.nextInt(999) + 1;
        }
        return list;
    }
    public static void quickSortMethod(Integer[] x, int low, int high){
        if (low < high){
            int part = partition(x,low,high);
            quickSortMethod(x, low, part -1);
            quickSortMethod(x, part+1, high);
        }

    }
    public static int partition(Integer[] x, int low, int high){
        int pivot = x[high];
        int i = low-1;
        for (int j = low; j < high; j++){
            if (x[j] <= pivot){
                i++;
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
        int temp = x[i+1];
        x[i+1] = x[high];
        x[high] = temp;
        return i+1;
    }
}
