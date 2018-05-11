package org.weblr.utils.lzl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "作坊";
        Map<String, List<ExcelLine>> data = ExcelUtil.readExcel("/Users/liuran/File/Temp/"+fileName+".xls");

        Map<String, List<ExcelLine>> outPutData = new TreeMap<>();

        for (String sheetName : data.keySet()){
            List<ExcelLine> lines = data.get(sheetName);
            Map<String, ExcelLine> map = new HashMap<>();
            for (ExcelLine excelLine : lines){
                if (map.containsKey(excelLine.getCardId())){
                    ExcelLine old = map.get(excelLine.getCardId());
                    old.add(excelLine);
                } else {
                    map.put(excelLine.getCardId(), excelLine);
                }
            }

            outPutData.put(sheetName, new ArrayList<ExcelLine>(map.values()));

        }

        ExcelUtil.writeExcel("/Users/liuran/File/Temp/"+fileName+".xls", outPutData);
        return;
    }
}
