package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseOperationsLib {
    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void initConnection(String className, String path) throws ClassNotFoundException, SQLException{
        Class.forName(className);
        conn = DriverManager.getConnection(path, "sysdba", "masterkey");
        statement = null;
    }
    
    public void closeConnection() throws SQLException{
        if(statement != null) statement.close();
        if(preparedStatement != null) preparedStatement.close();
        conn.close();
    }
    
    public void newStatement() throws SQLException{
        if(statement != null) statement.close();
        statement=conn.createStatement();
    }
    
    public void newPreparedStatement(String query) throws SQLException{
        if(preparedStatement != null) preparedStatement.close();
        preparedStatement=conn.prepareStatement(query);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    // SELECT
    public ResultSet select(String query) throws SQLException {  
        newStatement();        
        ResultSet rs=statement.executeQuery(query);
        return rs;        
    }
    
    // INSERT without ARGS
    public void insert(String query) throws SQLException {
        newStatement();
        statement.execute(query);
    }
    
    // INSERT with ARGS
    public void insert(String query, Object[] args) throws SQLException {
        newPreparedStatement(query);
        int i = 1;
        for(Object o : args){
            preparedStatement.setObject(i++, o);
        }
        preparedStatement.execute();
    }
    
    // UPDATE without ARGS
    public void update(String query) throws SQLException {
        newStatement();        
        statement.execute(query);
    }
    
    // UPDATE with ARGS
    public void update(String table, Object[] columns, Object[] args, String where) throws SQLException {
        newStatement();
        
        StringBuilder query = new StringBuilder();
        query.append("UPDATE ").append(table).append(" SET ");
        for(int i=0;i<args.length;i++){
            query.append(columns[i]).append(" = ").append(args[i]);
            if(i!=args.length-1) query.append(", ");
        }
        if(where.length()>2) query.append(" WHERE ").append(where);
        
        System.out.println(query.toString());
        statement.execute(query.toString());
    }
     
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    private String addQuestionMarks(int count){
        StringBuilder ret = new StringBuilder();
        
        ret.append(" (");
        for(int i = 0; i < count-1; i++){
            ret.append("?, ");
        }
        ret.append("?)");
        
        return ret.toString();
    }
    
    public int nextId(String tabela, String kolumna) throws SQLException{
        ResultSet rs = select("SELECT MAX (" + kolumna + ") FROM " + tabela);
        int ret = -2;
        while(rs.next()){ret = rs.getInt(1);}
        return ret + 1;
    }
}
