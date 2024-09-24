import com.pdh.dao.OrderDao;
import com.pdh.dao.impl.OrderDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFoeinstanceOrder {


    public static void main(String[] args) {
//        OrderDao orderDao = new OrderDaoImpl();
//        orderDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");

        orderDao.save();


    }
}
