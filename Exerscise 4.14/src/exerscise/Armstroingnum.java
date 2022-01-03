package exerscise;

public class Armstroingnum {
	public static void main(String[] args) {
    
		int no=153,t1,length=0;
		
		t1=no;
		while(t1!=0) {
			
			t1=t1/10;
			length=length+1;
		}
		int t2=no,rem,arm=0;
		
		while(t2!=0) {
	     rem=t2%10;
	     int mull=1;
		for (int i = 1; i <=length; i++) {
          mull=mull*rem;
		}
		arm=arm+mull;
		t2=t2/10;
		}
		if(arm==no) {
			System.out.println(" num is  armstroing");
		}else { 
			System.out.println(" num  is not armstroing");
		
		 
		
		
		}

	}
	}

