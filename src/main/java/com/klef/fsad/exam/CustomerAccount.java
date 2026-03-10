package com.klef.fsad.exam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer_account")
public class CustomerAccount {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 int id;

 String name;
 String description;

 @Temporal(TemporalType.DATE)
 Date date;

 String status;

}