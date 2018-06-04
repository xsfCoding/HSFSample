import com.alibaba.service.impl.HelloServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class  test{
        public static void main(String[] args) {
            ApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:application.xml");
            HelloServiceImpl hello= (HelloServiceImpl) applicationContext.getBean("HelloServiceImpl");
            hello.sayhello("sisi");
        }
    }


