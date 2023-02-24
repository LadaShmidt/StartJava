package Lesson17;

public class Test1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();//gj умолчанию дается 16 свободных мест
		StringBuilder sb2 = new StringBuilder("Hello world");
		StringBuilder sb3 = new StringBuilder(55);// обозначает кол-во мест в массиве
		System.out.println(sb2.length());
		System.out.println(sb3.length());//не зависимо от того что определенно кол-во мест, они все пустые
		System.out.println(sb2.charAt(5));// может вывести пробел
		System.out.println(sb2.indexOf(" "));
		String s = sb2.substring(5);
		System.out.println(s);
		String s2 = sb2.substring(5,8);
		System.out.println(s2);
		System.out.println(sb2.subSequence(5,8));// выводит знаки в последовательности массива 
		//sb2.append(22);
		System.out.println(sb2);// метод изменил сам sb2
		//sb2.append(sb2);
		System.out.println(sb2);//  выведет два раза измененный объект
		//System.out.println(sb2.insert(5, 55));// на нужное место добавляет указанные значения
//		sb2.deleteCharAt(6);//убирает знак на указанном индексе
		System.out.println(sb2);
//		sb2.reverse();//переворачивает массив
		System.out.println(sb2);
		sb2.replace(0, 5, "people");
		System.out.println(sb2);
		System.out.println(sb2.capacity());//возвращает кол-во зарезервивованных мест в строке 
	}

}
