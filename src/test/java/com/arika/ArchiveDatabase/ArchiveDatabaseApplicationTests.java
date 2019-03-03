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

		SingleEvent danceThing = new SingleEvent("Dance Thing", date, "Glasgow", "Tramway", episode9);
		singleEventRepository.save(danceThing);

	}

	@Test
	public void addPermissions(){

		Artist fritz = new Artist ("Fritz Welch", "USA");
		artistRepository.save(fritz);

		Permission permission1 = new Permission(true, true, true, "Copyright", "Arika", "something something", "23/6/14", fritz);
		permissionRepository.save(permission1);
	}



}

