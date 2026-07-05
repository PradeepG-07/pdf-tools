package com.project.pdf_tools.entity.compress;

import com.project.pdf_tools.entity.SinglePdfRequest;
import com.project.pdf_tools.enums.PdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compress_pdf_requests")
public class CompressPdfRequest extends SinglePdfRequest {
    private double compressionSizeInKB;
    public CompressPdfRequest(){
        this.setRequestType(PdfRequestType.COMPRESS);
    }
    public double getCompressionSizeInKB() {
        return compressionSizeInKB;
    }

    public void setCompressionSizeInKB(double compressionSizeInKB) {
        this.compressionSizeInKB = compressionSizeInKB;
    }
}
