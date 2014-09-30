package co.edu.eafit.safebuy.interfaces.controller;

import java.text.ParseException;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.edu.eafit.safebuy.domain.model.comprador.Buyer;
import co.edu.eafit.safebuy.infraestructure.persistence.util.PersistenceService;
import co.edu.eafit.safebuy.util.MessageType;
import co.edu.eafit.safebuy.util.ResponseMessage;

@Controller
public class RegisterBuyerController {

	@Autowired
	private PersistenceService persistenceService;

	@RequestMapping("/registerBuyer.html")
	public ModelAndView getPage() {
		return new ModelAndView("/pages/registerBuyer.jsp");
	}

	@RequestMapping("/registerBuyerAction.html")
	public ModelAndView submitForm(
			@RequestParam String user,
			@RequestParam String name,
			@RequestParam String lastName,
			@RequestParam String birthDay,
			@RequestParam String email,
			@RequestParam(required = false, defaultValue = "false") Boolean receiveNotification)
			throws ParseException {
		if (StringUtils.isEmpty(user)) {
			return ResponseMessage.createMessage(
					"El Nombre de usuario no puede estar vacio",
					MessageType.error);
		}
		if (StringUtils.isEmpty(name)) {
			return ResponseMessage.createMessage(
					"El Nombre no puede estar vacio", MessageType.error);
		}
		if (StringUtils.isEmpty(lastName)) {
			return ResponseMessage.createMessage(
					"El Apellido no puede estar vacio", MessageType.error);
		}
		if (StringUtils.isEmpty(birthDay)) {
			return ResponseMessage.createMessage(
					"El cumpleanos no puede estar vacio", MessageType.error);
		}
		if (StringUtils.isEmpty(email)) {
			return ResponseMessage.createMessage(
					"El Email no puede estar vacio", MessageType.error);
		}
		Buyer buyer = new Buyer();
		buyer.setName(user);
		buyer.setLastName(lastName);

		List<Buyer> existingBuyersWithId = persistenceService.executeQuery(Buyer.class, "SELECT b FROM Buyer b WHERE b.name = '" + user + "'");
		
		if (CollectionUtils.isNotEmpty(existingBuyersWithId)) {
			return ResponseMessage.createMessage(
					"El usuario comprador ya existe: " + user,
					MessageType.error);
		}

		persistenceService.save(buyer);

		return ResponseMessage.createMessage("Comprador Creado",
				MessageType.success);
	}
}
