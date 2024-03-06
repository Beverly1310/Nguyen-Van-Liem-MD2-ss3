import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhap phan tu can xoa: ");
        int delete = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==delete) {
                flag=true;
                index=i;
                break;
            }
        }
        if (flag) {
            for (int i = index; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
            for (int i : arr) {
                System.out.println(i);
            }
        }
        else {
            System.out.print("Phan tu khong ton tai");
        }

    }
}
