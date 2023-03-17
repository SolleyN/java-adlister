package com.codeup.adlister.dao;

import model.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Users users;
    private static Config config = new Config();


//    public static Users getUsersDao() {
//        if (users == null) {
//            users = new getUsersDao(config);
//        }
//        return users;
//    }
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}

