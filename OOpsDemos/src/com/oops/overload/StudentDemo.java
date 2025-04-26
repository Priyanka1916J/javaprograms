package com.oops.overload;



public class StudentDemo {

	
		// TODO Auto-generated method stub
 public void sum(int...marks) {
	int sum=0;
	/*for(int i=0;i<marks.length;i++)
		sum+=marks[i];*/
	
	for(int mark : marks)
		sum +=mark;
	System.out.println("Sum "+sum);
	
}
	
public static void main(String[] args) {
	StudentDemo st= new StudentDemo();
	st.sum(90);
	st.sum(90,56,98);
	st.sum(10,60,90,89,76);
}
}