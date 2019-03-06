package com.krutik.userfuncs.provider;

import com.krutik.userfuncs.BinaryFunc;
import com.krutik.userfuncs.BinaryFuncProvider;

public class AbsMinusProvider implements BinaryFuncProvider {

	@Override
	public BinaryFunc get() {
		return new AbsMinus();
	}

}
