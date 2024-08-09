package com.axonivy.hds.idp.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDPService {
	public static List<String> getIncludes() {
		return List.of("extractions","include=ocr","include=page-images","include=thumbnail","include=pdf");
	}
	
	public static Integer getWaitFor() {
		return 120;
	}
	
	public static String getFileNameFromHeaderResponse(String str) {
        String regex = "filename=\"([^\"]+)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            String fileName = matcher.group(1);
           return fileName;
        } else {
            return null;
        }
	}
}
