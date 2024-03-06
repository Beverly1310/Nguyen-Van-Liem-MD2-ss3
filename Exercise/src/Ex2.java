import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10,4,6,8,0,0,0,0,0};
        System.out.println("Nhap phan tu can them: ");
        int push = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vi tri can them: ");
        int index = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
       if (index>-1 && index < arr.length-1) {
           for (int i = index; i < arr.length-1 ; i++) {
               arr[i]=arr[i+1];
           }
       }
       arr[index-1]=push;
        for (int i : arr) {
            System.out.printf("%d,",i);

        }
    }

}
