package top.xzit.dao;

import top.xzit.pojo.User;
public interface UserDao {
	//�û���½����
	public abstract boolean isLogin(String username,String password);
	//�û�ע�Ṧ��
	public abstract void regist(User user);
}
