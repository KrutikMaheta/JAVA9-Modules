package com.krutik.mymathfuncs.client;

import com.krutik.mymathfuncs.MyMathFuncs;
import com.krutik.userfuncs.BinaryFunc;
import com.krutik.userfuncs.BinaryFuncProvider;

import java.util.ServiceLoader;

import com.krutik.appsupport.SupportFuncs;

public class MyClient {

	public static void main(String[] args) {
		// Use of requires transitive
		System.out.println(SupportFuncs.isFactor(5, 10));
		
		// Use of normal exports & requires
		System.out.println(MyMathFuncs.lcf(35, 105));
		System.out.println(MyMathFuncs.gcf(35, 105));
		
		// Use of service & Service Provider [provides, with, uses]
		// Using service based user defined functions
		
		//	Get service loader for binary functions
		ServiceLoader<BinaryFuncProvider> ldr =  ServiceLoader.load(BinaryFuncProvider.class);
		
		BinaryFunc binaryFunc = null;
		for (BinaryFuncProvider binaryFuncProvider : ldr) {
			if(binaryFuncProvider.get().getName().equalsIgnoreCase("absplus")) {
				binaryFunc = binaryFuncProvider.get();
				break;
			}
		}
		System.out.println(binaryFunc.func(5, 10));
	}

}
