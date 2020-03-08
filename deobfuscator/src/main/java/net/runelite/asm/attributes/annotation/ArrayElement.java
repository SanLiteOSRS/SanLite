package net.runelite.asm.attributes.annotation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public class ArrayElement extends Element<List> implements Iterable<Object>
{
	public ArrayElement(String name)
	{
		this.name = name;
		this.value = new ArrayList<>();
	}

	public void addValue(Object value)
	{
		this.value.add(value);
	}

	@Override
	public final void setValue(List value)
	{
		throw new UnsupportedOperationException();
	}

	@NotNull
	@Override
	public Iterator<Object> iterator()
	{
		return this.value.iterator();
	}

	public Stream<Object> stream()
	{
		return this.value.stream();
	}
}
