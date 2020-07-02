import com.hgc.pojo.Human;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:daMao
 * @Date: Created in 6:15 2020/7/1
 */
public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Human human = context.getBean("human",Human.class);
        human.getDog().shout();
        human.getCat().shout();
        System.out.println(human.getName());
    }
}
