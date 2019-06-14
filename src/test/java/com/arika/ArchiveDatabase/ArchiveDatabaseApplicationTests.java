package com.arika.ArchiveDatabase;

import com.arika.ArchiveDatabase.models.*;
import com.arika.ArchiveDatabase.repositories.Permission.PermissionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.arika.ArchiveDatabase.repositories.Artist.ArtistRepository;
import com.arika.ArchiveDatabase.repositories.Document.DocumentRepository;
import com.arika.ArchiveDatabase.repositories.Group.GroupRepository;
import com.arika.ArchiveDatabase.repositories.MultiEvent.MultiEventRepository;
import com.arika.ArchiveDatabase.repositories.PhysicalAsset.PhysicalAssetRepository;
import com.arika.ArchiveDatabase.repositories.SingleEvent.SingleEventRepository;

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

	@Autowired
	PermissionRepository permissionRepository;


	Artist artist;
	Group group;
	Document document;
	MultiEvent multiEvent;
	SingleEvent singleEvent;
	PhysicalAsset physicalAsset;
	Permission permission;
	Date date;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createArtistAndGroup(){
		Group vajra = new Group("Vajra");
		groupRepository.save(vajra);

		Artist haino = new Artist("Keiji Haino", "Japan");
		artistRepository.save(haino);
	}

	@Test
	public void addSingleAndMultiEvents(){

		MultiEvent episode9 = new MultiEvent("Episode 9", 2014);
		multiEventRepository.save(episode9);

		SingleEvent danceThing = new SingleEvent("Dance Thing", "17 Nov 2017", "19:00", "Glasgow", "Tramway", episode9);
		singleEventRepository.save(danceThing);

	}

	@Test
	public void addPermissions(){

		Artist fritz = new Artist ("Fritz Welch", "USA");
		artistRepository.save(fritz);

		Permission permission1 = new Permission(true, true, true, "Copyright", "Arika", "something something", "23/6/14", fritz);
		permissionRepository.save(permission1);
	}

	@Test
	public void addDocument(){

		MultiEvent instal10 = new MultiEvent("Instal 10", 2010);
		multiEventRepository.save(instal10);

		SingleEvent fritz10 = new SingleEvent("Fritz Welch", "15 Oct 2010", "19:00", "Glasgow", "Tramway", instal10);
		singleEventRepository.save(fritz10);

		Document document1 = new Document("Audio", "Instal_10_Fritz_Welch.wav", "WAV", 230.66, 65.33, "from source", "Master", fritz10);
		documentRepository.save(document1);
	}

	@Test
	public void addPhysicalAsset(){

		Artist fritz = new Artist ("Fritz Welch", "USA");
		artistRepository.save(fritz);

		MultiEvent instal10 = new MultiEvent("Instal 10", 2010);
		multiEventRepository.save(instal10);

		SingleEvent fritz10 = new SingleEvent("Fritz Welch", "23 July 2010", "18:00", "Glasgow", "Tramway", instal10);
		singleEventRepository.save(fritz10);

		Document document1 = new Document("Audio", "Instal_10_Fritz_Welch.wav", "WAV", 230.66, 65.33, "from source", "Master", fritz10);
		documentRepository.save(document1);

		PhysicalAsset physicalAsset1 = new PhysicalAsset("Video", "DV Tape", "Label says such and such", "34", "something", "Box 3", fritz10);
		physicalAssetRepository.save(physicalAsset1);

	}


	// create tests to save and delete each model
	//

}

