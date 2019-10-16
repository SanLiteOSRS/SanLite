package net.runelite.client.ui.overlay.components.table;

import java.awt.Color;
import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TableRow
{
	Color rowColor;
	TableAlignment rowAlignment;
	@Builder.Default
	List<TableElement> elements = Collections.emptyList();
}