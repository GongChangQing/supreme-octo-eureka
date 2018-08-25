package cn.appmanage.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanage.dao.user.UserMapper;
import cn.appmanage.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	//µÇÂ¼
	@Override
	public User Login(String Code, int isDev) {
		return userMapper.getUserByCode(Code, isDev);
	}

}
