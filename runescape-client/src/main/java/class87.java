import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public enum class87 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field1114(0, -1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field1110(1, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field1120(2, 3),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field1112(3, 4),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field1113(4, 5),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field1118(5, 6);

	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 316580569
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 2101952525
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1055454903
	)
	final int field1115;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2102602089
	)
	final int field1116;

	class87(int var3, int var4) {
		this.field1115 = var3; // L: 21
		this.field1116 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1116; // L: 27
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "62"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lgo;",
		garbageValue = "1583039728"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferWorldComparator.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lqq;",
		garbageValue = "-147527750"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class281.cacheDir, "preferences" + var0 + ".dat"); // L: 164
		if (var3.exists()) { // L: 165
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 167
				return var10; // L: 168
			} catch (IOException var9) { // L: 170
			}
		}

		String var4 = ""; // L: 172
		if (LoginPacket.cacheGamebuild == 33) { // L: 173
			var4 = "_rc";
		} else if (LoginPacket.cacheGamebuild == 34) { // L: 174
			var4 = "_wip";
		}

		File var5 = new File(UserComparator3.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 175
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 176
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 178
				return var6; // L: 179
			} catch (IOException var8) { // L: 181
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 184
			return var6; // L: 185
		} catch (IOException var7) { // L: 187
			throw new RuntimeException(); // L: 188
		}
	}
}
