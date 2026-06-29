package com.project.pdf_tools.dto.request.single_pdf;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PdfPasswordProtectionApiRequest extends SinglePdfApiRequest {
    private String password;
}
