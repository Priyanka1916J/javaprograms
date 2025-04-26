package com.training.inheritance;

public class ModifyedEmployee {
		String name;
		int empId;

		

		public ModifyedEmployee(String name, int empId)
		{
			System.out.println(this.name+this.empId);
			
		}






		void getDetails() {
			System.out.println("name " + name);
			System.out.println("empId " + empId);
		}
}
