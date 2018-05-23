package com.liuran.utils.user.lzl;

import com.liuran.utils.ExcelIndexUtils;

import java.util.List;

public abstract class ExcelLine {

    public String name;
    public String cardId;
    public String sex;


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    abstract List<String> getLine();

    abstract ExcelLine add(ExcelLine line);

    abstract List<String> getHeader();
    int toIndex(String line){
        return ExcelIndexUtils.toIndex(line);
    }

}
