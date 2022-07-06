package co.com.choucair.FirstChallengeAutomation.model;


import co.com.choucair.FirstChallengeAutomation.DataDrivenExcel.ExcelReaderHelper;
import co.com.choucair.FirstChallengeAutomation.tasks.FullStep1;


public class DataFirstStep {
    private static final String file = "C:\\Users\\jpolancos\\IdeaProjects\\co.com.choucair.FirstChallengeAutomation\\src\\test\\resources\\Data\\Data.xlsx";
    private static final ExcelReaderHelper excelReader = new ExcelReaderHelper(file);
    public final String FirstName = getFirstName();
    public final String LastName = getLastName();
    public final String EmailAddress = getEmailAddress();
    public final String BirthMonth = getBirthMonth();
    public final String BirthDay = getBirthDay();
    public final String BirthYear = getBirthYear();
    public final String Languages = getLanguages();


    private static String getFirstName() {
        return excelReader.getData("Step1", 1, 0);
    }

    private static String getLastName() {
        return excelReader.getData("Step1", 1, 1);
    }

    private static String getEmailAddress() {
        return excelReader.getData("Step1", 1, 2);
    }

    private static String getBirthMonth() {
        return excelReader.getData("Step1", 1, 3);
    }

    private static String getBirthDay() {
        double DayDB = Double.parseDouble(excelReader.getData("Step1", 1, 4));
        int DayINT = (int) DayDB;
        return String.valueOf(DayINT);
    }

    private static String getBirthYear() {
        double YearDB = Double.parseDouble(excelReader.getData("Step1", 1, 5));
        int YearINT = (int) YearDB;
        return String.valueOf(YearINT);
    }

    private static String getLanguages() {
        return excelReader.getData("Step1", 1, 6);
    }
}
