package cn.appmanage.service.category;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appmanage.dao.category.CategoryMapper;
import cn.appmanage.entity.Category;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryMapper categoryMapper;
	
	//获取一级分类
	@Override
	public List<Category> getCategoryI() {
		return categoryMapper.getCategoryI();
	}

	//获取二级分类
	@Override
	public List<Category> getCategroyII(int id) {
		return categoryMapper.getCategroyII(id);
	}

	//获取三级分类
	@Override
	public List<Category> getCategroyIII(int id) {
		return categoryMapper.getCategroyIII(id);
	}

}
