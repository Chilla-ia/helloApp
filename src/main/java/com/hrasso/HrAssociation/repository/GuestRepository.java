package com.hrasso.HrAssociation.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrasso.HrAssociation.model.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

	Optional<Guest> getGuest(final Long id);

	Iterable<Guest> getGuests();

	void deleteGuest(final Long id);

	Guest saveGuest(Guest guest);
}
