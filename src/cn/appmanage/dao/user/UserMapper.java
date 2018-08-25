package cn.appmanage.dao.user;

import org.apache.ibatis.annotations.Param;

import cn.appmanage.entity.User;

public interface UserMapper {
	public User getUserByCode(@Param("Code")String Code,@Param("isDev")int isDev);
}
