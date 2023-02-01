package com.example.contentservice.domain.item;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity, UploadFile attachFile, List<UploadFile> imageFiles) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.attachFile = attachFile;
        this.imageFiles = imageFiles;
    }
}
