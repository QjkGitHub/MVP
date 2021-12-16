package com.qf.comm;

public class PageInfo {
    Integer page;
    Integer size;
    Integer staterPage;
    Integer totalRows;
    Integer totalPages;

    public PageInfo() {
    }

    public PageInfo(Integer page) {
        this(page,Conts.DSIZE);
    }

    public PageInfo(Integer page, Integer size) {
        this.page = page;
        this.size = size;
        this.staterPage=(page-1)*size;
    }

    public Integer getPage() {
        return page;
    }



    public Integer getSize() {
        return size;
    }

    public Integer getStaterPage(){
        return staterPage;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        this.totalPages = totalRows%size==0?totalRows/size:totalRows/size+1;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

}
