public class SecLargest {

    public static void main(String[] args) {
      int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = a[0];
        int secondLargest = a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }
        }
    }
}