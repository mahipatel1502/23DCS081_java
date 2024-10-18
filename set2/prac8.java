
public class prac8 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 9};
        int arr2[] = {1, 9, 9};
        int arr3[] = {1, 9, 9, 3, 9};
        array_count(arr);
        array_count(arr2);
        array_count(arr3);
        System.out.println("23dcs081 Mahi patel");

    }

    static void array_count(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        System.out.println("num of times 9 appear in given array : " + count);
    }

}
