import com.holun.d1.UserService;
import com.holun.d1.UserServiceImpl;
import com.holun.d1.UserServiceProxy;

public class Test {

    @org.junit.Test
    public void test() {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());
        userServiceProxy.add();
        userServiceProxy.delete();
    }
}
