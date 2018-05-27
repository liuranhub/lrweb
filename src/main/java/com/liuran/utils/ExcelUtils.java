package com.liuran.utils;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {
    public static int toIndex(String line){
        if (line == null || line.length() < 1){
            return 0;
        }
        line = line.trim().toLowerCase();

        //计算最大的系数
        int base = 1;
        for (int i = 1; i < line.length() ; i ++){
            base = base * 26;
        }

        //计算index
        int index = 0;
        for (int i = 0; i < line.length() ; i ++){
            if (i == line.length() - 1){
                int units = line.charAt(line.length() - 1) - 'a';
                index = index + units;
            }

            index = index + ((line.charAt(i) - 'a' + 1) * base);
            base = base / 26;
        }

        return index;
    }

    public Excel read(File file){
        Excel excel = new Excel();
        FileInputStream fis = null;
        Workbook book = null;
        try {
            fis = new FileInputStream(file);
            book = Workbook.getWorkbook(fis);

            for (jxl.Sheet sheet :book.getSheets()){
                Sheet mySheet = new Sheet();
                mySheet.setName(sheet.getName());

                List<Line> allLine = new ArrayList<>();
                int length = 0;
                for(int i=0; i< sheet.getRows(); i ++){
                    if (i == 0){
                        length = sheet.getRow(i).length;
                    }
                    Line line = new Line(length, sheet.getRow(i));
                    allLine.add(line);
                }

                mySheet.setAllLine(allLine);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } finally {
            if (book != null){
                book.close();
            }

            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return excel;
    }

    public class Excel{
        List<Sheet> sheets;

        public List<Sheet> getSheets() {
            return sheets;
        }

        public void setSheets(List<Sheet> sheets) {
            this.sheets = sheets;
        }
    }

    public class Sheet{
        private List<Line> allLine;
        private List<Line> data;
        private Line title;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Line> getData() {
            return data;
        }

        public void setData(List<Line> data) {
            this.data = data;
        }

        public Line getTitle() {
            return title;
        }

        public void setTitle(Line title) {
            this.title = title;
        }

        public List<Line> getAllLine() {
            return allLine;
        }

        public void setAllLine(List<Line> allLine) {
            this.allLine = allLine;
        }

        public void resolveTitle(int titleLine, int dataStart){
            title = allLine.get(titleLine);
            for (int i = dataStart ;i < allLine.size() ; i ++){
                if (data == null){
                    data = new ArrayList<>();
                }

                data.add(allLine.get(i));
            }
        }

        public void resolveTitle(int titleLine, int dataStart, int dataEnd){
            title = allLine.get(titleLine);
            for (int i = dataStart ;i <= dataEnd ; i ++){
                if (data == null){
                    data = new ArrayList<>();
                }

                data.add(allLine.get(i));
            }
        }

        public Sheet sum(String primaryCell, String[] sumCell, String outPutCell){
            return null;
        }
    }

    public class Line{
        private String cells[];
        public Line(int length, Cell[] data){
            cells = new String[length];
            for (int i = 0; i < data.length ; i ++){
                if (i == length){
                    break;
                }

                cells[i] = data[i].getContents();
            }
        }

        public String[] getCells() {
            return cells;
        }
    }

    public static void main(String[] args) {
        System.out.println(toIndex("AZ"));
    }
}
