package HomeWork14;

public class hm14 {
	public void time() {
		HOUR: for(int h=0;h<=6; h++) {
			MINUTE: for(int m=0;m<=59; m++) {
				if(h>1&&m%10==0) {
					break HOUR;
				}
				for(int s=0;s<=59; s++) {
                   if(s*h>m) {
						continue MINUTE;
					}
					System.out.println(h +":"+m+":"+s);
				}
			}
			
		}
	}
}
		
		
		
		
		
		
		
