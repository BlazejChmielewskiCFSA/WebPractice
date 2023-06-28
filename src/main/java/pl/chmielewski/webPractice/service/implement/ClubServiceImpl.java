package pl.chmielewski.webPractice.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import pl.chmielewski.webPractice.dto.ClubDto;
import pl.chmielewski.webPractice.models.Club;
import pl.chmielewski.webPractice.repository.ClubRepository;
import pl.chmielewski.webPractice.service.ClubService;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club -> mapToClubDto(club))).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club){
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createOn(club.getCreateOn())
                .updateOn(club.getUpdateOn())
                .build();
        return clubDto;
    }
}
