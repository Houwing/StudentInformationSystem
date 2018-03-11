import java.sql.*;
import java.util.Scanner;

//数据库的所有操作

public class LinkToMysql {
	// 连接到mysql数据库
	public static Connection conn;    
	public static Statement sql;
	public ResultSet rs;
	public String SQL;
	Scanner Input=new Scanner(System.in);
	
	public void LoadDrive()
	{  //加载驱动
		try {
				System.out.println("正在加载驱动，请稍后");
	    		Class.forName("com.mysql.jdbc.Driver");//这个会有异常存在，所以一定要有try来抛出问题
	    }catch(Exception e){   //try抛出，catch接住问题
	    		System.out.println(e);
	    }
	}
	public void LinkToDatabase()
	{//连接到数据库
	  	
	   	try {
	   			System.out.println("正在连接到localhost3306/studentdb..");
	    		String uri="jdbc:mysql://localhost:3306/javaproject?useSSL=true";
	    		conn=DriverManager.getConnection(uri,"root","123456");
	    		if(conn!=null) {
	    			System.out.println("MySql连接成功"); 
	    		}
	    		else{ 
	    			System.out.println("MySql连接失败");
	    		}    		
	 	    }catch(SQLException e) {
	    		System.out.println(e);
	    	}
	    	
	  }
	  
	void SearchByNumber  ()
	 {
	   try {
		   int num;
		   num=Input.nextInt();
	   		sql=conn.createStatement();
	   		SQL="select * from student where ID="+num;
	   		rs=sql.executeQuery(SQL);
	   		ResultSetMetaData MetaData=rs.getMetaData();//返回结果集
	   		int ColumCount=MetaData.getColumnCount();
	   		for(int i=1;i<=ColumCount;i++)
	   		{
	   			System.out.print(MetaData.getColumnName(i)+"|");
	   		}
	   		System.out.println();
	   		while(rs.next())//输出结果
	   			{
	   				for(int i=1;i<=ColumCount;i++)
	   				{
	   					System.out.print(rs.getString(i)+"  |");
				
	   				}
	   				System.out.println();
	   			}
	    	}catch(SQLException e) {
	    		System.out.println(e);
	    	}
	    	
	    }
	void SearchByName  ()
	 {
	   try {
		   String Name;
		   Name=Input.next();
	   		sql=conn.createStatement();
	   		SQL="select * from student where Name='"+Name+"'";
	   		rs=sql.executeQuery(SQL);
	   		ResultSetMetaData MetaData=rs.getMetaData();
	   		int ColumCount=MetaData.getColumnCount();
	   		for(int i=1;i<=ColumCount;i++)
	   		{
	   			System.out.print(MetaData.getColumnName(i)+"|");
	   		}
	   		System.out.println();
	   		while(rs.next())
	   			{
	   				for(int i=1;i<=ColumCount;i++)
	   				{
	   					System.out.print(rs.getString(i)+"  |");
				
	   				}
	   				System.out.println();
	   			}
	    	}catch(SQLException e) {
	    		System.out.println(e);
	    	}
	    	
	    }	

	void SearchByClass  ()
	 {
	   try {
		   int Class;
		   Class=Input.nextInt();
	   		sql=conn.createStatement();
	   		SQL="select * from student where Class="+Class;
	   		rs=sql.executeQuery(SQL);
	   		ResultSetMetaData MetaData=rs.getMetaData();
			int ColumCount=MetaData.getColumnCount();
	   		for(int i=1;i<=ColumCount;i++)
	   		{
	   			System.out.print(MetaData.getColumnName(i)+"|");
	   		}
	   		System.out.println();
	   		while(rs.next())
	   			{
	   				for(int i=1;i<=ColumCount;i++)
	   				{
	   					System.out.print(rs.getString(i)+"  |");
				
	   				}
	   				System.out.println();
	   			}
			
	    	
	    }catch(SQLException e)
	   {
	    	System.out.println(e);
	   }
	
	 }
	
	void SortByChineseScore() {
		try {
				String Type="ChineseScore";
		   		sql=conn.createStatement();
		   		SQL="select * from student order by "+Type;
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
				int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
				
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void SortByMathScore() {
		try {
				String Type="MathScore";
		   		sql=conn.createStatement();
		   		SQL="select * from student order by "+Type;
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
				int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
				
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void SortByEnglishScore() {
		try {
				String Type="EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="select * from student order by "+Type;
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
				int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
				
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void SortByTotal() {
		try {
				String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="select * from student order by "+Type;
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
				int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
				
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void SortByAverage() {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="select AVG(ChineseScore),AVG(MathScore),AVG(EnglishScore) from student";
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
				int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
				
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void SortByID() {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="select * from student order by ID";
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
				int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())//输出结果集
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
				
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void Insert(String ID,String Name,int Class,int ChineseScore,int MathScore,int EnglishScore) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="insert into student(ID,Name,Class,ChineseScore,MathScore,EnglishScore)value("+ID+",'"+Name+"',"+Class+","+ChineseScore+","+MathScore+","+EnglishScore+")";
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void DeleteByID(String ID) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="delete from student where ID='"+ID+"'";
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void DeleteByName(String Name) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="delete from student where Name='"+Name+"'";
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void UpdateChineseScoreByName(String Name,int Score) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="update student set ChineseScore="+Score+" where Name='"+Name+"'";
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void UpdateMathScoreByName(String Name,int Score) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="update student set MathScore="+Score+" where Name='"+Name+"'";
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void UpdateEnglishScoreByName(String Name,int Score) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="update student set EnglishScore="+Score+" where Name='"+Name+"'";
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void UpdateChineseScoreByStudentNumber(int StudentNumber,int Score) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="update student set ChineseScore="+Score+" where ID="+StudentNumber;
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void UpdateMathScoreByStudentNumber(int StudentNumber,int Score) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="update student set MathScore="+Score+" where ID="+StudentNumber;
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void UpdateEnglishScoreByStudentNumber(int StudentNumber,int Score) {
		try {
				//String Type="ChineseScore+MathScore+EnglishScore";
		   		sql=conn.createStatement();
		   		SQL="update student set EnglishScore="+Score+" where ID="+StudentNumber;
		   		sql.executeUpdate(SQL);
		   		System.out.println("Query OK");
		    	
		    }catch(SQLException e)
		   {
		    	System.out.println(e);
		   }
	}
	void SearchMaxScore(String Subject)
	{
		 try {
		   		SQL="select ID,Name,Class,"+Subject+" from student where "+Subject+"=(select max("+Subject+")from student)";
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
		   		int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
		    	}catch(SQLException e) {
		    		System.out.println(e);
		    	}
	}
	void SearchMinScore(String Subject)
	{
		 try {

		   		SQL="select ID,Name,Class,"+Subject+" from student where "+Subject+"=(select min("+Subject+")from student)";
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
		   		int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
		    	}catch(SQLException e) {
		    		System.out.println(e);
		    	}
	}
	void SearchExcellent(String Subject)
	{
		 try {
			 	SQL="select class,sum(case when "+Subject+">=90 then 1 else 0 end)/count(*) execellent from student group by class order by execellent";
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
		   		int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
		    	}catch(SQLException e) {
		    		System.out.println(e);
		    	}
	}
	void SearchBad(String Subject)
	{
		 try {
			 	SQL="select class,sum(case when "+Subject+"<60 then 1 else 0 end)/count(*) bad from student group by class order by bad";
		   		rs=sql.executeQuery(SQL);
		   		ResultSetMetaData MetaData=rs.getMetaData();
		   		int ColumCount=MetaData.getColumnCount();
		   		for(int i=1;i<=ColumCount;i++)
		   		{
		   			System.out.print(MetaData.getColumnName(i)+"|");
		   		}
		   		System.out.println();
		   		while(rs.next())
		   			{
		   				for(int i=1;i<=ColumCount;i++)
		   				{
		   					System.out.print(rs.getString(i)+"  |");
					
		   				}
		   				System.out.println();
		   			}
		    	}catch(SQLException e) {
		    		System.out.println(e);
		    	}
	}
}    
	    
