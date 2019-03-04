package com.arika.ArchiveDatabase;

import com.arika.ArchiveDatabase.models.Artist;
import com.arika.ArchiveDatabase.repositories.Artist.ArtistRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestArtist {

    @Autowired
    ArtistRepository artistRepository;

    Artist jean_luc_guionnet;

    @Before
    public void setUp(){
        jean_luc_guionnet = new Artist("Jean-Luc Guionnet", "France");
    }

    @Test
    public void canChangeName(){

    }
}
