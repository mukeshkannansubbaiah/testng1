package testngattributes;

import org.testng.annotations.Test;

public class PriorityAttri  {
//	
//	invocationCount is used to execute a testcases for multiple times,defaultvalue=1,return int[]
//	
//	threadPoolSize used to run methods parallely,default value=1,return int[]
//	
//	priority is used us to decides which testcase we want to run first,default value=0
//	
//	
// if the  enabled=false the testcase not get executed,default value=true,return boolean
//	
//	
	@Test(threadPoolSize=3,invocationCount=7,priority=0)
	public void createLead() {
		System.out.println("Creta lead");
	}
	@Test(priority=2)
	public void editLead() {
		System.out.println("edit lead");

}
	@Test(priority=1)
	public void deleteLead() {
		System.out.println("delete lead");
	}
	@Test(enabled=false)
	public void mergeLead() {
		System.out.println("merge lead");
	}
}