package com.example.backendjavaspring.model.entity;



import javax.persistence.*;
@Entity(name = "categories")
@Table(indexes = {
		@Index(name = "idx_category_name", columnList = "category_name")
})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;
    @Column(name = "category_name",nullable = false)
    private String categoryName;

    public Category() {
    }

    public Category(String categoriesName) {
        this.categoryName = categoriesName;
    }

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
    


}
