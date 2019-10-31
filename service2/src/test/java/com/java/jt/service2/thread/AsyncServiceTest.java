package com.java.jt.service2.thread;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * Created by jt on 2019/10/30 14:36
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncServiceTest {

    @Autowired
    private AsyncService asyncService;

    @Test
    public void executeAsync() {
        for (int i = 0; i < 10; i++) {
            asyncService.executeAsync(i);
        }
    }

    @Test
    public void executeAsync2() throws Exception {
        Future<Long> future = asyncService.executeAsync2();
        while (true) {

            if (future.isDone()) {
                System.out.println("耗时" + future.get());
                break;
            }
        }

    }
}