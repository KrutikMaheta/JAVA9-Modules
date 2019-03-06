package com.krutik.userfuncs;

//	This interface describe any binary operation on two ints that returns an int
public interface BinaryFunc {
	public String getName();

	public int func(int a, int b);
}
