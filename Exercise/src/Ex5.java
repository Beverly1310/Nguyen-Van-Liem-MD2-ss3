import java.util.Scanner;

public class Ex5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] arr = new int[3][3];
            int min = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("Nhap gia tri cho phan tu arr[%d][%d]",i,j);
                    arr[i][j]=Integer.parseInt(scanner.nextLine());
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j]<min) {
                        min=arr[i][j];
                    }
                }
            }
            System.out.printf("Gia tri nho nhat la: %d",min);
        }
    }

