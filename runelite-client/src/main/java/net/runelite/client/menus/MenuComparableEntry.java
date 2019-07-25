package net.runelite.client.menus;

import joptsimple.internal.Strings;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import net.runelite.api.MenuEntry;
import net.runelite.client.util.Text;

import static net.runelite.client.menus.MenuManager.LEVEL_PATTERN;

@EqualsAndHashCode
public class MenuComparableEntry
{
	@Getter
	private String option;

	@Getter
	private String target;

	@Getter
	private int id;

	@Getter
	private int type;

	@Getter
	private boolean strictOption;

	@Getter
	private boolean strictTarget;

	public MenuComparableEntry(String option, String target)
	{
		this(option, target, -1, -1, true, true);
	}

	public MenuComparableEntry(String option, String target, boolean strictTarget)
	{
		this(option, target, -1, -1, true, strictTarget);
	}

	public MenuComparableEntry(String option, String target, int id, int type, boolean strictOption, boolean strictTarget)
	{
		this.option = Text.standardize(option);
		this.target = Text.standardize(target);
		this.id = id;
		this.type = type;
		this.strictOption = strictOption;
		this.strictTarget = strictTarget;
	}

	// This is only used for type checking, which is why it has everything but target
	// target sometimes changes to option.
	public MenuComparableEntry(MenuEntry e)
	{
		this.option = Text.standardize(e.getOption());
		this.id = e.getIdentifier();
		this.type = e.getType();
		this.strictOption = true;
	}

	boolean matches(MenuEntry entry)
	{
		String opt = Text.standardize(entry.getOption());

		if (strictOption && !opt.equals(option) || !strictOption && !opt.contains(option))
		{
			return false;
		}

		if (strictTarget || !Strings.isNullOrEmpty(target))
		{
			String tgt = Text.standardize(LEVEL_PATTERN.matcher(entry.getTarget()).replaceAll(""));

			if (strictTarget && !tgt.equals(target) || !strictTarget && !tgt.contains(target))
			{
				return false;
			}
		}

		if (id != -1)
		{
			int id = entry.getIdentifier();

			if (this.id != id)
			{
				return false;
			}
		}

		if (type != -1)
		{
			int type = entry.getType();
			return this.type == type;
		}

		return true;
	}
}
