package wmq.connectedatasource.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IndexController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/index")
	public Object index(Integer id) {
		User findUser = userDao.findOne(id);
		System.out.println(findUser.getName());
		return findUser;
	}
}