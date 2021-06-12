import com.holun.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    /*public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student) context.getBean("stu_1");
        System.out.println(student);
    }*/

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user1 = context.getBean("user_1", User.class);
        User user2 = context.getBean("user_2", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
}
