package co.com.choucair.FirstChallengeAutomation.DataDrivenExcel;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderHelper {

	private XSSFWorkbook aWorkBook;
	private XSSFSheet aSheet;
	private XSSFRow aRow;
	private XSSFCell aCell;
	
	private String xlFilePath;
	private Map<String, ArrayList<ArrayList<String>>> xlCache;
	
	public ExcelReaderHelper(String filePath) {
		this.xlFilePath = filePath;
		xlCache = new LinkedHashMap<String, ArrayList<ArrayList<String>>>();
	}
	
	
	public String getData(String sheetName,int row,int column){
		if(xlCache.containsKey(sheetName)){
			return getDataFromCache(sheetName,row,column);
		}else{
			return getDataFromXlAfterUpdateInCache(sheetName,row,column);
		}
	}
	
	private String getDataFromCache(String sheetName,int row,int column){
		ArrayList<ArrayList<String>> rowList = xlCache.get(sheetName);
		ArrayList<String> columnList = rowList.get(row);
		return columnList.get(column);
	}
	
	
	private XSSFWorkbook getWorkBook(){
		if(aWorkBook == null){
			try {
				aWorkBook = new XSSFWorkbook(new File(xlFilePath));
			} catch (InvalidFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		return aWorkBook;
	}
	
	private XSSFSheet getSheet(String sheetName){
		XSSFWorkbook book = getWorkBook();
		return book.getSheet(sheetName);
	}
	
	private ArrayList<ArrayList<String>> getDataFromXl(String sheetName){
		ArrayList<ArrayList<String>> rowList = new ArrayList<>();
		ArrayList<String> columnList = null;
		aSheet = getSheet(sheetName);
		
		for(int i = aSheet.getFirstRowNum(); i <= aSheet.getLastRowNum(); i++){
			aRow = aSheet.getRow(i);
			columnList = new ArrayList<>();
			columnList = getColumnData(aRow);
			rowList.add(columnList);
		}
		xlCache.put(sheetName, rowList);
		try {
			aWorkBook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowList;
	}


	private ArrayList<String> getColumnData(XSSFRow aRow) {
		ArrayList<String> columnList = new ArrayList<>();
		for(int j = aRow.getFirstCellNum(); j < aRow.getLastCellNum(); j++){
			aCell = aRow.getCell(j);
			switch (aCell.getCellType()) {
			case NUMERIC:
				columnList.add("" + aCell.getNumericCellValue());
				break;
			case STRING:
				columnList.add(aCell.getStringCellValue());
				break;
			case BOOLEAN:
				columnList.add("" + aCell.getBooleanCellValue());
				break;
			case BLANK:
			case _NONE:
				break;
			case FORMULA:
				break;
			default:
			}
		}
		return columnList;
	}
	
	private String getDataFromXlAfterUpdateInCache(String sheetName,int row,int column){
		ArrayList<ArrayList<String>> rowList =  getDataFromXl(sheetName);
		ArrayList<String> columnList = rowList.get(row);
		return columnList.get(column);
	}
	
	

}
