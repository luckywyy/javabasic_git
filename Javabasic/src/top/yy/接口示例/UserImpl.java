package top.yy.接口示例;

public class UserImpl implements UserInteface, UserOtherInterface{

    @Override
    public boolean addUser(int id) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public boolean updateUser(int id) {
        return false;
    }

    @Override
    public boolean searchUser(int id) {
        return false;
    }

    @Override
    public String getName(int id) {
        return null;
    }
}

