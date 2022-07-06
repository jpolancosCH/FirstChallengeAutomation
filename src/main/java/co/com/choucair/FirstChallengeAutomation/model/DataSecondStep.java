package co.com.choucair.FirstChallengeAutomation.model;

import co.com.choucair.FirstChallengeAutomation.DataDrivenExcel.ExcelReaderHelper;

public class DataSecondStep {
    private static final String file = "C:\\Users\\jpolancos\\IdeaProjects\\co.com.choucair.FirstChallengeAutomation\\src\\test\\resources\\Data\\Data.xlsx";
    private static final ExcelReaderHelper excelReader = new ExcelReaderHelper(file);
    public final String City = getCity();
    public final String Zip = getZip();
    public final String Country = getCountry();

    public String getCity() {
        return excelReader.getData("Step2", 1, 0);
    }

    public String getZip() {
        double ZipDB = Double.parseDouble(excelReader.getData("Step2", 1, 1));
        int ZipInt = (int) ZipDB;
        return String.valueOf(ZipInt);
    }

    public String getCountry() {
        return excelReader.getData("Step2", 1, 2);
    }

}
