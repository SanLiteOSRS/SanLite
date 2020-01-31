package net.runelite.client.plugins.transmog;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.annotation.Nullable;
import javax.swing.*;

/**
 * Used with ComboBoxListRenderer to render an icon next to the text of the list entry.
 * Also supports adding a data object to be used for more complex selection logic
 */
@AllArgsConstructor
@Getter
public class ComboBoxIconEntry
{
	private Icon icon;
	private String text;
	@Nullable
	private Object data;
}
