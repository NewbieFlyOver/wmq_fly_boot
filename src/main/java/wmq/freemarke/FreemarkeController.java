package wmq.freemarke;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreemarkeController {

	@RequestMapping("/freemarker")
	public String index(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "index";
	}
	
	@RequestMapping("/freemarker1")
	@ResponseBody
	public String index1(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "indexFreemarker";
	}
}
