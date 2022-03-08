package utilitypackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class Readexceldata {
	
	public XSSFWorkbook wb;
	
	public Readexceldata() {
		
		// to read excel file we need to add
		//apachi poi and apachai ooxml to pom.xml
		
		
		File Src = new File("./Testdata/opencart excel.xlsx");
		
		try {
		FileInputStream fis = new FileInputStream(Src);
	    
		 wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
		
			System.out.println("unable to open excel"+e.getMessage());
		} 
	}
	    
	public String Readvalue (String sheetname, int row, int column) {
		
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
		
    public double Readnumericvalue(String sheetname, int row, int column) {
    	
    	
          return  wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();

}




}
