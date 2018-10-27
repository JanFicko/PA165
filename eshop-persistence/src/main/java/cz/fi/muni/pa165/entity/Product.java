package cz.fi.muni.pa165.entity;


import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false,unique=true)
    private String name;
    @Enumerated
    private Color color;
    /*
     * The day this item has been added to the eshop
     */
    @Temporal(TemporalType.DATE)
    private java.util.Date addedDate;


    public Product(Long productId) {
        this.id = productId;
    }

    public Product() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public java.util.Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(java.util.Date addedDate) {
        this.addedDate = addedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Product))
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.getName()))
            return false;
        return true;
    }

}
