package co.edu.eafit.safebuy.util;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class ResponseMessage {

	public static ModelAndView createMessage(String mensaje, MessageType tipo) {
		ModelMap map = new ModelMap();
		map.put("message", mensaje);
		map.put("type", tipo);
		return new ModelAndView("/pages/responseMessage.jsp", map);
	}
}
