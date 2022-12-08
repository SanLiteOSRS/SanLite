import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1940986101
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2076780085
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6448(var1) || this.archive.method6424(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Ljava/lang/String;",
		garbageValue = "764446077"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var0)) == 0) { // L: 12612
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12613 12614 12616
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "1191186738"
	)
	static void method2222(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 12678
			Client.randomDatData = new byte[24];
		}

		class373.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 12679
	} // L: 12680
}
