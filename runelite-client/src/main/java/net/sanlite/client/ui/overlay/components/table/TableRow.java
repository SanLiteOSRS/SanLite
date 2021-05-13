package net.sanlite.client.ui.overlay.components.table;

import lombok.Builder;
import lombok.Data;

import java.awt.*;
import java.util.List;

@Data
@Builder
class TableRow
{
	Color rowColor;

	TableAlignment rowAlignment;

	@Builder.Default
	List<TableElement> elements;
}
