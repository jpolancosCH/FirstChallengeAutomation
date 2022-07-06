package co.com.choucair.FirstChallengeAutomation.DataDrivenExcel;


import org.junit.Test;

/**
* rathr1
**/
public class TestExcelReader {

	@Test
	public void testExcel(){
		ExcelReaderHelper excelReader = new ExcelReaderHelper("C:\\Users\\jpolancos\\IdeaProjects\\co.com.choucair.FirstChallengeAutomation\\src\\test\\resources\\Data\\Data.xlsx");
		System.out.println(excelReader.getData("Step1", 1, 0));
		System.out.println(excelReader.getData("Step1", 1, 1));
		System.out.println(excelReader.getData("Step1", 1, 2));
		System.out.println(excelReader.getData("Step1", 1, 3));
	}
}
