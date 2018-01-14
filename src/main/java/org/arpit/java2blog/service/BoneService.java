package org.arpit.java2blog.service;

import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.bean.Bone_DAO;
import org.arpit.java2blog.dataBase.DataBase_Connection;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class BoneService {





	@SuppressWarnings("deprecation")
	public List<Bone_DAO> getAllBone() {
		List<Bone_DAO> all_bone = new ArrayList<Bone_DAO>();

		//				try {
		//					Class.forName("com.mysql.jdbc.Driver");
		//				} catch (ClassNotFoundException e1) {
		//					// TODO Auto-generated catch block
		//					e1.printStackTrace();
		//				}
		//
		//			try (Connection myConn = DriverManager.getConnection(DataBase_Connection.dbSocket, DataBase_Connection.dbUser, DataBase_Connection.dbPassword);
		//					PreparedStatement ps = myConn.prepareStatement("select * from BONE");) {
		//				
		//				
		//				try (ResultSet myRs = ps.executeQuery();) {
		//					while (myRs.next()) {
		//						Bone_DAO bona = new Bone_DAO();
		//						bona.setIdBone(myRs.getInt("idBone"));
		//						bona.setNume_Bona(myRs.getString("NumeBona"));
		//						bona.setPrenume_Bona(myRs.getString("PrenumeBona"));
		//						bona.setEmail_Bona(myRs.getString("EmailBona"));
		//						all_bone.add(bona);
		//					}
		//				}
		//			} catch (SQLException e) {
		//				e.printStackTrace();
		//			}





		//				SessionFactory factory;
		//			      try {
		//			         factory = new AnnotationConfiguration().
		//			                   configure().
		//			                   //addPackage("com.xyz") //add package if used.
		//			                   addAnnotatedClass(Bone_DAO.class).
		//			                   buildSessionFactory();
		//			      } catch (Throwable ex) { 
		//			         System.err.println("Failed to create sessionFactory object." + ex);
		//			         throw new ExceptionInInitializerError(ex); 
		//			      }
		//			      
		//			      
		//			  
		//			      
		//				 Session session = factory.openSession();

		Session session = DataBase_Connection.getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			all_bone = session.createQuery("FROM Bone_DAO").list(); 
			//	         for (Iterator iterator = all_bone.iterator(); iterator.hasNext();){
			//	        	 Bone_DAO bona = (Bone_DAO) iterator.next(); 
			//	            System.out.print("First Name: " + bona.getNume_Bona()); 
			//	            System.out.print("  Last Name: " + bona.getPrenume_Bona()); 
			//	         }
			tx.commit();
		} catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}










		return all_bone;
	}
}
