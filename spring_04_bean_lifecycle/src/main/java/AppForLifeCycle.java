import com.pdh.dao.BookDao;
import com.pdh.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDao bookdaoe = (BookDao)ctx.getBean("bookDao");

        bookdaoe.save();

        ctx.registerShutdownHook(); //关闭钩子，执行完关闭容器
//      ctx.close();//暴力关闭，执行语句直接关闭掉




    }
}
