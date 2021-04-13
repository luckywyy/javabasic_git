package com.yy.基础示范.shopping.Service;

import com.yy.基础示范.shopping.Interface.MarketInterface;

import java.util.Scanner;

public class MarketImpl implements MarketInterface {
    @Override
    public void enterMarket() {
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎来到网上购物超市");

        System.out.println("若没有账号，输入 signup 前往注册，若已有账号，输入 signin 前往登录");


        while (true){
            String operation = s.next();
            if(operation.equals("signup")){
                System.out.println("接下来为您跳转到注册, 请稍后...");

            }
            else if (operation.equals("signin")){
                System.out.println("接下来为您跳转到登录, 请稍后...");
            }
            else{
                System.out.println("请输入正确的命令! ");
            }
        }

    }
}
