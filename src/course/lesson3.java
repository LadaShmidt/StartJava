package course;

class lesson3 {
	public static void main (String [] args) {
		int a1 = 5;
		int a2 = a1*2;
		int a3 = 4, a4 = 5, a5 = 6;
		System.out.println(a1+a1);
		
		int a6 = a1+a2;
		System.out.println(a6);
///////////////////////////////////////////////////////////////////////////		
		int b1 = 10;
		int b2 = 3;
		int b3 = b1/b2;
		System.out.println(b3);
///////////////////////////////////////////////////////////////////////////		
		double c1 = 10;
		double c2 = 3;
		double c3 = c1/c2;
		System.out.println(c3);
///////////////////////////////////////////////////////////////////////////		
		int d1 = 12;
		int d2 = 5;
		int d3= d1/d2;
		int d4 = d1%d2;
		d1++;
		d2--;
		int d5 = ++d2;
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d5);
///////////////////////////////////////////////////////////////////////////		 
		int e1 = 6;
		e1 += 3;
		System.out.println(e1);
		
		int e2 = 6;
		e2 -= 3;
		System.out.println(e2);
///////////////////////////////////////////////////////////////////////////		
		int f1 = 1;
		int f2 = 1;
		int f3 = 1;
		f1 = f2 = f3 = 18;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
///////////////////////////////////////////////////////////////////////////		
		int g1 = 3;
		int g2 = 5;
		boolean g3 = g1>g2;
		System.out.println(g3);
		
		boolean g4 = g1<=g2;
		System.out.println(g4);
		
		boolean g5 = g1==g2;
		System.out.println(g5);
		
		boolean g6 = g1!=g2;
		System.out.println(g6);
///////////////////////////////////////////////////////////////////////////		
		 boolean h1 = true;
		 boolean h2 = false;
		 boolean h3 = true;
		 boolean h4 = h1&&h2&&h3;
		 System.out.println(h4);
		 
		 boolean h5 = h1||h2||h3;
		 System.out.println(h5); 
		 
		 boolean h6 = !h1;
		 System.out.println(h6);
///////////////////////////////////////////////////////////////////////////	
		 int i1 = 10;
		 int i2 = 20;
		 boolean i3 = !(i1>i2);
		 System.out.println(i3);
///////////////////////////////////////////////////////////////////////////	
		 int j1 = 1;
		 int j2 = 2;
		 int j3 = 3;
		 int j4 = 4;
		 boolean j5 = j1<j2&&j4>j3;
		 boolean j6 = j1>j2&&j3>j4;
		 boolean j7 = j1>j2||j3<j4;
		 System.out.println(j5);
		 System.out.println(j6);
		 System.out.println(j7);
///////////////////////////////////////////////////////////////////////////	
		 int k1 = 10; //1010
		 int k2 = 5;  //0101
		 System.out.println(k1&k2); //0000
		 System.out.println(k1|k2); //1111 
///////////////////////////////////////////////////////////////////////////
		 boolean l1 = true;
		 boolean l2 = false;
		 boolean l3 = false;
		 boolean l4 = false;
		 System.out.println(l1^l2^l3^l4);
///////////////////////////////////////////////////////////////////////////
		 ///home work///
		 //1
		 int m1 = 5;
		 int m2 = 11;
		 double m3 = 5.5;
		 double m4 = 1.3;
		 long m5 = 20L;
		 double result = 0;
		 result = m2/m3+m4%m1-m5; //11/5.5+1.3%5-20
                                  //2+1.3-20
		                          //3.3-20
		                          //-16.7
		 System.out.println(result);
		 //2
		 int n1 = 5;//4,3,4,5
		 int n2 = 8;//9,10,11,10
		 int n3 = 10;
		 int n4 = 4; 
		 System.out.println(n1-- - --n1 + ++n1 + n1++ + n1);
		                   //5-3+4+4+5
		                   //2+8+5
		                   //10+5
		                   //15
		 System.out.println(++n2 - n2++ + ++n2 - --n2);
		                   //9-9+11-10
		                   //0+1
		                   //1
		 System.out.println(++n2 - n3++ / ++n4- --n2);
		                   //n2=9
		                   //n1=5 10/5=2 
		                   //9-2-8=-1
	}
}
