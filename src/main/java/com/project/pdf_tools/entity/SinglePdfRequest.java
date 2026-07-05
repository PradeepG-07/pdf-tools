package com.project.pdf_tools.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import org.springframework.web.multipart.MultipartFile;

@Entity
public abstract class SinglePdfRequest extends PdfRequest {
    @Transient
    protected MultipartFile pdfFile;

    protected String inputPdfFileUrl;

    public MultipartFile getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(MultipartFile pdfFile) {
        this.pdfFile = pdfFile;
    }

    public String getInputPdfFileUrl() {
        return inputPdfFileUrl;
    }

    public void setInputPdfFileUrl(String inputPdfFileUrl) {
        this.inputPdfFileUrl = inputPdfFileUrl;
    }
}
