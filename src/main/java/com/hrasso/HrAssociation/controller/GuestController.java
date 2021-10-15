package com.hrasso.HrAssociation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrasso.HrAssociation.model.Guest;
import com.hrasso.HrAssociation.service.GuestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("API pour les opérations CRUD sur les invités.")
public class GuestController {

	@Autowired
	private GuestService guestService;

	// Récupérer un produit par son Id
	@ApiOperation(value = "Récupère une liste d'invité")
	@GetMapping("/guests")
	public Iterable<Guest> getAllGuests() {
		return guestService.getGuests();
	}

	@ApiOperation(value = "Récupère un invité via son id")
	@GetMapping("/guest/{id}")
	public Optional<Guest> getGuestById(Long id) {
		return guestService.getGuest(id);
	}
}
