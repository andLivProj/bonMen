package org.arpit.java2blog.dataBase;

import org.arpit.java2blog.bean.Bone_DAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class DataBase_Connection {

//	public static void main(String[] args) 
//	{ 
		public static final String dbSocket = "jdbc:mysql://localhost:3306/javabase";
		public static final String dbUser = "java";
		public static final String dbPassword = "password";
		

private static final SessionFactory sessionFactory;

    static {
        try {

            sessionFactory = new AnnotationConfiguration().
            		addAnnotatedClass(Bone_DAO.class).
                    configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return sessionFactory.openSession();
    }
		
		

//		String sql = "select * from BONE";
		
		
//		try (Connection myConn = DriverManager.getConnection(dbSocket, dbUser, dbPassword);
//		     PreparedStatement ps = myConn.prepareStatement(sql);) {
//		    
//		    try (ResultSet myRs = ps.executeQuery();) {
//		        while (myRs.next()) {
//		        	System.out.println(myRs.getString("NumeBona") + ", " + myRs.getString("PrenumeBona"));
//		        }
//		    }
//		} catch (SQLException e) {
//		    e.printStackTrace();
//		}
		
		
	/*try{
		//1.set-up connection
		Connection myConn = DriverManager.getConnection(dbSocket, dbUser, dbPassword);
		
		//2.create sql statement set
		Statement myStmt = myConn.createStatement();
	
		//3. query
		ResultSet myRs = myStmt.executeQuery("SELECT * FROM BONE");
		
		//4.process test result set
		while (myRs.next())
				{
					System.out.println(myRs.getString("NumeBona") + ", " + myRs.getString("PrenumeBona"));
				}
		}
	catch (Exception e) {
		
		e.printStackTrace();
		
		}*/

//	}
}

