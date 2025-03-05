package com.bis.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReader {

	public static void main(String[] args) throws IOException {
		String filename="C:\\Users\\G O D\\eclipse-workspace\\ErrorMakesPerfect\\src\\test\\resources\\BIS0365_Appraisal letter 2023_FY 2023 - 2024. (1).pdf";
		File file = new File(filename);
		PDDocument doc = Loader.loadPDF(file);
		PDFTextStripper pdf= new PDFTextStripper();
		System.out.println(pdf.getText(doc));
	}
}
