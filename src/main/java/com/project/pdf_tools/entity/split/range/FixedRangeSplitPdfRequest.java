package com.project.pdf_tools.entity.split.range;

import com.project.pdf_tools.enums.split.RangeWiseSplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fixed_range_split_pdf_requests")
public class FixedRangeSplitPdfRequest extends RangeWiseSplitPdfRequest{
    private int pagesInEachRange;

    public FixedRangeSplitPdfRequest(){
        this.setRangeWiseSplitType(RangeWiseSplitPdfRequestType.FIXED_RANGE);
    }
    public int getPagesInEachRange() {
        return pagesInEachRange;
    }

    public void setPagesInEachRange(int pagesInEachRange) {
        this.pagesInEachRange = pagesInEachRange;
    }
}
