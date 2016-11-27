package hw;
/*
 * Topic:使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 ) 1, 1, 2, 3, 5。
 * Date: 2016/10/17
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class hw01_105021060 {

	public static void main(String args[]){            
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a = 0; 
        int b = 1; 
        int t = 0;
        for(int i=2;i<=n+1;i++ ){
     	   t = b; 
            b = a + b; 
            a = t; 
            System.out.println(a);
        }
	}
}