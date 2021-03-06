import com.hgc.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:daMao
 * @Date: Created in 5:38 2020/6/30
 */
public class MyTest  {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理，我们要使用，直接去里面取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
