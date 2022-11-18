package entities;

import entities.Customer;
import entities.Garments;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-11-18T23:50:09")
@StaticMetamodel(TblOrder.class)
public class TblOrder_ { 

    public static volatile SingularAttribute<TblOrder, Date> date;
    public static volatile SingularAttribute<TblOrder, Integer> orderId;
    public static volatile SingularAttribute<TblOrder, Garments> garmentId;
    public static volatile SingularAttribute<TblOrder, Customer> customerId;

}