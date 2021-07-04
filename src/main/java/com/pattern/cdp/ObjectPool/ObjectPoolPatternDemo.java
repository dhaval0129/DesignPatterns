package com.pattern.cdp.ObjectPool;

import java.sql.Connection;

class ObjectPoolPatternDemo {

	public static void main(String args[]) {

		// Create the ConnectionPool:
		JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", 
				"jdbc:hsqldb://localhost/mydb", "sa", "secret");

		// Get a connection:
		Connection con = pool.checkOut();

		// Use the connection

		// Return the connection:
		pool.checkIn(con);
	}
}