package com.test.atomicLearn;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * TODO: comment here
 * http://www.cnblogs.com/2015110615L/p/6748999.html
 */
public class AtomicIntegerArrayLearn {
	static AtomicIntegerArray atom = null;
	public static void main(String[] args){
		int [] a={1,2,3,4,5};
		atom = new AtomicIntegerArray(a);

		System.out.println("原始数组：" + atom);
		System.out.println("调用addAndGet(1, 9)方法返回值：" + atom.addAndGet(1, 9));
		System.out.println("调用后数组为：" + atom);

		System.out.println("调用getAndDecrement(2)方法返回值：" + atom.getAndDecrement(2));
		System.out.println("调用后数组为：" + atom);

		System.out.println("调用incrementAndGet(3)方法返回值：" + atom.incrementAndGet(3));
		System.out.println("调用后数组为：" + atom);

		System.out.println("调用compareAndSet(4, 5, 100)方法返回值：" + atom.compareAndSet(4, 5, 100));
		System.out.println("调用后数组为：" + atom);
	}
}
