package hw;
/*
 * Topic:程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，
 * 然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n。
 * Date: 2016/10/17
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class hw03_105021060 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入數字");
		int a = scn.nextInt();
		int p=0, n=0, z=0;
		while(true){
		  while (a != 999){			
            if(a < 0)
            {
                n++;
            }
            else if(a == 0)
            {
                z++;
            }
            else if(a>0)
            {
                p++;
            } 
             a = scn.nextInt();
		  }
            System.out.println(p + " 正");
    	    System.out.println( n + " 負");
    	    System.out.println( z + " 零");
    	    System.out.println("是否繼續(Y/n)");
    	    char j=scn.next().charAt(0);
		      if (j=='n'|| j=='N'){    	  
		    	  System.out.println("程式結束");
                      break;
                      }else{System.out.println("繼續輸入");
                    	 p=0;
                    	 n=0;
                    	 z=0;
                    	 a = scn.nextInt();  
                      }
        }
	}
}