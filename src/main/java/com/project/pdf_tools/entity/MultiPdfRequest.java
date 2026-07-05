package com.project.pdf_tools.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Entity
public abstract class MultiPdfRequest extends PdfRequest {

    @Transient
    protected List<MultipartFile> pdfs;

    protected List<String> inputFileUrls;

    public List<MultipartFile> getPdfs() {
        return pdfs;
    }

    public void setPdfs(List<MultipartFile> pdfs) {
        this.pdfs = pdfs;
    }

    public List<String> getInputFileUrls() {
        return inputFileUrls;
    }

    public void setInputFileUrls(List<String> inputFileUrls) {
        this.inputFileUrls = inputFileUrls;
    }
}
