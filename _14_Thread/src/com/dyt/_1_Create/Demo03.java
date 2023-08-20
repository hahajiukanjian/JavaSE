package com.dyt._1_Create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		// 创建Callable实现类的对象
		Callable<String> callable = new MyCallable(100);

		// 将callable对象封装成FutureTask对象
		FutureTask<String> futureTask = new FutureTask<>(callable);

		// 将FutureTask对象交给Thread调用。创建子线程
		new Thread(futureTask).start();

		// 获取线程执行的返回值结果
		// ⚠️注意：如果执行到这里，当前java虚拟机中是有两个线程在运行。一个main主线程，一个是上面调用的子线程
		// 		  不需要担心.get方法返回的结果是子线程还没有执行完的结果。
		// 		  因为如果子线程还没有执行完毕，这里会等待子线程执行结束后再输出
		System.out.println(futureTask.get());
	}
}
