package com.pokemon.repo;

import com.pokemon.entity.GlobalCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalCardRepository extends CrudRepository<GlobalCard, Long> {
}
