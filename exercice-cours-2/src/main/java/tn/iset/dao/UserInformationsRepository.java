package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.UserInformations;


@Repository
public interface UserInformationsRepository extends JpaRepository<UserInformations, Long> {

}
