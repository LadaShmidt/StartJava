package HomeWork5;

public class EmployeeTest {
	public static void main (String [] args) {
		Employee worker = new Employee();
		Employee worker2 = new Employee();
		worker.id = 5659;
		worker.surname = "Pipka";
		worker.age = 25;
		worker.salary = 205.3;
		worker.department = 6;
		worker.raising();
		worker.Info();
/////////////////////////////////////////////
		worker2.id = 6594;
		worker2.surname = "Zhepa";
		worker2.age = 30;
		worker2.salary = 100.5;
		worker2.department = 6;
		worker2.raising();
		worker2.Info();
	}
}
