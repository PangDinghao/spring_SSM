
import com.pdh.dao.BookDao;
import com.pdh.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {


    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.bak");



        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
