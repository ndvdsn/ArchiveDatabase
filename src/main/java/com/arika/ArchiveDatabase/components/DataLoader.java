package com.arika.ArchiveDatabase.components;

import com.arika.ArchiveDatabase.models.*;
import com.arika.ArchiveDatabase.repositories.Permission.PermissionRepository;
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

    @Autowired
    PermissionRepository permissionRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {



        DateFormat sfd = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        String singleEventDate = "Thu, 17 Oct 2004 22:00:00 +0100";
        Date date01 = null;
        try {
            date01 = sfd.parse(singleEventDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // create multievents


        MultiEvent episode01 = new MultiEvent("Episode 01: A Film is a Political Statement", 2012);
        multiEventRepository.save(episode01);

        MultiEvent episode02 = new MultiEvent("Episode 02: A Special form of Darkness", 2012);
        multiEventRepository.save(episode02);

        MultiEvent episode03 = new MultiEvent("Episode 03: Copying Without Copying", 2012);
        multiEventRepository.save(episode03);

        MultiEvent episode07 = new MultiEvent("Episode 07: We Can't Live Without Our Lives", 2015);
        multiEventRepository.save(episode07);

        MultiEvent episode08 = new MultiEvent("Episode 08: Refuse Powers' Grasp", 2016);
        multiEventRepository.save(episode08);

        MultiEvent episode09 = new MultiEvent("Episode 09: Other Worlds Already Exist", 2017);
        multiEventRepository.save(episode09);

        MultiEvent instal10 = new MultiEvent("Instal 10", 2010);
        multiEventRepository.save(instal10);

        MultiEvent instal09 = new MultiEvent("Instal 09", 2009);
        multiEventRepository.save(instal09);

        MultiEvent instal08 = new MultiEvent("Instal 08", 2008);
        multiEventRepository.save(instal08);

        MultiEvent instal06 = new MultiEvent("Instal 06", 2006);
        multiEventRepository.save(instal06);

        MultiEvent instal05 = new MultiEvent("Instal 05", 2005);
        multiEventRepository.save(instal05);

        MultiEvent instal04 = new MultiEvent("Instal 04", 2004);
        multiEventRepository.save(instal04);

        MultiEvent instal03 = new MultiEvent("Instal 03", 2003);
        multiEventRepository.save(instal03);

        MultiEvent instal02 = new MultiEvent("Instal 02", 2002);
        multiEventRepository.save(instal02);

        MultiEvent kytn10 = new MultiEvent("Kill Your Timid Notion 10", 2010);
        multiEventRepository.save(kytn10);

        MultiEvent kytn08 = new MultiEvent("Kill Your Timid Notion 08", 2008);
        multiEventRepository.save(kytn08);

        MultiEvent kytn07 = new MultiEvent("Kill Your Timid Notion 07", 2007);
        multiEventRepository.save(kytn07);

        MultiEvent kytn06 = new MultiEvent("Kill Your Timid Notion 06", 2006);
        multiEventRepository.save(kytn06);

        MultiEvent kytn04 = new MultiEvent("Kill Your Timid Notion 04", 2004);
        multiEventRepository.save(kytn04);

        MultiEvent kytn03 = new MultiEvent("Kill Your Timid Notion 03", 2003);
        multiEventRepository.save(kytn03);

        MultiEvent uninstal10 = new MultiEvent("Uninstal", 2010);
        multiEventRepository.save(uninstal10);



        // create group
        Group vajra = new Group("Vajra");
        groupRepository.save(vajra);

        Group ki = new Group("Ki");
        groupRepository.save(ki);



        // create artist
        Artist artist1 = new Artist("Keiji Haino", "Japan");
        artistRepository.save(artist1);

        Artist artist2 = new Artist("Kan Mikami", "Japan");
        artistRepository.save(artist2);

        Artist artist3 = new Artist("Toshiaki Ishizuka", "Japan");
        artistRepository.save(artist3);

        Artist artistSgaireWood = new Artist("Sgaire Wood", "UK");
        artistRepository.save(artistSgaireWood);

        Artist fritzWelch = new Artist ("Fritz Welch", "USA");
        artistRepository.save(fritzWelch);

        Artist mico = new Artist("Mico", "USA");
        artistRepository.save(mico);

        Artist tamioShiraishi = new Artist("Tamio Shiraishi", "Japan");
        artistRepository.save(tamioShiraishi);

        Artist jeanLucGuionnet = new Artist("Jean Luc Guionnet", "France");
        artistRepository.save(jeanLucGuionnet);

        Artist rayBrassier = new Artist("Ray Brassier", "Scotland");
        artistRepository.save(rayBrassier);

        Artist seijiroMuruyama = new Artist("Seijiro Muruyama", "Japan");
        artistRepository.save(seijiroMuruyama);

        Artist ericLaCasa = new Artist("Eric La Casa", "France");
        artistRepository.save(ericLaCasa);



        // add artists to groups
        vajra.addArtist(artist1);
        vajra.addArtist(artist2);
        vajra.addArtist(artist3);
        groupRepository.save(vajra);

        ki.addArtist(fritzWelch);
        ki.addArtist(tamioShiraishi);
        ki.addArtist(mico);
        groupRepository.save(ki);


        // add group to artist
        artist1.addGroup(vajra);
        artist2.addGroup(vajra);
        artist3.addGroup(vajra);
        tamioShiraishi.addGroup(ki);
        mico.addGroup(ki);
        fritzWelch.addGroup(ki);

        // create single events
        SingleEvent seSgaireWood = new SingleEvent("Sgaire Wood", date01, "Glasgow", "Tramway", episode09);
        singleEventRepository.save(seSgaireWood);

        SingleEvent vajra_performance = new SingleEvent("Vajra", date01, "Glasgow", "The Arches", instal04);
        singleEventRepository.save(vajra_performance);

        SingleEvent kiInstal09 = new SingleEvent("Ki", date01, "Glasgow", "The Arches", instal09);
        singleEventRepository.save(kiInstal09);

        SingleEvent houseUninstal10 = new SingleEvent("House", date01, "Glasgow", "Tramway", uninstal10);
        singleEventRepository.save(houseUninstal10);

        SingleEvent usedSoundUninstal10 = new SingleEvent("Used Sound", date01, "Glasgow", "Tramway", uninstal10);
        singleEventRepository.save(usedSoundUninstal10);

        // add artists to single event
        vajra_performance.addArtist(artist1);
        vajra_performance.addArtist(artist2);
        vajra_performance.addArtist(artist3);
        singleEventRepository.save(vajra_performance);

        seSgaireWood.addArtist(artistSgaireWood);
        singleEventRepository.save(seSgaireWood);

        kiInstal09.addArtist(fritzWelch);
        kiInstal09.addArtist(tamioShiraishi);
        kiInstal09.addArtist(mico);
        singleEventRepository.save(kiInstal09);

        houseUninstal10.addArtist(jeanLucGuionnet);
        houseUninstal10.addArtist(ericLaCasa);
        singleEventRepository.save(houseUninstal10);

        usedSoundUninstal10.addArtist(jeanLucGuionnet);
        usedSoundUninstal10.addArtist(rayBrassier);
        usedSoundUninstal10.addArtist(seijiroMuruyama);
        singleEventRepository.save(usedSoundUninstal10);


        //add singleEvent to artist

        artist1.addSingleEvent(vajra_performance);
        artistRepository.save(artist1);

        artist2.addSingleEvent(vajra_performance);
        artistRepository.save(artist2);

        artist3.addSingleEvent(vajra_performance);
        artistRepository.save(artist3);

        artistSgaireWood.addSingleEvent(seSgaireWood);
        artistRepository.save(artistSgaireWood);

        fritzWelch.addSingleEvent(kiInstal09);
        artistRepository.save(fritzWelch);

        tamioShiraishi.addSingleEvent(kiInstal09);
        artistRepository.save(tamioShiraishi);

        mico.addSingleEvent(kiInstal09);
        artistRepository.save(mico);

        jeanLucGuionnet.addSingleEvent(houseUninstal10);
        jeanLucGuionnet.addSingleEvent(usedSoundUninstal10);
        artistRepository.save(jeanLucGuionnet);

        ericLaCasa.addSingleEvent(houseUninstal10);
        artistRepository.save(ericLaCasa);

        rayBrassier.addSingleEvent(usedSoundUninstal10);
        artistRepository.save(rayBrassier);

        seijiroMuruyama.addSingleEvent(usedSoundUninstal10);
        artistRepository.save(seijiroMuruyama);



        // create permission
        Permission permission1 = new Permission("Yes", "Yes", "Yes", "CC BY-NC-ND 4:0", "Arika", "Test string", "12/6/10", artist2);
        permissionRepository.save(permission1);

        // create permission
        Permission permission2 = new Permission("No", "Yes", "Yes", "Copyright", "Arika", "Test string 2", "3/4/11", artist1);
        permissionRepository.save(permission2);

        Permission fritzKiPerm = new Permission("Yes", "Yes", "Yes", "None", "Arika", "blah", "10/11/10", fritzWelch);
        permissionRepository.save(fritzKiPerm);

        Permission tamioKiPerm = new Permission("Yes", "Yes", "Yes", "None", "Arika", "blah", "10/11/10", tamioShiraishi);
        permissionRepository.save(tamioKiPerm);

        Permission micoKiPerm = new Permission("Yes", "Yes", "Yes", "None", "Arika", "blah", "10/11/10", mico);
        permissionRepository.save(micoKiPerm);

        Permission sgaireSgairePerm = new Permission("Yes", "Yes", "Yes", "CC BY-ND-ND 4.0", "Arika", "Magical", "20/11/17", artistSgaireWood);
        permissionRepository.save(sgaireSgairePerm);


        // save artist to permission
        permission2.setArtist(artist1);
        permissionRepository.save(permission2);

        permission1.setArtist(artist2);
        permissionRepository.save(permission1);

        fritzKiPerm.setArtist(fritzWelch);
        permissionRepository.save(fritzKiPerm);

        tamioKiPerm.setArtist(tamioShiraishi);
        permissionRepository.save(tamioKiPerm);

        micoKiPerm.setArtist(mico);
        permissionRepository.save(micoKiPerm);


        // create document
        Document document1 = new Document("Audio", "INSTAL_04_Vajra.wav", "WAV", 44.13, 0.45, "Recorded by so and so from the booth", "Master", vajra_performance);
        documentRepository.save(document1);

        Document kiWavMasterInstal08 = new Document("Audio", "INSTAL_08_Ki.wav", "WAV", 60.17, 0.40, "Recorded by Kenny", "Master", kiInstal09);
        documentRepository.save(kiWavMasterInstal08);


        // save permissions to document
        document1.addPermissions(permission1);
        document1.addPermissions(permission2);
        document1.setSingleEvent(vajra_performance);


        kiWavMasterInstal08.addPermissions(fritzKiPerm);
        kiWavMasterInstal08.addPermissions(micoKiPerm);
        kiWavMasterInstal08.addPermissions(tamioKiPerm);



        //   save artist to document
        document1.addArtists(artist1);
        document1.addArtists(artist2);
        documentRepository.save(document1);

        kiWavMasterInstal08.addArtists(fritzWelch);
        kiWavMasterInstal08.addArtists(tamioShiraishi);
        kiWavMasterInstal08.addArtists(mico);
        documentRepository.save(kiWavMasterInstal08);

        // create physical asset
        PhysicalAsset vajraMinidisc = new PhysicalAsset("Audio", "Minidisc", "One of 10", "16", "Transcribed 2011", "Box 2", vajra_performance);
        physicalAssetRepository.save(vajraMinidisc);

        PhysicalAsset kiCDR = new PhysicalAsset("audio", "CDR", "white disc", "n/a", "supplied by Kenny, digitised 2011", "Box 2", kiInstal09);
        physicalAssetRepository.save(kiCDR);

        // save artists to physical item
        vajraMinidisc.addArtist(artist1);
        vajraMinidisc.addArtist(artist2);
        vajraMinidisc.addArtist(artist3);
        physicalAssetRepository.save(vajraMinidisc);


        kiCDR.addArtist(fritzWelch);
        kiCDR.addArtist(mico);
        kiCDR.addArtist(tamioShiraishi);
        physicalAssetRepository.save(kiCDR);


        // save document to physical item

        vajraMinidisc.addDocument(document1);

        kiCDR.addDocument(kiWavMasterInstal08);

        document1.addPhysicalAsset(vajraMinidisc);

        kiWavMasterInstal08.addPhysicalAsset(kiCDR);

        documentRepository.save(kiWavMasterInstal08);

        documentRepository.save(document1);





    }
}
