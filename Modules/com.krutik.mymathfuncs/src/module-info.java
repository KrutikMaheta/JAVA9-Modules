/**
 * 
 */
module mathfuncs {
	exports com.krutik.mymathfuncs;

	// Transitive dependency to support functions
	// Because of this we need to add requires statement to module-info.java of
	// Client class
	requires transitive com.krutik.appsupport;
}