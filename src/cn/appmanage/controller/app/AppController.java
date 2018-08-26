package cn.appmanage.controller.app;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appmanage.entity.App;
import cn.appmanage.entity.Category;
import cn.appmanage.service.app.AppService;
import cn.appmanage.service.category.CategoryService;

@Controller
@RequestMapping("/app")
public class AppController {
	
	@Resource
	private CategoryService categoryService;
	@Resource(name="appService")
	private AppService appService;
	
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
	
	/**
	 * 根据id查询APP信息，并显示到jsp页面中
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/view")
	public String AppInfoView(@RequestParam(value="id")String id,Model model){
		if(id == null || id.equals("")){
			return "";
		}else{
			App app = appService.findAppInfoById(Integer.parseInt(id));
			model.addAttribute("app", app);
			return "appview";
		}
	}
	
	
	
	
	
	
	
}
