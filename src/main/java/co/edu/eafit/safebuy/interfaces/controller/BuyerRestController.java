package co.edu.eafit.safebuy.interfaces.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import co.edu.eafit.safebuy.domain.model.comprador.Buyer;
import co.edu.eafit.safebuy.infraestructure.persistence.util.PersistenceService;

@Controller
public class BuyerRestController {
	
	@Autowired
	private PersistenceService persistenceService;
	
	@RequestMapping("/hola.html")
	public ModelAndView getPage() {
		return new ModelAndView("index.html");
	}
	
	@RequestMapping(value = "/rest/buyer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Buyer> getSafeBuyerList(HttpServletResponse response) {
		//response.setHeader("Content-type", MediaType.APPLICATION_JSON.toString());
		return persistenceService.executeQuery(Buyer.class, "SELECT b FROM Buyer b");
	}
	
	
	@RequestMapping(value = "/rest/buyer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Buyer getSafeBuyer(HttpServletResponse response, @PathVariable("id") int id) {
		//response.setHeader("Content-type", MediaType.APPLICATION_JSON.toString());
		return persistenceService.findById(Buyer.class, id);
	}

	@RequestMapping(value = "/rest/buyer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Buyer createSafeBuyer(@RequestBody Buyer buyer, HttpServletResponse response) {
		return persistenceService.save(buyer);
	}

	@RequestMapping(value = "/rest/buyer/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public void updateSafeBuyer(@RequestBody Buyer buyer, @PathVariable("id") int id, HttpServletResponse response) {
		persistenceService.update(buyer);
	}

	@RequestMapping(value = "/rest/buyer/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteSafeBuyer(@PathVariable("id") int id, HttpServletResponse response) {
		persistenceService.remove(persistenceService.findById(Buyer.class, id));
	}
}
