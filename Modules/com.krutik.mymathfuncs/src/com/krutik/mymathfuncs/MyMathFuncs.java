package com.krutik.mymathfuncs;

import com.krutik.appsupport.SupportFuncs;

public class MyMathFuncs {

	public static int lcf(int a, int b) {
		int min = a < b ? a : b;
		for (int i = 2; i <= min / 2; i++)
			if (SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))
				return i;
		return 1;
	}

	public static int gcf(int a, int b) {
		int min = a < b ? a : b;
		for (int i = min / 2; i >= 2; i--)
			if (SupportFuncs.isFactor(i, a) && SupportFuncs.isFactor(i, b))
				return i;
		return 1;
	}
}
