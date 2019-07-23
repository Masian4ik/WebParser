package com.mainacad;

import com.mainacad.service.WebClient;

import java.util.logging.Logger;

public class AppRunner {

    private static Logger logger = Logger.getLogger(AppRunner.class.getName());
    public static void main(String[] args) {
        logger.info("\n" + WebClient.getItem("https://www.amazon.com/HP-15-dc0000-15-dc0020nr-3WL02UA-ABA/dp/B07CZCFHC6/ref=sr_1_4?keywords=hp+15+omen&qid=1563637667&s=gateway&sr=8-4").toString());
    }
}
