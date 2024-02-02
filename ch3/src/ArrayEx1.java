public class ArrayEx1 {

  public static void main(String[] args) {
    int[] arr1 = new int[5];
    int arr2[] = new int[10];
    // int i;
    boolean arr3[] = new boolean[2];

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
    for (int i : arr1) {
      System.out.println(i);
    }

    System.out.println(arr1);
    System.out.println(arr1[0]);
    System.out.println(arr3[0]);
    System.out.println(arr2[0]);
  }
}
