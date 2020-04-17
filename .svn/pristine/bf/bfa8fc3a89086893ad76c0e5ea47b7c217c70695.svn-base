package com.mingcloud.proxy.util;

public class JdbcChange {
	private JdbcChange() {}
	
	private static JdbcChange jdbcChange = null;
	
    public static String mySqlDataSource = "mySqlDataSource";
    
    public static String sqlServerDataSource = "sqlServerDataSource";
    
    public static String oracleDataSource = "oracleDataSource";
        
    public static int number = 0;
    
    public Integer changeJdbc(String jdbc) {
    	try {
    		MultipleDataSource.setDataSourceKey(jdbc);
    		return 1;
    	} catch (Exception e) {
    		return 0;
    	}
    }
    
    public static JdbcChange getJdbcChange() {
    	if (jdbcChange == null) {
    		jdbcChange = new JdbcChange();
    	}
    	return jdbcChange;
    }
    
}
