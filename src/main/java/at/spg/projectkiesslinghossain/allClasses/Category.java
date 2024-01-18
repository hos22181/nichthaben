package at.spg.projectkiesslinghossain.allClasses;

import jakarta.persistence.Id;

public class Category {

    @Id
    private int categoryId;

    private String name;

    private Category[] subCategories;

    private Category parenCategory;

}
