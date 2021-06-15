package final_project_TA;


 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFile {
	private final static int studentNum = 10;
	public static void main(String[] args) throws IOException {
		ExcelReader rc=new ExcelReader();
		Student [] student = new Student[studentNum];
		for(int i=0;i<studentNum;++i) {
			student[i] = new Student(rc.getName(i),rc.getId(i));
		}
		System.out.println();
		
		//read file
		String encode = null;
		String decode = null;
		for(int i=0;i<studentNum;++i) {
			FileReader fr = new FileReader(System.getProperty("user.home") + "/Desktop/"+student[i].getId()+".txt");
			BufferedReader br = new BufferedReader(fr);
			encode = br.readLine();
			Encode code = new Encode();
			decode = code.decode(encode);
			System.out.println(decode);
			String[] parts = decode.split("_");
			String score_str = parts[1]; // 034556
			double score = Double.parseDouble(score_str);
			student[i].setGrade(score);
			System.out.println(student[i].getGrade());
			fr.close();
		}
		//generate excel file
		HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Java Books");
         
        Object bookData[][] = new Object[10][3];
        for(int i=0;i<studentNum;++i) {
        	bookData[i][0] = student[i].getName();
        	bookData[i][1] = student[i].getId();
        	bookData[i][2] = student[i].getGrade();
        }
 
        int rowCount = 0;
         
        for (Object[] aBook : bookData) {
            Row row = sheet.createRow(++rowCount);
             
            int columnCount = 0;
             
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Double) {
                    cell.setCellValue((Double) field);
                }
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.home") + "/Desktop/"+"test_write.xls")) {
            workbook.write(outputStream);
        }
	}
}
