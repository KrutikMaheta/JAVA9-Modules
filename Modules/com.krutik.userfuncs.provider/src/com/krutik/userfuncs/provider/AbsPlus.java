package com.krutik.userfuncs.provider;

import com.krutik.userfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc {

	public String getName() {
		return "AbsPlus";
	}

	public int func(int a, int b) {
		return Math.abs(a) + Math.abs(b);
	}

}
