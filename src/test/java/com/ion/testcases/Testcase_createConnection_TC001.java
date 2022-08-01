package com.ion.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ion.utilities.XLUtils;

import com.ion.pageObject.createConnection;

public class Testcase_createConnection_TC001 extends BaseClass {

	@Test (dataProvider="registerCusData")
	public void registerCustomer(String Name,String Mob,String Emaill,String pincodee,String Area,String Housenum,String statee,String CITy ,String Oranization,String Alttrno,String Landline,String AAssname,String assno,String AAssemail) throws InterruptedException{
		
		createConnection cc = PageFactory.initElements(driver, createConnection.class);
		cc.createUser(Name, Mob, Emaill, pincodee, Area, Housenum, statee, CITy, Oranization,Alttrno, Landline, AAssname, assno, AAssemail);
		Thread.sleep(3000);
		}
	
	@DataProvider(name="registerCusData")
	String[][] getData() throws IOException, InterruptedException{
		//String path = "F:\\JavaSeleniumProgram\\inetBanking\\src\\test\\java\\com\\inetbanking\\testData\\LoginData.xlsx";
		String path =System.getProperty("user.dir")+"/src/test/java/com/ion/testData/registerCusData.xlsx";
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String cusData[][] = new String[rowcount][colcount];
		System.out.println(cusData);
		for(int i=1;i<=rowcount;i++){
			for(int j=0;j<colcount;j++){
				cusData[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j); //1,0
			}
		}
		
		return cusData;
	}
	
}
