package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootTest
class Demo1ApplicationTests {
}
    @RunWith(SpringRunner.class)//标记单元测试类看，并加载spring boot 测试注解
    @SpringBootTest//标记单元测试类，并加载项目的上下文环境ApplicationContext
    public class ChaplerTestApplication {
        @Autowired
        ChapterController chapterController;

        @Test
        public void unitTest() {
            String result = chapterController.sayHello();
            System.out.println(result);
        }
    }
