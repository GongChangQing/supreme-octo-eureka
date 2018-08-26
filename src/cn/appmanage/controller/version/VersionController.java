package cn.appmanage.controller.version;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appmanage.entity.Version;
import cn.appmanage.service.version.VersionService;

@Controller
@RequestMapping("/version")
public class VersionController {
	@Resource(name="versionService")
	private VersionService versionService;
	
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyVersion(@Valid Version version){
		if(versionService.findModifyVerSion(version)){
			return "";
		}else{
		return "";
		}
	}
	
	
	
}
