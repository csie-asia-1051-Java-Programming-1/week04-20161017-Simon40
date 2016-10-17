package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex01_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n;
        int sum=0;
        int a=0;
        while(true){
        	System.out.println("請輸入數字");
        	n=scn.nextInt();
           	if(n>=0){
           		sum=sum+n;
           		a++;
           	}else{
           		if(n==-1){
           			break;
           		}
           	
           	}
           	
        	
        	}
        System.out.println("總合為"+sum);
       	System.out.println("平均為"+sum/a);
        }
        
	}


