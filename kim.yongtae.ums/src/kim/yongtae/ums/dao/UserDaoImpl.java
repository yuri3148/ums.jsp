package kim.yongtae.ums.dao;

import java.util.List;

import kim.yongtae.ums.config.Configuration;
import kim.yongtae.ums.dao.mapper.UserMapper;
import kim.yongtae.ums.domain.User;

public class UserDaoImpl implements UserDao{
	private UserMapper userMapper;
	
	public UserDaoImpl(){
		this.userMapper = Configuration.getMapper(UserMapper.class);
	}
	
	//사용자 정보 목록을 뽑아낸다.
	public List<User>getUsers(){
		return userMapper.getUsers();
	}
	
	//사용자 한명의 정보를 조회한다
	public User getUser(int userNo) {
		return userMapper.getUser(userNo);
	}
	
	//사용자 정보를 추가한다.
	public int addUser(String userName) {
		return userMapper.addUser(userName);
	}
	
	//사용자 정보를 수정한다.
	public int updateUser(User user){
		return userMapper.updateUser(user);
	}
	
	//사용자 정보를 삭제한다.
	public int delUser(int userNo){
		return userMapper.delUser(userNo);
	}
}
