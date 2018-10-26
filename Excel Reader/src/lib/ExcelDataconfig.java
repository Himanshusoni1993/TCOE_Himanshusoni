package lib;

public class ExcelDataconfig {
	
	public static void main(String[]args) {
		file src= new file("C:\Mukesh\URL.xlsx");
		
			FileInputStream fis =new FileInputStream(src);
			XSSFWorkBook wb= new XSSFWorkBook(fis);
			
		
				
	}
	

}
