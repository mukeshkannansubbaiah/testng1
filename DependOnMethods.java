package testngattributes;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DependOnMethods {
	
//	if the depend testcase get failed we will get the skip testcases
//	
//	
//	it accepts ArrayOfvalue,datatype is String[],default value is {}empty array
//	
//	
//	
//	
	
	@Test(priority=0)
	public void createLead() {
		System.out.println("Creta lead");
		throw new NoSuchElementException();
	}
	@Test(priority=2)
	public void editLead() {
		System.out.println("edit lead");

}
	@Test(dependsOnMethods="createLead",priority=1)
	public void deleteLead() {
		System.out.println("delete lead");
	}
	@Test()
	public void mergeLead() {
		System.out.println("merge lead");
	}
}


