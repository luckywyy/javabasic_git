package com.yy.基础示范.shopping;

import com.yy.基础示范.shopping.Service.MarketImpl;

public class main {

    public static void main(String[] args) {
        System.out.println("项目启动类");

        new MarketImpl().enterMarket();

    }
}
