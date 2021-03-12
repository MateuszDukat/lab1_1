package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {
    private String id;
    private String Name;
    private Date SnapshotDate;
    private String Type;

    public Product(String id, String name, Date snapshotDate, String type) {
        this.id = id;
        Name = name;
        SnapshotDate = snapshotDate;
        Type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Date getSnapshotDate() {
        return SnapshotDate;
    }

    public String getType() {
        return Type;
    }
}
