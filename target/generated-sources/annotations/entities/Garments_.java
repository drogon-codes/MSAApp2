package entities;

import entities.Category;
import entities.TblOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-11-18T23:50:09")
@StaticMetamodel(Garments.class)
public class Garments_ { 

    public static volatile SingularAttribute<Garments, Category> catid;
    public static volatile SingularAttribute<Garments, Integer> garmentid;
    public static volatile SingularAttribute<Garments, Integer> price;
    public static volatile CollectionAttribute<Garments, TblOrder> tblOrderCollection;
    public static volatile SingularAttribute<Garments, Integer> stock;

}