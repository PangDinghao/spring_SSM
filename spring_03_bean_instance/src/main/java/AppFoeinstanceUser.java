import com.pdh.dao.OrderDao;
import com.pdh.dao.UserDao;
import com.pdh.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFoeinstanceUser {


    public static void main(String[] args) {
//        UserDao userDao = new UserDaoImpl();
//        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

       UserDao userDao1 = (UserDao) ctx.getBean("userDao");
       UserDao userDao2 = (UserDao) ctx.getBean("userDao");

//        userDao.save();

        System.out.println(userDao1);
        System.out.println(userDao2);

    }
}
