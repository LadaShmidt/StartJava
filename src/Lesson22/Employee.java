package Lesson22;
/*
 * Обязателньы условие для overloading menjlf является
 * одинаковый или менее строгий access modifier, чем у superclass, одинаковое имя методов и количество параметров 
 * return type overloading метода должен совпадать с методом который мы перезаписали 
 * Методы должны быть non-static, non-final, non-private
 * Переопределение метода (англ. Method overriding) — это возможность реализовать метод так,
 * чтобы он имел идентичную сигнатуру с методом класса-предка,
 * но предоставлял иное поведение, не вызывая коллизий при его использовании. 
 * Так же это один из инструментов реализации полиморфизма.
 */

public class Employee {
	double salary;
	String name;
	private int age;
	int experience;
	public Employee eat() {
		System.out.println("Eat");
		return new Employee();
	}
	public void sleepp() {
		System.out.println("Sleep");
	}

}
