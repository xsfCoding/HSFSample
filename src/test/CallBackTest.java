import com.alibaba.service.HelloWorldService;
import com.taobao.hsf.standalone.HSFEasyStarter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallBackTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        HelloWorldService testParamService= (HelloWorldService) ctx.getBean("HelloWorldService");
        Thread.sleep(9000);
        String lanshan = testParamService.sayhello("lanshan");
        System.out.println(lanshan);
    }
}
