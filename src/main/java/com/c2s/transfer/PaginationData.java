package com.c2s.transfer;

import java.util.List;

public class PaginationData {

    List<ProductTo> content;
    private int totalPages ;
    private int totalElements;

    public List<ProductTo> getContent() {
        return content;
    }

    public void setContent(List<ProductTo> content) {
        this.content = content;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }
}
