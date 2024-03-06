import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1= new int[5];
        int[] arr2= new int[6];
        System.out.println("Nhap gia tri cho cac phan tu cua mang 1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]; ",i);
            arr1[i]=Integer.parseInt(scanner.nextLine());
        };
        System.out.println("Nhap gia tri cho cac phan tu cua mang 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]; ",i);
            arr2[i]=Integer.parseInt(scanner.nextLine());
        }
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        };
        for (int i = 0; i < arr2.length; i++) {
                arr3[arr1.length+i] = arr2[i];
            }
        for (int i : arr3) {
            System.out.printf("%d, ",i);
        }
    }
}
