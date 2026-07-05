package com.project.pdf_tools.entity.split.range;

import com.project.pdf_tools.enums.split.RangeWiseSplitPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "custom_range_split_pdf_requests")
public class CustomRangeSplitPdfRequest extends RangeWiseSplitPdfRequest{
    private List<String> ranges;
    public CustomRangeSplitPdfRequest(){
        this.setRangeWiseSplitType(RangeWiseSplitPdfRequestType.CUSTOM_RANGE);
    }
    public List<String> getRanges() {
        return ranges;
    }

    public void setRanges(List<String> ranges) {
        this.ranges = ranges;
    }
}
