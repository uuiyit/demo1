package cs;

import com.example.demo.ChapterController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)//测试运行器，并加载spring boot 测试注解
@SpringBootTest//标记单元测试类，并加载项目的上下文环境ApplicationContext
public class ChaplerTestApplication {

    @Autowired //Autowired注入ChaptreController类
    ChapterController chapterController;
    @Test
    public void getHello(){
        String result = chapterController.sayHello();
        System.out.println("单元测试返回==="+result);
}

}

