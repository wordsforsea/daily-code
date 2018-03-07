package top.xzit.dao;

import top.xzit.pojo.User;
public interface UserDao {
	//用户登陆功能
	public abstract boolean isLogin(String username,String password);
	//用户注册功能
	public abstract void regist(User user);
}
