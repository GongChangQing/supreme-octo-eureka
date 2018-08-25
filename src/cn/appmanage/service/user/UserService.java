package cn.appmanage.service.user;

import cn.appmanage.entity.User;

public interface UserService {
	public User Login(String Code,int isDev);
}
