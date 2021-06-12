import com.holun.beans.Cat;
import com.holun.beans.Master;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Master master1 = context.getBean("master", Master.class);
        master1.getCat().shut();
        master1.getDog().shut();
    }
}
