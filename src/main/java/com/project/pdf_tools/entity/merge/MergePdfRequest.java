package com.project.pdf_tools.entity.merge;

import com.project.pdf_tools.entity.MultiPdfRequest;
import com.project.pdf_tools.enums.PdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "merge_pdf_requests")
public class MergePdfRequest extends MultiPdfRequest {
    public MergePdfRequest(){
        this.setRequestType(PdfRequestType.MERGE);
    }
}
