package com.project.pdf_tools.entity.password_protection;

import com.project.pdf_tools.enums.PasswordPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "remove_password_pdf_requests")
public class RemovePasswordPdfRequest extends PasswordPdfRequest {
    public RemovePasswordPdfRequest(){
        this.setPasswordPdfRequestType(PasswordPdfRequestType.REMOVE);
    }
}
