module com.krutik.userfuncs.provider {
	requires com.krutik.userfuncs;

	provides com.krutik.userfuncs.BinaryFuncProvider
			with com.krutik.userfuncs.provider.AbsPlusProvider, com.krutik.userfuncs.provider.AbsMinusProvider;
}