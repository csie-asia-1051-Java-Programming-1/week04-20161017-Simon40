package hw;
/*
 * Topic:使用者輸入正整數 n 與 m 然後計算。
 * Date: 2016/10/17
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class hw02_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println(compute(scn.nextInt(),scn.nextInt()));
	}
    public static int compute(int n,int m){
    	return n+m;
    }
}
