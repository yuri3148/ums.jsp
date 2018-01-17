package kim.yongtae.ums.service;

import kim.yongtae.ums.domain.User;
import java.util.List;

public interface UserService {
	List<User> listUsers();
	User findUser(int userNo);
	boolean join(String userName);
	boolean correct(User user);
	boolean secede(int userNo);
}