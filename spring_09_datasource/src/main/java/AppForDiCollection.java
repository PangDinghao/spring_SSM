
import com.pdh.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AppForDiCollection {


    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//
//        System.out.println(dataSource);


        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
