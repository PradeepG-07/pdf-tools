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
1. Accept multiple PDF files, and show a small preview of them with filename, size in KB, page count. 
2. Should be able to change the order of the PDFs through drag and drop after uploading.
3. Optional file name for the resultant processed PDF or defaults to `merged_<timestamp>.pdf`.

### Split
1. Should accept only a single file at once.
2. PDF should be able to split in either of three ways
   1. **Range**: Accept multiple ranges with add new range button.
   2. **Fixed**: Accept a single number input. Each resultant PDF should have given number of pages. 
   3. **Custom**: Should accept a comma separated string which contains either single page number or page ranges.
3. Output will be downloaded as PDF if result is one, otherwise zip. 

### Compress
1. Should accept only one PDF file
2. Target compression size must be smaller than original PDF size.
3. Optional file name for the resultant processed PDF or defaults to `compressed_original_file_name.pdf`.

### Password Protection
1. Should accept only one PDF file
2. Add / Remove password functionalities are expected with input of a password.
3. Optional file name for the resultant processed PDF or defaults to `protected/unprotected_original_file_name.pdf`.

## Non-Functional Requirements
1. Max concurrent jobs = 5 per application. Can be configured via `application.properties`.
2. Max PDF size = 50MB.
3. Temporary in-memory storage of PDFs and Passwords.

## HLD
[Draw.io](https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&layers=1&nav=1&title=PDF%20Tools&transparent=1&dark=1#Uhttps%3A%2F%2Fdrive.google.com%2Fuc%3Fid%3D1uf5GLl4ATf-KOGbpIk_V_fEB4bM1JfVr%26export%3Ddownload)

## LLD
[Draw.io](https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&layers=1&nav=1&title=PDF%20Tools&page-id=j-ekPqOkfmkwKP3RkU5V&dark=1#Uhttps%3A%2F%2Fdrive.google.com%2Fuc%3Fid%3D1uf5GLl4ATf-KOGbpIk_V_fEB4bM1JfVr%26export%3Ddownload)