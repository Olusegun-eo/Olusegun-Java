package africa.semicolon.jijiApplication.data.repositories;

import africa.semicolon.jijiApplication.data.models.Lister;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListerRepositoryTest {
    @Autowired
    private ListerRepository listerRepository;

    @Test
    public void repositorySaveTest(){
        Lister lister = new Lister();
        lister.setFullName("Tolu Agbaje");
        lister.setEmail("toluagbaje@yahoo.com");
        lister.setLocation("Alen-Ikeja");
        lister.setPhoneNumber("08012345678");
        Lister savedLister = listerRepository.save(lister);
        assertEquals("Tolu Agbaje", savedLister.getFullName());
    }

}