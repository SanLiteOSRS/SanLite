import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
class class18 implements Comparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lj;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 50
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "-60"
	)
	int method257(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 52
	}

	public int compare(Object var1, Object var2) {
		return this.method257((Entry)var1, (Entry)var2); // L: 56
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 60
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "42"
	)
	public static int method266(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var1;
		} else if (var2 == 1) { // L: 11
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "801580605"
	)
	static int method267(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method269(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I[B[BB)V",
		garbageValue = "120"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3622 == null) { // L: 1172
			if (var2 == null) { // L: 1173
				return; // L: 1179
			}

			var0.field3622 = new byte[11][]; // L: 1174
			var0.field3623 = new byte[11][]; // L: 1175
			var0.field3630 = new int[11]; // L: 1176
			var0.field3625 = new int[11]; // L: 1177
		}

		var0.field3622[var1] = var2; // L: 1181
		if (var2 != null) {
			var0.field3621 = true; // L: 1182
		} else {
			var0.field3621 = false; // L: 1184

			for (int var4 = 0; var4 < var0.field3622.length; ++var4) { // L: 1185
				if (var0.field3622[var4] != null) { // L: 1186
					var0.field3621 = true; // L: 1187
					break;
				}
			}
		}

		var0.field3623[var1] = var3; // L: 1192
	} // L: 1193

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;I)V",
		garbageValue = "-156913966"
	)
	static void method263(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1427
		Client.archiveLoaders.add(var2); // L: 1428
		Client.field804 += var2.groupCount; // L: 1429
	} // L: 1430

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lkd;III)V",
		garbageValue = "-1041605206"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11895
			if (var0 != null && class306.method6317(var0) != null) { // L: 11896
				Client.clickedWidget = var0; // L: 11897
				Client.clickedWidgetParent = class306.method6317(var0); // L: 11898
				Client.widgetClickX = var1; // L: 11899
				Client.widgetClickY = var2; // L: 11900
				class87.widgetDragDuration = 0; // L: 11901
				Client.isDraggingWidget = false; // L: 11902
				int var3 = Client.menuOptionsCount - 1; // L: 11905
				if (var3 != -1) { // L: 11908
					ReflectionCheck.method711(var3);
				}

			}
		}
	} // L: 11909

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-53673761"
	)
	static final void method270(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12196
		StructComposition.clientPreferences.method2427(var0); // L: 12197
	} // L: 12198
}
