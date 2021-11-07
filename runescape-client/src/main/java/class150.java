import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class150 {
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 341290279
	)
	static int field1604;
	@ObfuscatedName("s")
	public short[] field1598;
	@ObfuscatedName("a")
	public short[] field1600;

	class150(int var1) {
		ItemComposition var2 = TaskHandler.ItemDefinition_get(var1);
		if (var2.method3368()) {
			this.field1598 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1598, 0, this.field1598.length);
		}

		if (var2.method3347()) {
			this.field1600 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1600, 0, this.field1600.length);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "-639525716"
	)
	static VerticalAlignment[] method2969() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1744, VerticalAlignment.field1743};
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfy;",
		garbageValue = "5"
	)
	public static VarbitComposition method2965(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1306272035"
	)
	static int method2971(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IB)V",
		garbageValue = "-37"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						ItemComposition.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Tile.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = UserComparator9.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Tile.runScriptEvent(var5);
				}
			}
		}

	}
}
