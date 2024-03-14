import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field464;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field468;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1424369897
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("al")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ai")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)I",
		garbageValue = "-17325591"
	)
	static int method1157(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 191
		int var2;
		if (var1 == 0) { // L: 193
			var2 = 0;
		} else if (var1 == 1) { // L: 194
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 195
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 196
		}

		return var2; // L: 197
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1994910292"
	)
	static void method1158(int var0, int var1, int var2, int var3) {
		class321.field3483 = var0; // L: 185
		class321.field3476 = var1; // L: 186
		class321.field3485 = var2; // L: 187
		class321.field3486 = var3; // L: 188
	} // L: 189

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IZZZZS)Lom;",
		garbageValue = "16056"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2028
		if (JagexCache.JagexCache_dat2File != null) { // L: 2029
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class173.JagexCache_idxFiles[var0], 1000000); // L: 2030
		}

		return new Archive(var5, class155.field1730, class356.field3897, var0, var1, var2, var3, var4, false); // L: 2032
	}
}
