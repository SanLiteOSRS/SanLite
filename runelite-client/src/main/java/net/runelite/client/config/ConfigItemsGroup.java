package net.runelite.client.config;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ConfigItemsGroup implements Comparable
{
	@Getter(AccessLevel.PUBLIC)
	private final String group;

	@Getter(AccessLevel.PUBLIC)
	private List<ConfigItemDescriptor> items;

	ConfigItemsGroup(String group)
	{
		this.group = group;
		this.items = new ArrayList<>();
	}

	void addItem(ConfigItemDescriptor item)
	{
		items.add(item);
	}

	@Override
	public int compareTo(Object o)
	{
		return 0;
	}
}
