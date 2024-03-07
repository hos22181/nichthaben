package at.spg.projectkiesslinghossain.domain;

import jakarta.persistence.Id;

public class Category {

    @Id
    private int categoryId;

    private String name;

    private Category[] subCategories;

    private Category parenCategory;

}
