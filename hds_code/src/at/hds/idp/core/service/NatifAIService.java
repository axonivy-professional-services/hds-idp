package at.hds.idp.core.service;

import java.util.List;

public class NatifAIService {
	public static List<String> getIncludes() {
		return List.of("extractions","include=ocr","include=page-images","include=thumbnail","include=pdf");
	}
	
	public static Integer getWaitFor() {
		return 120;
	}
}
