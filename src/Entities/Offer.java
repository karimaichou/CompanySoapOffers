package Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by karima on 11/01/2017.
 */
@Entity
public class Offer {

    @Id
    @GeneratedValue
    private long id;

    private int available;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    private String description;

    private String title;

    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
