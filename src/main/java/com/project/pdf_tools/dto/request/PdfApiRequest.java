package com.project.pdf_tools.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PdfApiRequest {
    public String getOutputFileName() {
        return outputFileName;
    }

    protected String outputFileName;

}
