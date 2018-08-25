package cn.appmanage.dao.category;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appmanage.entity.Category;

public interface CategoryMapper {
	public List<Category> getCategoryI();
	public List<Category> getCategroyII(@Param("Iid")int id);
	public List<Category> getCategroyIII(@Param("IIid")int id);
}
