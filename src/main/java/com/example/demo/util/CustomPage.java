package com.example.demo.util;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

@Data
public class CustomPage <T>{

    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private Sort sort;
    private int totalPage;
    private long totalElement;


    public CustomPage(Page page, List<T> list) {
        this.content = list;
        this.pageNumber = page.getNumber();
        this.pageSize = page.getSize();
        this.totalPage = page.getTotalPages();
        this.totalElement = page.getTotalElements();
        this.sort = page.getSort();
    }
}
