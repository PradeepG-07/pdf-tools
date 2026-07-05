package com.project.pdf_tools.entity.password_protection;

import com.project.pdf_tools.enums.PasswordPdfRequestType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "add_password_pdf_requests")
public class AddPasswordPdfRequest extends PasswordPdfRequest {
   public AddPasswordPdfRequest(){
       this.setPasswordPdfRequestType(PasswordPdfRequestType.ADD);
   }
}
