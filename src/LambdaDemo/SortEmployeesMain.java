package LambdaDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortEmployeesMain
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> empList=new ArrayList<>();
		
//		 int n=Integer.parseInt(br.readLine().trim());
//		 for(int i=0;i<n;i++)
//		 {
//			 String inp=br.readLine();
//	         String inparr[]=inp.split(" ");
//			 
//			 Employee ws=new Employee(inparr[0],Integer.parseInt(inparr[1]), Integer.parseInt(inparr[2]));
//			 empList.add(ws);
//			 
//		 }
		 empList.add(new Employee("Messi",1, 29));
		 empList.add(new Employee("Aessi",2, 22));
		 empList.add(new Employee("Cessi",3, 21));
		
		SortEmployees s1=new SortEmployees();
		s1.sortEmployees(empList);
    }
}

