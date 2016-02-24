/**
 * 
 */
package dylan.ic;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author langdylan Feb 7, 2016 2:09:34 PM
 */
public class JavaCollection
{

	List		addressList;
	Set			addressSet;
	Map			addressMap;
	Properties	addressProp;

	/**
	 * @return the addressList
	 */
	public List getAddressList()
	{
		System.out.println("List elements: " + addressList);
		return addressList;
	}

	/**
	 * @param addressList
	 *            the addressList to set
	 */
	public void setAddressList(List addressList)
	{
		this.addressList = addressList;
	}

	/**
	 * @return the addressSet
	 */
	public Set getAddressSet()
	{
		System.out.println("Set elements: " + addressSet);
		return addressSet;
	}

	/**
	 * @param addressSet
	 *            the addressSet to set
	 */
	public void setAddressSet(Set addressSet)
	{
		this.addressSet = addressSet;
	}

	/**
	 * @return the addressMap
	 */
	public Map getAddressMap()
	{
		System.out.println("Map elements: "+addressMap);
		return addressMap;
	}

	/**
	 * @param addressMap
	 *            the addressMap to set
	 */
	public void setAddressMap(Map addressMap)
	{
		this.addressMap = addressMap;
	}

	/**
	 * @return the addressProp
	 */
	public Properties getAddressProp()
	{System.out.println("Properties elements: "+addressProp);
		return addressProp;
	}

	/**
	 * @param addressProp
	 *            the addressProp to set
	 */
	public void setAddressProp(Properties addressProp)
	{
		this.addressProp = addressProp;
	}

}
