package com.guo.offer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class A {
	private static int i = 1;

	@Override
	public boolean equals(Object obj) {
		System.out.println("ÅÐ¶Ïequals");
		return true;
	}

	@Override
	public int hashCode() {
		System.out.println("ÅÐ¶Ïhashcode    " + i++);
		// return new Random(100).nextInt();

		return 3;
	}
}

public class xxxxx {

	public static void main(String[] args) {
		Map<A, Object> map = new HashMap<A, Object>();
		map.put(new A(), new Object());
		try {
			System.out.println("========================");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put(new A(), new Object());
		try {
			System.out.println("========================");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put(new A(), new Object());
		try {
			System.out.println("========================");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put(new A(), new Object());
		try {
			System.out.println("========================");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put(new A(), new Object());
		try {
			System.out.println("========================");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(map.size());
	}

}