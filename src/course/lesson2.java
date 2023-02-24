package course;

class lesson2 {
 public static void main (String [] args) {
	 byte b1 = 10;
	 byte b2 = 20;
	 byte b3 = 100;
	 
	 short s1 = 5;
	 short s2 = -10;
	 short s3= 0;
	 
	 int i1 = 500; //тип данных для целых чисел по умолчанию 
	 
	 long l1 = 1000;
	 long l2 = 10000000000L; 
	 
	 float f1= 3.14f;
	 double d1 = 5.5;//тип данных для дробных чисел по умолчанию
	 float f2 = 20; 
	 
	 char c1 = 'a';
	 char с2 = 'A';
	 char c3 = '7';
	 char c4 = ' ';
	 char c5 = 550;
	 char c6 = '\u1234';
	 
	 boolean bool1 = true;
	 boolean bool2 = false; 
	 
	 int i2 = 60;
	 int i3 = 0b111100;
	 int i4 = 074;
	 int i5 = 0x3c;
	 
	 int i6 = 1_000_000_000;
	 
	 
	 
	 // home work
     //1
	 byte b4 = 0b1100; //BIN
	 byte b5 = 12;     //DEC
	 byte b6 = 014;    //OCT
	 byte b7 = 0xc;    //HEX
	 System.out.println(b4);
	 System.out.println(b5);
	 System.out.println(b6);
	 System.out.println(b7);
	 
	 short s4 = 0b010100010100; //BIN
	 short s5 = 1300;           //DEC
	 short s6 = 02424;          //OCT
	 short s7 = 0x514;          //HEX
	 System.out.println(s4);
	 System.out.println(s5);
	 System.out.println(s6);
	 System.out.println(s7);
	 
	 int i7 = 0b0;  //BIN 
	 int i8 = 0;    //DEC
	 int i9 = 00;   //OCT
	 int i10 = 0x0; //HEX
	 System.out.println(i7);
	 System.out.println(i8);
	 System.out.println(i9);
	 System.out.println(i10);
	 
	 long l3 = 0b0111010110111100110100010101L; //BIN
	 long l4 = 123456789L;                      //DEC
	 long l5 = 0726746425L;                     //OCT
	 long l6 = 0x75BCD15L;                      //HEX
	 System.out.println(l3);
	 System.out.println(l4);
	 System.out.println(l5);
	 System.out.println(l6);
	 
	 //2
	 float f3 = 30; 
	 float f4 = 8.9f;
	 System.out.println(f3);
	 System.out.println(f4);
	 
	 double d2 = 9.5;
	 double d3 = 6.50;
	 System.out.println(d2);
	 System.out.println(d3);
	 
	 boolean bool3 = true; 
	 boolean bool4 = false; 
	 System.out.println(bool3);
	 System.out.println(bool4);
	 
	 //3
	 char c7 = 'b';
	 char c8 = 'B';
	 char c9 = '8';
	 char c10 = ' ';
	 char c11 = 920;
	 char c12 = '\u0041';
	 System.out.println(c7);
	 System.out.println(c8);
	 System.out.println(c9);
	 System.out.println(c10);
	 System.out.println(c11);
	 System.out.println(c12);
 } 
}
