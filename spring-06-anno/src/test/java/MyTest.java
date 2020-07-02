import com.hgc.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:daMao
 * @Date: Created in 5:47 2020/7/2
 */

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        user2.setName("李四");
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user.equals(user2));
        System.out.println(user == user2);

    }
}
