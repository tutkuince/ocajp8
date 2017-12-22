package com.oracle.javacert.associate.chapter01javabuildingblocks._03packageandimport;

import java.nio.file.Files;
import java.nio.file.Paths;

// or import java.nio.file.*

/*
 * import java.nio.*; NO GOOD -> A wildcard only matches class names, not "file.*Files"
 * import java.nio.*.*; NO GOOD -> you can only have one wildcard and it must be at he end
 * import java.nio.files.Paths.*; NO GOOD -> you cannot import methods only class names
 * */

public class InputImports {
	public void read(Files file){
		Paths.get("name");
	}
}
