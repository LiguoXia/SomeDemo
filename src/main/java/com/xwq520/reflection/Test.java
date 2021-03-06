package com.xwq520.reflection;

public class Test {
	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try {
			// 一般尽量采用这种形式
			demo1 = Class.forName("com.xwq520.reflection.Demo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();
		demo3 = Demo.class;

		System.out.println("类名称   " + demo1.getName());
		System.out.println("类名称   " + demo2.getName());
		System.out.println("类名称   " + demo3.getName());
	}
}

class Demo {
	static {
		System.out.println("1111111");
	}
	public Demo() {
		System.out.println("2222222222");
	}
}
