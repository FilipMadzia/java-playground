public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 7, 3, 1, 8, 9, 4, 6 };

        bubbleSort(array);

        for(int el : array) {
            System.out.print(el + ", ");
        }
    }
}
