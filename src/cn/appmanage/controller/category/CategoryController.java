package cn.appmanage.controller.category;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.appmanage.entity.Category;
import cn.appmanage.service.category.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("/categoryII")
	@ResponseBody
	public List<Category> getCategoryII(@RequestParam("id")Integer id){
		return categoryService.getCategroyII(id);
	}
	
	@RequestMapping("/categoryIII")
	@ResponseBody
	public List<Category> getCategoryIII(@RequestParam("id")Integer id){
		return categoryService.getCategroyIII(id);
	}
	
}
