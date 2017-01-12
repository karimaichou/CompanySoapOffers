package Publisher;

/**
 * Created by karima on 11/01/2017.
 */
import Service.SoapOfferImpl;

import javax.xml.ws.Endpoint;
//Endpoint publisher
public class Publisher{
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7779/ws/hello", new SoapOfferImpl());
    }
}