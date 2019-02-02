package components;

import models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import repositories.Artist.ArtistRepository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    ArtistRepository artistRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        DateFormat sfd = new SimpleDataFormat("EEE, d MMM yyyy HH:mm:ss Z");
        String singleEventDate = "Thu, 13 Dec 2018 13:00:00 +0100";
        Date date01 = null;
        try {
            date01 = sfd.parse(singleEventDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Artist artist1 = new Artist("Keiji Haino", "etc", "Japan");
        artistRepository.save(artist1);
    }
}
