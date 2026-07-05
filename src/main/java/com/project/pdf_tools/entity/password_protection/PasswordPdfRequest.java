package com.project.pdf_tools.entity.password_protection;

import com.project.pdf_tools.entity.SinglePdfRequest;
import com.project.pdf_tools.enums.PasswordPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public abstract class PasswordPdfRequest extends SinglePdfRequest {
    protected String password;
    @Transient
    protected PasswordPdfRequestType passwordPdfRequestType;

    public PasswordPdfRequestType getPasswordPdfRequestType() {
        return passwordPdfRequestType;
    }

    public void setPasswordPdfRequestType(PasswordPdfRequestType passwordPdfRequestType) {
        this.passwordPdfRequestType = passwordPdfRequestType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
