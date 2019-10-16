package net.runelite.client.ui.overlay.components.table;

import java.awt.Color;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TableElement
{
	TableAlignment alignment;
	Color color;
	String content;
}