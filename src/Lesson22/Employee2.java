package Lesson22;
/*
 * Метод считается Hiden(скрытые) если:
 * 1.Имя аргументов в subclass такой же, что и в parentclass
 * 2.Return в subclaase такой же,что и в parentclass
 * 3.Список аргументов в subclass такой же, что и в parentclass
 * 4.Access modifier в subclass такой же, что и в parentclass
 * 5.Если в parentclass метод является static, то и в subclass он должен быть static
 * 
 * 6.Variable hiding - объвление в subclass переменной с таким же, именем(не обязательно типом), что и в parentclass 
 */
public class Employee2 {
	double salary = 100;
	String name = "Pit";
	private void sleep() {
		System.out.println("Sleep employee");
	}
	static void eat() {
		System.out.println("Eat employee");
	}

	
}
