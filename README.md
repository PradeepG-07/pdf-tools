# PDF Tools
> An easy and secure way to access and manage PDFs locally.

## Overview
1. This project is created to provide easy access to tools to manage PDFs without relying on external websites which can cause privacy concerns.
2. Current supported tools are listed below:
   1. Merge
   2. Split
   3. Compress 
   4. Password Protection

## Functional Requirements
### Merge
1. Accept multiple PDF files, and show a small preview of them. 
2. Should be able to change the order of the PDFs after uploading.
3. Optional file name for the resultant processed PDF.

### Split
1. Should accept only a single file at once.
2. PDF should be able to split in either of three ways
   1. **Range**: Accept multiple ranges with add new range button.
   2. **Fixed**: Accept a single number input. Each resultant PDF should have given number of pages. 
   3. **Custom**: Should accept a comma separated string which contains either single page number or page ranges.

### Compress
1. Should accept only one PDF file
2. Compress the PDF file to provided size if possible or reduce as much as possible.
3. Optional file name for the resultant processed PDF.

### Password Protection
1. Should accept only one PDF file
2. Add / Remove password functionalities are expected with input of a password.

