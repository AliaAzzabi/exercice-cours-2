package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.Payement;

@Repository
public interface PayementRepository extends JpaRepository<Payement,Long>{

}
