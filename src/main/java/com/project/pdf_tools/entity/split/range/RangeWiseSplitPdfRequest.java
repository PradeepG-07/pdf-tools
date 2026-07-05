package com.project.pdf_tools.entity.split.range;

import com.project.pdf_tools.entity.split.SplitPdfRequest;
import com.project.pdf_tools.enums.PdfRequestType;
import com.project.pdf_tools.enums.split.RangeWiseSplitPdfRequestType;
import com.project.pdf_tools.enums.split.SplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public abstract class RangeWiseSplitPdfRequest extends SplitPdfRequest {
    @Transient
    protected RangeWiseSplitPdfRequestType rangeWiseSplitType;

    public RangeWiseSplitPdfRequest(){
        this.setSplitType(SplitPdfRequestType.RANGE);
    }
    public RangeWiseSplitPdfRequestType getRangeWiseSplitType() {
        return rangeWiseSplitType;
    }

    public void setRangeWiseSplitType(RangeWiseSplitPdfRequestType rangeWiseSplitType) {
        this.rangeWiseSplitType = rangeWiseSplitType;
    }
}
