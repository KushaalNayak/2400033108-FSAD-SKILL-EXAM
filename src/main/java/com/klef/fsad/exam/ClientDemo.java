package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ClientDemo {

 public static void main(String[] args) {

  SessionFactory factory =	
   new Configuration().configure().buildSessionFactory();

  Session session = factory.openSession();

  Transaction tx = session.beginTransaction();

  CustomerAccount acc = new CustomerAccount();

  acc.name = "Kushh";
  acc.description = "Savings Account";
  acc.date = new Date();		
  acc.status = "Active";

  session.save(acc);

  CustomerAccount updateAcc =
   session.get(CustomerAccount.class,1);

  if(updateAcc != null)
  {
   updateAcc.name = "Updated Name";
   updateAcc.status = "Inactive";

   session.update(updateAcc);
  }
  		
  tx.commit();

  session.close();
  factory.close();

  System.out.println("Successful");
 }
}