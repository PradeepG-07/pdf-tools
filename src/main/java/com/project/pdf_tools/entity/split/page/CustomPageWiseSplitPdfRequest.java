package com.project.pdf_tools.entity.split.page;

import com.project.pdf_tools.enums.split.PageWiseSplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "custom_page_wise_split_pdf_requests")
public class CustomPageWiseSplitPdfRequest extends PageWisePdfSplitRequest{
    private String splitString;

    public CustomPageWiseSplitPdfRequest(){
        this.setPageWiseSplitType(PageWiseSplitPdfRequestType.CUSTOM);
    }

    public String getSplitString() {
        return splitString;
    }

    public void setSplitString(String splitString) {
        this.splitString = splitString;
    }
}
