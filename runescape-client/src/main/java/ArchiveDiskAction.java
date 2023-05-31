import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1329235479
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldt;",
		garbageValue = "-678147968"
	)
	static class86[] method6617() {
		return new class86[]{class86.field1074, class86.field1078, class86.field1075, class86.field1080, class86.field1077, class86.field1076}; // L: 17
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "13178"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10446

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10447
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10448
		}

		if (var1.length() > 9) { // L: 10450
			return " " + class383.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class383.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class383.colorStartTag(16776960) + var1 + "</col>"; // L: 10451 10452
		}
	}
}
