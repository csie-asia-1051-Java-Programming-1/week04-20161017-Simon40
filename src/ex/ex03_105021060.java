package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex03_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        for(int x=0;a>x;x++){
        	for(int y=0;x+1>y;y++){
        		System.out.print("*");
        	}
        	System.out.println(" ");
        }
        
	}

}
