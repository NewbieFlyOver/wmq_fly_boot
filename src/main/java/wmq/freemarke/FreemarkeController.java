package wmq.freemarke;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkeController {

	@RequestMapping("/freemarkerIndex")
	public String index(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "index";
	}
}
