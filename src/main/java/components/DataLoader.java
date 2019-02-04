package components;

import models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import repositories.Artist.ArtistRepository;
import repositories.Document.DocumentRepository;
import repositories.Group.GroupRepository;
import repositories.MultiEvent.MultiEventRepository;
import repositories.PhysicalAsset.PhysicalAssetRepository;
import repositories.SingleEvent.SingleEventRepository;


import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    MultiEventRepository multiEventRepository;

    @Autowired
    PhysicalAssetRepository physicalAssetRepository;

    @Autowired
    SingleEventRepository singleEventRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {



        SimpleDateFormat sfd = new SimpleDateFormat();
        String singleEventDate = "Thu, 17 Oct 2004 22:00:00 +0100";
        Date date01 = null;
        try {
            date01 = sfd.parse(singleEventDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Group vajra = new Group("Vajra");
        groupRepository.save(vajra);

        Artist artist1 = new Artist("Keiji Haino", vajra, "Japan");
        artistRepository.save(artist1);

        Artist artist2 = new Artist("Kan Mikami", vajra, "Japan");
        artistRepository.save(artist2);

        Artist artist3 = new Artist("Toshiaki Ishizuka", vajra, "Japan");
        artistRepository.save(artist3);

        MultiEvent instal04 = new MultiEvent("Instal 04", 2004);
        multiEventRepository.save(instal04);

        SingleEvent vajra_performance = new SingleEvent("Vajra", date01, "Glasgow", "The Arches", instal04);
        singleEventRepository.save(vajra_performance);

        Document document1 = new Document("Audio", "INSTAL_04_Vajra.wav", "WAV", 44.13, 0.45, "Recorded by so and so from the booth", "Master", vajra_performance);
        documentRepository.save(document1);

        PhysicalAsset vajraMinidisc = new PhysicalAsset("Audio", "Minidisc", "One of 10", "16", "Transcribed 2011", "Box 2");
        physicalAssetRepository.save(vajraMinidisc);

        vajra.addArtist(artist1);
        groupRepository.save(vajra);




//        jack.addRaid(raid1);
//        jack.addRaid(raid2);
//        pirateRepository.save(jack);
//
//        raid2.addPirate(john);
//        raidRepository.save(raid2);





    }
}
