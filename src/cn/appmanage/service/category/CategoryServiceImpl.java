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
	
	//��ȡһ������
	@Override
	public List<Category> getCategoryI() {
		return categoryMapper.getCategoryI();
	}

	//��ȡ��������
	@Override
	public List<Category> getCategroyII(int id) {
		return categoryMapper.getCategroyII(id);
	}

	//��ȡ��������
	@Override
	public List<Category> getCategroyIII(int id) {
		return categoryMapper.getCategroyIII(id);
	}

}
