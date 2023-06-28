package pl.chmielewski.webPractice.service;

import pl.chmielewski.webPractice.dto.ClubDto;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

}
