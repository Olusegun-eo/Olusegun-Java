package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bvn;
import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class BvnRepositoryImplement implements BvnRepository {

    List<Bvn> bvns = new ArrayList<>();

    @Override
    public Bvn save(Bvn bvn) {
        bvns.add(bvn);
        return findByCustomerId(bvn.getId());
    }

    @Override
    public Bvn findByCustomerId(String id) {
        for (Bvn bvn : bvns) {
            if (bvn.getId().equalsIgnoreCase(id)){
                return bvn;
            }
        }
        return null;
    }

    @Override
    public void delete(Bvn bvn) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Bvn> findAll() {
        return null;
    }

}
