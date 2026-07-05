package com.project.pdf_tools.entity.split.page;

import com.project.pdf_tools.enums.split.PageWiseSplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "single_page_wise_split_pdf_requests")
public class SinglePageWiseSplitPdfRequest extends PageWisePdfSplitRequest{
    @Transient
    private int pageSize = 1;

    public SinglePageWiseSplitPdfRequest(){
        this.setPageWiseSplitType(PageWiseSplitPdfRequestType.SINGLE_PAGE);
    }

    public int getPageSize() {
        return pageSize;
    }
}
