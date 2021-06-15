package final_project_TA;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  

public class ExcelReader   
{  
	public static void main(String[] args)   
	{  
		ExcelReader rc=new ExcelReader();   //object of the class  
		
		String vOutput=rc.ReadCellDataString(1, 1);
		System.out.println(rc.getId(2));
		System.out.println(rc.getName(2));
		rc.WriteCellDataInt(3,3,1);
		System.out.println(vOutput);  
		vOutput=rc.ReadCellDataString(1, 1);
		System.out.println(vOutput);
	}  
//method defined for reading a cell  
public String getId(int num) {
	//start from 0
	ExcelReader id=new ExcelReader();
	String value = id.ReadCellDataString(num+1,1);
	return value;
}

public String getName(int num) {
	//start from 0
	ExcelReader name=new ExcelReader();
	String value = name.ReadCellDataString(num+1,0);
	return value;
}
//read the 
private String ReadCellDataString(int vRow, int vColumn)  
{  
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null  
	try  
	{  
		//reading data from a file in the form of bytes  
		FileInputStream fis=new FileInputStream("/Users/kounuki/test/test.xls");  
		//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
		wb=new HSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
		e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
		e1.printStackTrace();  
	}  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column 
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
}  

private double ReadCellDataInt(int vRow, int vColumn)  
	{  
	double value=0;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null  
	try  
	{  
		//reading data from a file in the form of bytes  
		FileInputStream fis=new FileInputStream("/Users/kounuki/test/test.xls");  
		//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
		wb=new HSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
		e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
		e1.printStackTrace();  
	}  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column 
	value=cell.getNumericCellValue();    //getting cell value  
	return value;               //returns the cell value  
	} 

private void WriteCellDataInt(int vRow, int vColumn,int value)  
{   
	Workbook wb=null;           //initialize Workbook null  
	try  
	{  
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("/Users/kounuki/test/test.xls");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb=new HSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
		e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
		e1.printStackTrace();  
	}  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column 
	cell.setCellValue(value);    //getting cell value  
	} 
}
