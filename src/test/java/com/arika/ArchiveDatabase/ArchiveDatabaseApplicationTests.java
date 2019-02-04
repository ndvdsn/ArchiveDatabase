package com.arika.ArchiveDatabase;

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


	@Test
	public void contextLoads() {
	}



}

