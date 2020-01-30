package xyz.fengqing11.sptingbootactivemq;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.fengqing11.sptingbootactivemq.pojo.Message;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
class SptingbootActivemqApplicationTests {

    @Autowired
    JmsComponent jmsComponent;

    @Test
    public void contextLoads() {
        Message msg = new Message();
        msg.setContent("hello jms");
        msg.setDate(new Date());
        jmsComponent.send(msg);
    }

}
