package test;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Test(groups= {"regression"})

public class LoanTest extends BaseClass{
	
	@Test(priority=1)
//	@Test(groups= {"sanity"})
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan Test");
	}
	
	@Test(enabled=true, priority=2)
	public void PersonalLoanTest() {
		System.out.println("Inside Personal Loan Test");
	}
	
//	@Test(priority=0)
	public void PersonalLoanTest1() {
		System.out.println("Inside Personal Loan Test1");
	}
	
}
