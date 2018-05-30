package com.liuran.stock.task;

import com.liuran.stock.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class PullDataTask {
    private static final String cron = "0 0/1 * * * ?";

    @Autowired
    private StockDataService service;

    @Scheduled(fixedDelay = 60 * 1000)
    public void schedule(){
        Set<String> codes = new HashSet<>();
        codes.add("sz000938");
        codes.add("sh601006");
        service.pull(codes);
    }
}
