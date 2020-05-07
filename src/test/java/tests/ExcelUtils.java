package tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {
    static XSSFWorkbook workbook1;
    static XSSFSheet xssfsheet1;

    public ExcelUtils(String Path,String Sheet) throws IOException {
        workbook1 = new XSSFWorkbook(Path);
        xssfsheet1 = workbook1.getSheet(Sheet);
        // "C:/Users/USER/Desktop/100days/day2/ExcelDemo.xlsx"
        // "Sheet1"
    }


    public  int  getRowCount() {
        int rowsCount = xssfsheet1.getPhysicalNumberOfRows();
        System.out.println("rowCount is " + rowsCount);
        return rowsCount;
    }

    public int getColCount() {
        int colCount = xssfsheet1.getRow(0).getPhysicalNumberOfCells();
        System.out.println("rowCount is " + colCount);
        return colCount;
    }

    public Object[][] getExcelData(int rowsCount,int colCount) {
        String celldata;
        Object excelData[][]=new Object[rowsCount-1][colCount];
        System.out.println("UserName        Password");

        //System.out.println("rowCount is " + rowsCount);
        for (int i = 1; i <rowsCount; i++) {
            colCount = xssfsheet1.getRow(i).getPhysicalNumberOfCells();
          //  System.out.println("colCount is " + colCount);
            for (int j = 0; j < colCount; j++) {
                celldata = xssfsheet1.getRow(i).getCell(j).getStringCellValue();
                //System.out.println("cell data @ row " + i + " and column " + j + " is: " + celldata);
                System.out.print(celldata+"             ");

                excelData[i-1][j]=celldata;
            }
            System.out.print("\n");
        }
        return excelData;
    }




}
