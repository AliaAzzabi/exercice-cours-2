package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iset.entities.CommandLine;


@Repository
public interface CommandLineRepository extends JpaRepository<CommandLine, Long> {

}
