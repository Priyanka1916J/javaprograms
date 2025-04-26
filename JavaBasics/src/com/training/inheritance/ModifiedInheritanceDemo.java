package com.training.inheritance;

public class ModifiedInheritanceDemo {

	public static void main(String[] args) {

		ModifyedEmployee employee=new ModifyedEmployee("ram",10);
		employee.getDetails();
		ModifiedManager manager1= new ModifiedManager("Tom",20,9000);
		manager1.getDetails();
		//manager.calcBonus(2);

	}

}
