package com.demoblaze.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void messageFromPair() throws IOException {
       String path="PairMessage.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= workbook.getSheet("Pair1");
        System.out.print(sheet.getRow(0).getCell(0)+" ");
        System.out.print(sheet.getRow(0).getCell(1)+" ");
        System.out.print(sheet.getRow(0).getCell(2)+" ");
        System.out.print(sheet.getRow(0).getCell(3)+" ");
        System.out.print(sheet.getRow(0).getCell(4)+" ");
        System.out.print(sheet.getRow(0).getCell(5)+" ");
        System.out.print(sheet.getRow(1).getCell(0)+" ");
        System.out.print(sheet.getRow(1).getCell(1)+" ");
        System.out.print(sheet.getRow(1).getCell(2)+" ");
        System.out.print(sheet.getRow(1).getCell(3)+" ");
        System.out.print(sheet.getRow(1).getCell(4)+" ");
        System.out.print(sheet.getRow(1).getCell(5)+" ");
        System.out.print(sheet.getRow(2).getCell(0)+" ");
        System.out.print(sheet.getRow(2).getCell(1)+" ");
        System.out.print(sheet.getRow(2).getCell(2)+" ");
        System.out.print(sheet.getRow(2).getCell(3)+" ");
        System.out.println();

    }
}
