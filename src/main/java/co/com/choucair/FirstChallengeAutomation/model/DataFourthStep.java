package co.com.choucair.FirstChallengeAutomation.model;

import co.com.choucair.FirstChallengeAutomation.DataDrivenExcel.ExcelReaderHelper;

public class DataFourthStep {

    private static final String file = "C:\\Users\\jpolancos\\IdeaProjects\\co.com.choucair.FirstChallengeAutomation\\src\\test\\resources\\Data\\Data.xlsx";
    private static final ExcelReaderHelper excelReader = new ExcelReaderHelper(file);
    public final String password = getPassword();
    public final String confirmPassword = getConfirmPassword();

    public String getPassword() {
        return excelReader.getData("Step4", 1, 0);
    }

    public String getConfirmPassword() {
        return excelReader.getData("Step4", 1, 1);
    }


}
