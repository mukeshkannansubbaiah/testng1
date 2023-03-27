package testleafweb;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends FirstClass{

		
		@Test(dataProvider="FetchData")
	  public void  RunLead(String companyName,String firstName,String lastName) {
//			WebDriverManager.chromedriver().setup();
//			ChromeDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("http://leaftaps.com/opentaps/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//			driver.findElement(By.id("password")).sendKeys("crmsfa");
//			driver.findElement(By.className("decorativeSubmit")).click();
//			driver.findElement(By.linkText("CRM/SFA")).click();
//			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();
			driver.close();
	}
		
		@DataProvider(name="FetchData")
		public String[][] daTa() {
//			declare 2 dimensional array
//			first[]-represent row
//			second[]-represent column
			
			String[][] text=new String[2][3];
			
			text[0][0]="testleaf";
			text[0][1]="mukesh";
			text[0][2]="s";
			
			
			text[1][0]="testleaf";
			text[1][1]="michael";
			text[1][2]="s";
			
			return text;
		}
	
		
		
}






