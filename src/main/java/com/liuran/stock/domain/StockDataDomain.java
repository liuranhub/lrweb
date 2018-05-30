package com.liuran.stock.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_stock_data")
public class StockDataDomain {
    //ID
    @Id
    private String id;
    //股票code
    @Column(name = "stock_code")
    private String stockCode;
    //创建时间
    @Column(name = "create_time")
    private String createTime;
    //今日开盘价
    @Column(name = "opening_price")
    private Double openingPrice;
    //昨日收盘价
    @Column(name = "yesterday_closing_price")
    private Double yesterdayClosingPrice;
    //当前价格
    @Column(name = "current_price")
    private Double currentPrice;
    //今日最高价
    @Column(name = "today_max_price")
    private Double todayMaxPrice;
    //今日最低价
    @Column(name = "today_min_price")
    private Double todayMinPrice;
    //竞买价(买一)
    @Column(name = "bidding_price")
    private Double biddingPrice;
    //竞卖价(卖一)
    @Column(name = "auction_price")
    private Double auctionPrice;
    //成交股票数
    @Column(name = "transaction_number")
    private Long transactionNumber;
    //成交金额
    @Column(name = "transaction_amount")
    private Long transactionAmount;
    //买一数
    @Column(name = "buy_one")
    private Long buyOne;
    //买一价格
    @Column(name = "buy_one_price")
    private Double buyOnePrice;
    @Column(name = "buy_two")
    private Long buyTwo;
    @Column(name = "buy_two_price")
    private Double buyTwoPrice;
    @Column(name = "buy_three")
    private Long buyThree;
    @Column(name = "buy_three_price")
    private Double buyThreePrice;
    @Column(name = "buy_four")
    private Long buyFour;
    @Column(name = "buy_four_price")
    private Double buyFourPrice;
    @Column(name = "buy_five")
    private Long buyFive;
    @Column(name = "buy_five_price")
    private Double buyFivePrice;
    //买一数
    @Column(name = "sell_one")
    private Long sellOne;
    //卖一价格
    @Column(name = "sell_one_price")
    private Double sellOnePrice;
    @Column(name = "sell_two")
    private Long sellTwo;
    @Column(name = "sell_two_price")
    private Double sellTwoPrice;
    @Column(name = "sell_three")
    private Long sellThree;
    @Column(name = "sell_three_price")
    private Double sellThreePrice;
    @Column(name = "sell_four")
    private Long sellFour;
    @Column(name = "sell_four_price")
    private Double sellFourPrice;
    @Column(name = "sell_five")
    private Long sellFive;
    @Column(name = "sell_five_price")
    private Double sellFivePrice;
    //股票时间
    private Long time;
    //原始数据
    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Double getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(Double openingPrice) {
        this.openingPrice = openingPrice;
    }

    public Double getYesterdayClosingPrice() {
        return yesterdayClosingPrice;
    }

    public void setYesterdayClosingPrice(Double yesterdayClosingPrice) {
        this.yesterdayClosingPrice = yesterdayClosingPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Double getTodayMaxPrice() {
        return todayMaxPrice;
    }

    public void setTodayMaxPrice(Double todayMaxPrice) {
        this.todayMaxPrice = todayMaxPrice;
    }

    public Double getTodayMinPrice() {
        return todayMinPrice;
    }

    public void setTodayMinPrice(Double todayMinPrice) {
        this.todayMinPrice = todayMinPrice;
    }

    public Double getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(Double biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public Double getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(Double auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public Long getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Long transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Long getBuyOne() {
        return buyOne;
    }

    public void setBuyOne(Long buyOne) {
        this.buyOne = buyOne;
    }

    public Double getBuyOnePrice() {
        return buyOnePrice;
    }

    public void setBuyOnePrice(Double buyOnePrice) {
        this.buyOnePrice = buyOnePrice;
    }

    public Long getBuyTwo() {
        return buyTwo;
    }

    public void setBuyTwo(Long buyTwo) {
        this.buyTwo = buyTwo;
    }

    public Double getBuyTwoPrice() {
        return buyTwoPrice;
    }

    public void setBuyTwoPrice(Double buyTwoPrice) {
        this.buyTwoPrice = buyTwoPrice;
    }

    public Long getBuyThree() {
        return buyThree;
    }

    public void setBuyThree(Long buyThree) {
        this.buyThree = buyThree;
    }

    public Double getBuyThreePrice() {
        return buyThreePrice;
    }

    public void setBuyThreePrice(Double buyThreePrice) {
        this.buyThreePrice = buyThreePrice;
    }

    public Long getBuyFour() {
        return buyFour;
    }

    public void setBuyFour(Long buyFour) {
        this.buyFour = buyFour;
    }

    public Double getBuyFourPrice() {
        return buyFourPrice;
    }

    public void setBuyFourPrice(Double buyFourPrice) {
        this.buyFourPrice = buyFourPrice;
    }

    public Long getBuyFive() {
        return buyFive;
    }

    public void setBuyFive(Long buyFive) {
        this.buyFive = buyFive;
    }

    public Double getBuyFivePrice() {
        return buyFivePrice;
    }

    public void setBuyFivePrice(Double buyFivePrice) {
        this.buyFivePrice = buyFivePrice;
    }

    public Long getSellOne() {
        return sellOne;
    }

    public void setSellOne(Long sellOne) {
        this.sellOne = sellOne;
    }

    public Double getSellOnePrice() {
        return sellOnePrice;
    }

    public void setSellOnePrice(Double sellOnePrice) {
        this.sellOnePrice = sellOnePrice;
    }

    public Long getSellTwo() {
        return sellTwo;
    }

    public void setSellTwo(Long sellTwo) {
        this.sellTwo = sellTwo;
    }

    public Double getSellTwoPrice() {
        return sellTwoPrice;
    }

    public void setSellTwoPrice(Double sellTwoPrice) {
        this.sellTwoPrice = sellTwoPrice;
    }

    public Long getSellThree() {
        return sellThree;
    }

    public void setSellThree(Long sellThree) {
        this.sellThree = sellThree;
    }

    public Double getSellThreePrice() {
        return sellThreePrice;
    }

    public void setSellThreePrice(Double sellThreePrice) {
        this.sellThreePrice = sellThreePrice;
    }

    public Long getSellFour() {
        return sellFour;
    }

    public void setSellFour(Long sellFour) {
        this.sellFour = sellFour;
    }

    public Double getSellFourPrice() {
        return sellFourPrice;
    }

    public void setSellFourPrice(Double sellFourPrice) {
        this.sellFourPrice = sellFourPrice;
    }

    public Long getSellFive() {
        return sellFive;
    }

    public void setSellFive(Long sellFive) {
        this.sellFive = sellFive;
    }

    public Double getSellFivePrice() {
        return sellFivePrice;
    }

    public void setSellFivePrice(Double sellFivePrice) {
        this.sellFivePrice = sellFivePrice;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
