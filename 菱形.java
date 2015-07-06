public class 菱形{
      public static void main(String[] args){
        int line = 5;
        for (int i=0;i< line;i++) { // 外迴圈, 控制換行
            for (int j=1;j<=i;j++) // 內迴圈 1, 控制輸出空白
                System.out.print(" ");
            for (int k=1;k<2*(line-i);k++) // 內迴圈 2, 控制輸出星號
                System.out.print("*");
            System.out.print("\n"); // 每輸出一行就換行
        }
        for (int i=line;i > 0;i--) { // 外迴圈, 控制換行
            for (int j = 0; j < (i - 1); j++) // 內迴圈 1, 控制輸出空白
                System.out.print(" ");
            for (int k = 2 * (line - i)+1; k > 0; k--)  // 內迴圈 2, 控制輸出星號
                System.out.print("*");
            System.out.print("\n"); // 每輸出一行就換行
        }
    }
}
