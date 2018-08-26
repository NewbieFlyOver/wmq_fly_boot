package wmq.connectedatasource.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createUser(String name, Integer age) {
		System.out.println("ssss");
		jdbcTemplate.update("insert into user(userAccount,userPassword) values(?,?);", name, age);
	}
}