import java.util.Arrays;
public class TestingController {
  public static void changeMyArr(String[] someArr) {
    System.out.println(someArr);
    System.out.println(someArr[0]);
    someArr[0] = "foo";
    System.out.println(someArr[0]);
}

  public static void main(String[] args) {
    String[] arr = new String[1];
    System.out.println(arr[0]);
    System.out.println(arr);
    changeMyArr(arr);
    System.out.println(arr[0]);
    System.out.println(Arrays.toString(arr));

  }
}
