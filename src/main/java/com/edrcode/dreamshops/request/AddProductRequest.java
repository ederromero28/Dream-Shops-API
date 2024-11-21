package com.edrcode.dreamshops.request;

import com.edrcode.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    //agregar el id de la categoria en el json
    //private Long categoryId;

}
