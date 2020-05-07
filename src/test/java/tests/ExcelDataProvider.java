package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelDataProvider {

    public static String Excel_Path = "C:/Users/USER/Desktop/100days/day2/ExcelDemo.xlsx";
    public static String Sheet_Name=  "Sheet1";

    @Test(dataProvider = "testData")
    public void test(String username,String password)
    {
        System.out.println(username +"   |  "+password);
    }

    @DataProvider(name="testData")
    public Object[][] getData() throws IOException {
        Object data[][]=testData(Excel_Path,Sheet_Name);
        return data;
    }


    public Object[][] testData(String path,String sheet) throws IOException {

        ExcelUtils excelUtil =new ExcelUtils(path,sheet);
        int rowCount = excelUtil.getRowCount();
        int colCount = excelUtil.getColCount();
        Object excelDataObj[][]=new Object[rowCount-1][colCount];
        excelDataObj= excelUtil.getExcelData(rowCount,colCount);
        return excelDataObj;

    }


}
