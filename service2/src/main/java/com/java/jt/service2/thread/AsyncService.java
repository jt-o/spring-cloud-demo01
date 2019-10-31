package com.java.jt.service2.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.Future;

/**
 * Created by jt on 2019/10/30 14:09
 */
@Service
@Async
public class AsyncService {

    public void executeAsync(int i) {
        System.out.println("线程：" + Thread.currentThread().getName() + "任务" + i);
    }

    public Future<Long> executeAsync2() throws Exception{
        long startTime = new Date().getTime();
        Thread.sleep(5000);
        long endTime = new Date().getTime();
        long time = endTime - startTime;
        return new AsyncResult <>(time);
    }
}
