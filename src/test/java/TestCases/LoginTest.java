package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Loginpage;
import TestBasePack.Testbase;

public class LoginTest extends Testbase{
Loginpage oo;
String title;
public LoginTest()
{
	super();
}
@BeforeSuite
public void Launch()
{
	initialization();
	oo=new Loginpage();
}
@Test
public void Checktitle()
{
	title=oo.verifyTitle();
	Assert.assertEquals(title, "OrangeHRM");
}
@Test
public void LoginDet()
{
	oo.Login();
}
}
