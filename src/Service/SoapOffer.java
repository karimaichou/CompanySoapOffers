package Service;

import Entities.Offer;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karima on 11/01/2017.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SoapOffer {

    @WebMethod
    ArrayList<Offer> getAllOffers();

    @WebMethod
    Offer getById(int id);

    @WebMethod
    ArrayList<Offer> getBykeyword(String keyword);



}
