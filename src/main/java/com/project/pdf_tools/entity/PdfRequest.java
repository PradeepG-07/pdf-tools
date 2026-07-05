package com.project.pdf_tools.entity;

import com.project.pdf_tools.enums.PdfRequestStatus;
import com.project.pdf_tools.enums.PdfRequestType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class PdfRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID id;
    protected String outputFileName;
    protected PdfRequestStatus requestStatus;
    protected String outputFileUrl;
    @Transient
    protected PdfRequestType requestType;

    public PdfRequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(PdfRequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public PdfRequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(PdfRequestType requestType) {
        this.requestType = requestType;
    }

    public String getOutputFileUrl() {
        return outputFileUrl;
    }

    public void setOutputFileUrl(String outputFileUrl) {
        this.outputFileUrl = outputFileUrl;
    }
}
