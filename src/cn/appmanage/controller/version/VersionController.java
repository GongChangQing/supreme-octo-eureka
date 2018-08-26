package cn.appmanage.controller.version;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.appmanage.entity.Version;
import cn.appmanage.service.version.VersionService;

@Controller
@RequestMapping("/version")
public class VersionController {
	@Resource(name="versionService")
	private VersionService versionService;
	
	@RequestMapping(value="/getVersion")
	public String getVersionList(@RequestParam(value="id",required=false)String id,Model model){
		List<Version> appVersionList = versionService.findVersionById(Integer.parseInt(id));
		Version version = versionService.findAppVersionById(Integer.parseInt(id));
		model.addAttribute("appVersionList", appVersionList);
		model.addAttribute("version", version);
		return "jsp/developer/appversionmodify";
	}
	
	/**
	 * °æ±¾ÐÞ¸Ä´ýÍêÉÆ
	 * @param version
	 * @param attach
	 * @return
	 */
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyVersion(@Valid Version version,@RequestParam(value="attach",required=false)MultipartFile attach){
		if(versionService.findModifyVerSion(version)){
			return "";
		}else{
		return "";
		}
	}
	
	
	
}
