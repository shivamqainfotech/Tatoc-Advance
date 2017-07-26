package com.qait.tatocAdvance.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.qait.tatocAdvance.jdbc.JDBC;

public class Utility {
	static ResourceBundle rs = ResourceBundle.getBundle("Resources.credentials");
	public static String id;
	public static String passkey;
	private JDBC jdbc=new JDBC();
	Connection connection;
	
	
	
	
public static void matcher(List<String> list,String symbol,List<String> listPasskeys){

	for(int i=0;i<list.size();i++){
		if(list.get(i).equals(String.valueOf(symbol.charAt(0)))){
			id=list.get(i);
			
			passkey=listPasskeys.get(i);
	
		}
	}
	
}
	public void execute_Query(String symbol) throws SQLException{
	List<String> list=new ArrayList<String>();
	List<String> list1=new ArrayList<String>();
	connection=jdbc.getConnection();
	Statement stm=connection.createStatement();
	ResultSet rSet=stm.executeQuery(rs.getString("sqlQuery_credentials"));
	while(rSet.next()) {
	list.add(rSet.getString(2));
	list1.add(rSet.getString(3));
	}
	matcher(list, symbol,list1);
		connection.close();
		
	}
}
