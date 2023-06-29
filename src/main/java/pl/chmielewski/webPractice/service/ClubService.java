package pl.chmielewski.webPractice.service;

import pl.chmielewski.webPractice.dto.ClubDto;
import pl.chmielewski.webPractice.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

    Club save(Club club);
}
