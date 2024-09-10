package com.automation.utils;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderClass {

    @DataProvider(name = "Brand Name data")
    public static Object[][] brandNamesData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/ShoppersStop.xlsx");
        XSSFSheet sheet = workbook.getSheet("BrandNames");
        Object[][] obj = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
        for (int k = 1; k <= sheet.getLastRowNum(); k++) {
            Row row = sheet.getRow(k);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                XSSFCell cell = (XSSFCell) row.getCell(i);
                obj[k - 1][i] = cell.getStringCellValue();
            }
        }
        return obj;
    }
    @DataProvider(name = "Category Name")
    public static Object[][] categoryNamesData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/ShoppersStop.xlsx");
        XSSFSheet sheet = workbook.getSheet("CategoryNames");
        Object[][] obj = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
        for (int k = 1; k <= sheet.getLastRowNum(); k++) {
            Row row = sheet.getRow(k);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                XSSFCell cell = (XSSFCell) row.getCell(i);
                obj[k - 1][i] = cell.getStringCellValue();
            }
        }
        return obj;
    }

}
