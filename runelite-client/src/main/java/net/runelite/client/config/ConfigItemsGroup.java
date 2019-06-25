package net.runelite.client.config;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;

public class ConfigItemsGroup
{
	@Getter(AccessLevel.PUBLIC)
	private final String group;

	@Getter(AccessLevel.PUBLIC)
	private Collection<ConfigItemDescriptor> items;

	public ConfigItemsGroup(String group)
	{
		this.group = group;
		this.items = new ArrayList<>();
	}

	public void addItem(ConfigItemDescriptor item)
	{
		items.add(item);
	}
}
