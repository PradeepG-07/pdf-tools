package com.project.pdf_tools.entity.split;

import com.project.pdf_tools.entity.SinglePdfRequest;
import com.project.pdf_tools.enums.PdfRequestType;
import com.project.pdf_tools.enums.split.SplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;

@Entity
public abstract class SplitPdfRequest extends SinglePdfRequest {
    @Transient
    protected SplitPdfRequestType splitType;

    public SplitPdfRequest(){
        this.setRequestType(PdfRequestType.SPLIT);
    }

    public SplitPdfRequestType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitPdfRequestType splitType) {
        this.splitType = splitType;
    }
}
