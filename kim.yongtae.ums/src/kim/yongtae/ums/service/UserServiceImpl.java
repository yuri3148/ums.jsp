package kim.yongtae.ums.service;

import java.util.List;

import kim.yongtae.ums.dao.UserDao;
import kim.yongtae.ums.dao.UserDaoImpl;
import kim.yongtae.ums.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(){
		this.userDao = new UserDaoImpl();
	}
	
	//목록
	public List<User>listUsers(){
		return userDao.getUsers();
	}
	
	//찾기
	public User findUser(int userNo){
		return userDao.getUser(userNo);
	}
	
	//등록
	public boolean join(String userName){
		return userDao.addUser(userName)>0;
	}
	
	//수정
	public boolean correct(User user){
		return userDao.updateUser(user)>0;
	}
	
	//탈퇴
	public boolean secede(int userNo){
		return userDao.delUser(userNo)>0;
	}
}