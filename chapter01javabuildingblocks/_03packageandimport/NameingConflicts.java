package com.oracle.javacert.associate.chapter01javabuildingblocks._03packageandimport;

import java.util.Date;
// import java.sql.*; // Does not compile // Error: The typeDate is ambiguous
public class NameingConflicts {
	Date date;
}

class Conflicts{
	java.util.Date date;
	java.sql.Date sqlDate;
}
