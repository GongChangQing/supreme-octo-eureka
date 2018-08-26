package cn.appmanage.controller.app;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appmanage.entity.Category;
import cn.appmanage.service.category.CategoryService;

@Controller
@RequestMapping("/app")
public class AppController {
	
	@Resource
	private CategoryService categoryService;
	
	@RequestMapping("/applist")
	public String appList(@RequestParam(value="appName",required=false)String appName,
			@RequestParam(value="appState",required=false)Integer appState,
			@RequestParam(value="appPt",required=false)Integer appPt,
			@RequestParam(value="categoryI",required=false)Integer categoryI,
			@RequestParam(value="categoryII",required=false)Integer categoryII,
			@RequestParam(value="categoryIII",required=false)Integer categoryIII,
			Model model){
		
		List<Category> clist = categoryService.getCategoryI();
		
		model.addAttribute("clist", clist);
		model.addAttribute("appName", appName);
		model.addAttribute("appState", appState);
		model.addAttribute("appPt", appPt);
		model.addAttribute("categoryI", categoryI);
		model.addAttribute("categoryII", categoryII);
		model.addAttribute("categoryIII", categoryIII);
		
		return "jsp/applist";
	}
}
