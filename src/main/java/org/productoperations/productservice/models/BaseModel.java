package org.productoperations.productservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//used to generate  auto unique ID
    private long id;
    private Date CreatedAt;
    private Date lastModifiedAt;
    private Boolean isDeleted;

    public long getId() {
        return this.id;
    }

    public Date getCreatedAt() {
        return this.CreatedAt;
    }

    public Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedAt(Date CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
