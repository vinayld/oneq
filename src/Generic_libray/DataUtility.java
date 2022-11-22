package Generic_libray;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\selenium\\testdata.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	
	public String getDataFromExcelSheet(String sheet1,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\selenium\\Book2.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheet1);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
		
	}
}




