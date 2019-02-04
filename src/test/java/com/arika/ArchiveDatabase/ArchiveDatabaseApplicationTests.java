package com.arika.ArchiveDatabase;

import models.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repositories.Artist.ArtistRepository;
import repositories.Document.DocumentRepository;
import repositories.Group.GroupRepository;
import repositories.MultiEvent.MultiEventRepository;
import repositories.PhysicalAsset.PhysicalAssetRepository;
import repositories.SingleEvent.SingleEventRepository;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArchiveDatabaseApplicationTests {

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


	Artist artist;
	Group group;
	Document document;
	MultiEvent multiEvent;
	SingleEvent singleEvent;
	PhysicalAsset physicalAsset;
	Date date;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createArtistAndGroup(){
		Group vajra = new Group("Vajra");
		groupRepository.save(vajra);

		Artist haino = new Artist("Keiji Haino", vajra, "Japan");
		artistRepository.save(haino);
	}

	@Test
	public void addsingleAndMultiEvents(){

		MultiEvent episode9 = new MultiEvent("Episode 9", 2014);
		multiEventRepository.save(episode9);

		SingleEvent danceThing = new SingleEvent("Dance Thing", date, "Glasgow", "Tramway", episode9);
		singleEventRepository.save(danceThing);



	}



}

