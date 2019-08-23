package KeyWordDriven;


public class DriverScript {
	

	 public static void main(String[] args) throws Exception 
	 {
	 //Declaring the path of the Excel file with the name of the Excel file
	 String sPath = "/home/userq/Desktop//dataEngine.xlsx"; 
	 //Here we are passing the Excel path and SheetName as arguments to connect with Excel file
	 ReadExcelData.setExcelFile(sPath, "Sheet1");
	 //Hard coded values are used for Excel row & columns for now     
	 //Hard coded values are used for Excel row & columns for now    
	 //In later chapters we will replace these hard coded values with variables    //This is the loop for reading the values of the column 3 (Action Keyword) row by row
	 for (int iRow=1;iRow<=7;iRow++)
	 {
	 String sActions = ReadExcelData.getCellData(iRow, 1); 
	 //Comparing the value of Excel cell with all the keywords in the "Actions" class
	 if(sActions.equals("openBrowser"))
	 { 
	 //This will execute if the excel cell value is 'openBrowser'    
	 //Action Keyword is called here to perform action
		 Methods.openBrowser();
		 System.out.println("1. Open Browser Sucessfully");
	 }
	 else if(sActions.equals("navigate"))
	 {
		 Methods.navigate();
		 System.out.println("2. Navigate to URL");
	 }
	 else if(sActions.equals("input_Username"))
	 {
		 Methods.input_Username();
		 System.out.println("3. Take username sucessfully");
	 }
	 else if(sActions.equals("input_Password"))
	 {
		 Methods.input_Password();
		 System.out.println("4. Take password sucessfully");
	 }
	 else if(sActions.equals("click_Login"))
	 {
		 Methods.click_Login();
		 System.out.println("5. Sucessfully login ");
	 } 
	 else if(sActions.equals("verify_Login"))
	 {
		 Methods.verify_login();
		 System.out.println("6. Verify Login");
	 } 
	 else if(sActions.equals("closeBrowser"))
	 {
		 Methods.closeBrowser();
		 System.out.println("7. After excecution Closed the Browser");
	 } 
	 }
	 }

}
