package com.lara;

import java.util.ArrayList;
import java.util.Iterator;

public class M18 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(190);
		list1.add(910);
		list1.add(901);
		list1.add(290);
		System.out.println(list1);
		Object obj = list1.remove(2);
		System.out.println(list1);
		System.out.println(obj);	
	}
}
