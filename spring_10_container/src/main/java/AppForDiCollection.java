
import com.pdh.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AppForDiCollection {


    public static void main(String[] args) {
       /*
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory bf =new XmlBeanFactory(resource);
        BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.save();
        */
    }
}
