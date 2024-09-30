
import com.pdh.config.JdbcConfig;
import com.pdh.config.SpringConfig;
import com.pdh.dao.BookDao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class App1 {


    public static void main(String[] args) throws SQLException {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = ctx.getBean(DataSource.class);

        System.out.println(dataSource);

    }
}
