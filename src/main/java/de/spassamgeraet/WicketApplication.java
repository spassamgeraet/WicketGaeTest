package de.spassamgeraet;

import org.apache.wicket.pageStore.memory.DataStoreEvictionStrategy;
import org.apache.wicket.pageStore.memory.MemorySizeEvictionStrategy;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.lang.Bytes;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see de.spassamgeraet.Start#main(String[])
 */
public class WicketApplication extends WebApplication implements GaeApplication
{    	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<Echo> getHomePage()
	{
		return Echo.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

		// add your configuration here
		
	}
	
	/**
	 * Setup custom eviction strategy for this application
	 */
	public DataStoreEvictionStrategy getEvictionStrategy()
	{
		return new MemorySizeEvictionStrategy(Bytes.megabytes(2));
	}
	
	
	
	
}
