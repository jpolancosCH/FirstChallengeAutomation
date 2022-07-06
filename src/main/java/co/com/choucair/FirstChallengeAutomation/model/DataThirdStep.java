package co.com.choucair.FirstChallengeAutomation.model;

import co.com.choucair.FirstChallengeAutomation.DataDrivenExcel.ExcelReaderHelper;

public class DataThirdStep {

    private static final String file = "C:\\Users\\jpolancos\\IdeaProjects\\co.com.choucair.FirstChallengeAutomation\\src\\test\\resources\\Data\\Data.xlsx";
    private static final ExcelReaderHelper excelReader = new ExcelReaderHelper(file);
    public final String OSComputer = getOSComputer();
    public final String VersionOSComputer = getVersionOSComputer();
    public final String LanguageOSComputer = getLanguageOSComputer();
    public final String BrandMobile = getBrandMobile();
    public final String ModelMobile = getModelMobile();
    public final String OSMobile = getOSMobile();

    private static String getOSComputer() {
        return excelReader.getData("Step3", 1, 0);
    }

    private static String getVersionOSComputer() {
        return excelReader.getData("Step3", 1, 1);
    }

    private static String getLanguageOSComputer() {
        return excelReader.getData("Step3", 1, 2);
    }

    private static String getBrandMobile() {
        return excelReader.getData("Step3", 1, 3);
    }

    private static String getModelMobile() {
        return excelReader.getData("Step3", 1, 4);
    }

    private static String getOSMobile() {
        return excelReader.getData("Step3", 1, 5);
    }

}
