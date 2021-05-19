import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class0 extends class14 {
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 629327497
	)
	static int field5;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1994958491
	)
	int field4;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 872492133547765079L
	)
	long field3;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field4 = var1.readInt();
		this.field3 = var1.readLong();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method128(this.field4, this.field3);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "875989902"
	)
	static int method6(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	static final void method0(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = AttackOption.method2285();
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					String var4;
					if (var2 < 0) {
						var4 = "";
					} else if (Client.menuTargets[var2].length() > 0) {
						var4 = Client.menuActions[var2] + " " + Client.menuTargets[var2];
					} else {
						var4 = Client.menuActions[var2];
					}

					var3 = var4;
				}

				if (Client.menuOptionsCount > 2) {
					var3 = var3 + HorizontalAlignment.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				WorldMapArea.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}
