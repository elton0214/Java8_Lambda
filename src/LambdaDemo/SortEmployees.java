package LambdaDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class SortEmployees 
{
    void sortEmployees(ArrayList<Employee> empList) 
    {
    	empList.sort((Employee s1, Employee s2)->s1.getName().compareTo(s2.getName())); 
    	empList.forEach((s)->System.out.println(s));
    }
}
