package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
public static String getExcalSheet( int Row,int cell,String sheetname) throws EncryptedDocumentException, IOException  {
	FileInputStream file= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\zerodakite\\src\\main\\resources\\Book2.xlsx");
	
	String value= WorkbookFactory.create(file).getSheet(sheetname).getRow(Row).getCell(cell).getStringCellValue();
	return value;
}
}
