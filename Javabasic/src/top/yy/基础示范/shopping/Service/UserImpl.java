package top.yy.基础示范.shopping.Service;


import top.yy.基础示范.shopping.Interface.UserInterface;

public class UserImpl implements UserInterface {
    @Override
    public boolean signup(String name, String pwd) {
        boolean flag = true;

        return flag;
    }

    @Override
    public boolean signin(String name, String pwd) {
        return false;
    }

}
