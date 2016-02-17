package cheng.msdp.basic.web;

import cheng.msdp.framework.web.BusinessCommonAction;
import com.application.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/management/basecomponent/uploadfile/")
public class UploadFileAction extends BusinessCommonAction {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("page")
	public String page(HttpServletRequest request, Model model)
			throws BusinessException {
		String itemkey = request.getParameter("itemkey");
		String filetype = request.getParameter("filetype");
		model.addAttribute("itemkey", itemkey);
		model.addAttribute("filetype", filetype);
		return "management/_frag/refer/uploadFilePanel";
	}

	@RequestMapping("upload")
	public ModelAndView upload(HttpServletRequest request, Model model)
			throws BusinessException, IllegalStateException, IOException {
		String savePath = request.getSession().getServletContext()
				.getRealPath("/");
		long times = System.currentTimeMillis();
		String folder = request.getParameter("folder");
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile multipartFile = multipartRequest.getFile("uploadify");
		// 处理图片上传
		String[] allowPicType = { "jpg", "jpeg", "gif", "png" };

		// 处理图片格式
		String fileName = multipartFile.getOriginalFilename();
		String newFileName = times + "_" + fileName;
		savePath = savePath + "upload/" + folder + "/";
		File dir = new File(savePath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String newPath = savePath + newFileName;
		// 创建文件
		File file = new File(newPath);
		multipartFile.transferTo(file);
		String url = "upload/" + folder + "/" + newFileName;
		Map<String,Object> d = new HashMap<String,Object>();
		d.put("filename", url);
		return ajaxSuccess("ok",d);
	}
}
