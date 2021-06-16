package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.CustomerCheckSevice;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckSevice {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
