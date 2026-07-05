package com.project.pdf_tools.entity.split.page;

import com.project.pdf_tools.entity.split.SplitPdfRequest;
import com.project.pdf_tools.enums.split.PageWiseSplitPdfRequestType;
import com.project.pdf_tools.enums.split.SplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public abstract class PageWisePdfSplitRequest extends SplitPdfRequest {
    @Transient
    private PageWiseSplitPdfRequestType pageWiseSplitType;

    public PageWisePdfSplitRequest(){
        this.setSplitType(SplitPdfRequestType.PAGE);
    }
    public PageWiseSplitPdfRequestType getPageWiseSplitType() {
        return pageWiseSplitType;
    }

    public void setPageWiseSplitType(PageWiseSplitPdfRequestType pageWiseSplitType) {
        this.pageWiseSplitType = pageWiseSplitType;
    }
}
