package hw;
/*
 * Topic:�{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���A
 * �M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA�t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn�C
 * Date: 2016/10/17
 * Author: 105021060 ���T��
 */
import java.util.Scanner;
public class hw03_105021060 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scn = new Scanner(System.in);
		System.out.println("��J�Ʀr");
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
            System.out.println(p + " ��");
    	    System.out.println( n + " �t");
    	    System.out.println( z + " �s");
    	    System.out.println("�O�_�~��(Y/n)");
    	    char j=scn.next().charAt(0);
		      if (j=='n'|| j=='N'){    	  
		    	  System.out.println("�{������");
                      break;
                      }else{System.out.println("�~���J");
                    	 p=0;
                    	 n=0;
                    	 z=0;
                    	 a = scn.nextInt();  
                      }
        }
	}
}