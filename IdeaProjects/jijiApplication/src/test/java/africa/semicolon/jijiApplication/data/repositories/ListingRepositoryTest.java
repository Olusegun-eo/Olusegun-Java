package africa.semicolon.jijiApplication.data.repositories;


import africa.semicolon.jijiApplication.data.models.Condition;
import africa.semicolon.jijiApplication.data.models.Listing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListingRepositoryTest {
    @Autowired
    private ListingRepository listingRepository;


@Test
    public void saveListingTest(){
    Listing listing  = new Listing();
    listing.setCondition(Condition.USED);
    listing.setName("Pixel 6");
    listing.setShortDescription("The Original Google Pixel 6");
    listing.setLongDescription("The World of Ecstasy");
    Listing savedListing = listingRepository.save(listing);
    assertEquals("Pixel 6", savedListing.getName());
    }
}