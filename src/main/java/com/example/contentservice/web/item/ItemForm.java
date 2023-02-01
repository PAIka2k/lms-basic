package com.example.contentservice.web.item;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {
    private Long itemId;
    private String itemName;
    private Integer price;
    private Integer quantity;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}