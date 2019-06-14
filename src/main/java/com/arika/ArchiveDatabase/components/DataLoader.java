package com.arika.ArchiveDatabase.components;

import com.arika.ArchiveDatabase.models.*;
import com.arika.ArchiveDatabase.repositories.PhysicalAsset.PhysicalAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.arika.ArchiveDatabase.repositories.Artist.ArtistRepository;
import com.arika.ArchiveDatabase.repositories.Document.DocumentRepository;
import com.arika.ArchiveDatabase.repositories.Group.GroupRepository;
import com.arika.ArchiveDatabase.repositories.MultiEvent.MultiEventRepository;
import com.arika.ArchiveDatabase.repositories.SingleEvent.SingleEventRepository;


import java.text.DateFormat;
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



        Group vajra = new Group("Vajra");
        groupRepository.save(vajra);

        Artist artist1 = new Artist("Keiji Haino", "Japan");
        artistRepository.save(artist1);

        Artist artist2 = new Artist("Kan Mikami", "Japan");
        artistRepository.save(artist2);

        Artist artist3 = new Artist("Toshiaki Ishizuka", "Japan");
        artistRepository.save(artist3);

        MultiEvent instal04 = new MultiEvent("Instal 04", 2004);
        multiEventRepository.save(instal04);

        MultiEvent episode07 = new MultiEvent("Episode 07: We Can't Live Without Our Lives", 2015);
        multiEventRepository.save(episode07);

        MultiEvent episode08 = new MultiEvent("Episode 08: Refuse Powers' Grasp", 2016);
        multiEventRepository.save(episode08);

        MultiEvent episode09 = new MultiEvent("Episode 09: Other Worlds Already Exist", 2017);
        multiEventRepository.save(episode09);


        Artist artistSgaireWood = new Artist("Sgaire Wood", "UK");
        artistRepository.save(artistSgaireWood);

        Artist storyboardP = new Artist("Storyboard P", "USA");
        artistRepository.save(storyboardP);

        SingleEvent seSgaireWood = new SingleEvent("Sgaire Wood", "19 Nov 2017", "18:15", "Glasgow", "Tramway", episode09);
        singleEventRepository.save(seSgaireWood);

        SingleEvent seStoryboardP = new SingleEvent("Storyboard P", "Something November 2017", "19:00", "Glasgow", "Tramway", episode09);
        singleEventRepository.save(seStoryboardP);

        SingleEvent vajra_performance = new SingleEvent("Vajra", "17 Oct 2004", "22:00", "Glasgow", "The Arches", instal04);
        singleEventRepository.save(vajra_performance);

        Document document1 = new Document("Audio", "INSTAL_04_Vajra.wav", "WAV", 44.13, 0.45, "Recorded by so and so from the booth", "Master", vajra_performance);
        documentRepository.save(document1);

        PhysicalAsset vajraMinidisc = new PhysicalAsset("Audio", "Minidisc", "One of 10", "16", "Transcribed 2011", "Box 2", vajra_performance);
        physicalAssetRepository.save(vajraMinidisc);

        vajra.addArtist(artist1);
        groupRepository.save(vajra);

        vajra.addArtist(artist2);
        groupRepository.save(vajra);

        vajra.addArtist(artist3);
        groupRepository.save(vajra);

        vajra_performance.addArtist(artist1);
        singleEventRepository.save(vajra_performance);

        vajra_performance.addArtist(artist2);
        singleEventRepository.save(vajra_performance);

        vajra_performance.addArtist(artist3);
        singleEventRepository.save(vajra_performance);

        seSgaireWood.addArtist(artistSgaireWood);
        singleEventRepository.save(seSgaireWood);

        seStoryboardP.addArtist(storyboardP);
        singleEventRepository.save(seStoryboardP);



        artist1.addSingleEvent(vajra_performance);
        artist2.addSingleEvent(vajra_performance);
        artist3.addSingleEvent(vajra_performance);
        artist1.addGroup(vajra);
        artist2.addGroup(vajra);
        artist3.addGroup(vajra);
        artistRepository.save(artist1);
        artistRepository.save(artist2);
        artistRepository.save(artist3);
        artistSgaireWood.addSingleEvent(seSgaireWood);
        artistRepository.save(artistSgaireWood);
        storyboardP.addSingleEvent(seStoryboardP);
        artistRepository.save(storyboardP);


    }
}
