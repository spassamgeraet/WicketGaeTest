package de.spassamgeraet;

import org.apache.wicket.pageStore.memory.DataStoreEvictionStrategy;

public interface GaeApplication
{
	DataStoreEvictionStrategy getEvictionStrategy();
}
