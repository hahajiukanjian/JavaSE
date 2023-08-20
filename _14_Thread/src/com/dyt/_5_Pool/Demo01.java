package com.dyt._5_Pool;

import java.util.concurrent.*;

public class Demo01 {
	public static void main(String[] args) {
/*
    public ThreadPoolExecutor(int corePoolSize,
							  int maximumPoolSize,
						 	  long keepAliveTime,
						  	  TimeUnit unit,
						  	  BlockingQueue<Runnable> workQueue,
						  	  ThreadFactory threadFactory,
						  	  RejectedExecutionHandler handler) {
*/
		ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
				new ThreadPoolExecutor.CallerRunsPolicy());

		Runnable runnable = new MyRunnable();
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
		pool.execute(runnable);
	}
}
