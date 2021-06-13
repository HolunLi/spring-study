import com.holun.fig.MyConfiguration;
import com.holun.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void test() {
        ApplicationContext context = new  AnnotationConfigApplicationContext(MyConfiguration.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user1.getName());
    }
}
