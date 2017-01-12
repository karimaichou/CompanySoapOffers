package Service;

import DAO.OfferDao;
import Entities.Offer;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karima on 11/01/2017.
 */
@WebService(endpointInterface = "Service.SoapOffer")
public class SoapOfferImpl implements SoapOffer {

    @Override
    public ArrayList<Offer> getAllOffers() {
        OfferDao offerDao=new OfferDao();
        return offerDao.findAll();
    }

    @Override
    public Offer getById(int id) {
        OfferDao offerDao=new OfferDao();
        return offerDao.findById(id);
    }

    @Override
    public ArrayList<Offer> getBykeyword(String keyword) {
        OfferDao offerDao=new OfferDao();
        return offerDao.findByKeyword(keyword);
    }
}
