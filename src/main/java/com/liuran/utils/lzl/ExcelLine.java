package com.liuran.utils.lzl;

import java.util.List;

public abstract class ExcelLine {

    public String name;
    public String cardId;

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

}
