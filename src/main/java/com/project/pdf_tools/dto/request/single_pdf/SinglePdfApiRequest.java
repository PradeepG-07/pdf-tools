package com.project.pdf_tools.dto.request.single_pdf;

import com.project.pdf_tools.dto.request.PdfApiRequest;
import lombok.Getter;
import lombok.Setter;

import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public abstract class SinglePdfApiRequest extends PdfApiRequest {
    protected MultipartFile pdf;

    public MultipartFile getPdf() {
        return pdf;
    }
}
