package net.sanlite.client.ui.overlay.components.table;

import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@Builder
class TableElement
{
	TableAlignment alignment;

	Color color;

	String content;
}