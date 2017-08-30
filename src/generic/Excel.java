package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Auto_const{
	
	public static String getCellValue(String PATH,String sheet,int row,int cell) 
	{
		String v=" "; 
		try{
		FileInputStream fis=new FileInputStream(PATH);
	Cell c = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell);
		 v = c.getStringCellValue();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}

}
