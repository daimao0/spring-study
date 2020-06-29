import com.hgc.dao.impl.UserDaoMysqlImpl;
import com.hgc.service.UserService;
import com.hgc.service.impl.UserServiceImpl;

/**
 * @Author:daMao
 * @Date: Created in 4:43 2020/6/30
 */
public class MyTest {

    public static void main(String[] args) {

        //用户实际调用的是业务层，dao层不需要接触
        UserService userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
