import com.hgc.config.MyConfig;
import com.hgc.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:daMao
 * @Date: Created in 6:20 2020/7/2
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
}
