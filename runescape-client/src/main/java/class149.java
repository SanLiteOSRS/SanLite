import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class149 extends class159 {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1653636313
	)
	int field1668;
	@ObfuscatedName("ap")
	byte field1667;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1690478239
	)
	int field1670;
	@ObfuscatedName("aj")
	String field1669;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class149(class160 var1) {
		this.this$0 = var1;
		this.field1668 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		this.field1668 = var1.readUnsignedShort(); // L: 111
		this.field1667 = var1.readByte(); // L: 112
		this.field1670 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1669 = var1.readStringCp1252NullTerminated(); // L: 115
	} // L: 116

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1668); // L: 119
		var2.rank = this.field1667; // L: 120
		var2.world = this.field1670; // L: 121
		var2.username = new Username(this.field1669); // L: 122
	} // L: 123

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "207974810"
	)
	static int method3293(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1801922304"
	)
	public static void method3292() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "933459195"
	)
	static final void method3291(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 9118
			if (Client.showMouseOverText) { // L: 9119
				int var2 = Client.menuOptionsCount - 1; // L: 9122
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 9126
					var4 = "Use" + " " + Client.field664 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 9127
					var4 = Client.field668 + " " + Client.field669 + " " + "->";
				} else {
					String var5;
					if (var2 < 0) { // L: 9131
						var5 = ""; // L: 9132
					} else if (Client.menuTargets[var2].length() > 0) { // L: 9135
						var5 = Client.menuActions[var2] + " " + Client.menuTargets[var2];
					} else {
						var5 = Client.menuActions[var2]; // L: 9136
					}

					var4 = var5; // L: 9138
				}

				if (Client.menuOptionsCount > 2) { // L: 9140
					var4 = var4 + class208.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class90.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 9141
			}
		}
	} // L: 9142
}
