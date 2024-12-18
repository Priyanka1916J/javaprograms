package com.shristi.array;

public class OneDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int marks[]= new int[4];
      marks[0]=80;
      marks[1]=90;
      marks[2]=80;
      marks[3]=90;
	
 /*for(int i=0;i<marks.length;i++)
 {
	 System.out.println(marks[i]);
 }*/
	int sum=0;
    for(int i=0;i<marks.length;i++)
     {
    	// sum=sum+marks[i];//one method
    	 
    	 sum+=marks[i];//2nd method using += sign to sum
     }
    	 System.out.println("Sum of "+sum);
    	 
    	 for(int var:marks)
    	 {
    		 System.out.println(var);
    	 }
     
}
}