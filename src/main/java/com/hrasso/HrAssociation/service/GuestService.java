package com.hrasso.HrAssociation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrasso.HrAssociation.model.Guest;
import com.hrasso.HrAssociation.repository.GuestRepository;

import lombok.Data;

@Data
@Service
public class GuestService {

	@Autowired
	private GuestRepository guestRepo;

	public Optional<Guest> getGuest(final Long id) {
		return guestRepo.findById(id);
	}

	public Iterable<Guest> getGuests() {
		return guestRepo.findAll();
	}

	public void deleteGuest(final Long id) {
		guestRepo.deleteById(id);
	}

	public Guest saveGuest(Guest guest) {
		Guest savedGuest = guestRepo.save(guest);
		return savedGuest;
	}

}
