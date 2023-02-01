import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("q")
	static final int[] field2112;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1633221379
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -270804781
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1549035405
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2112 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2112[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "2093010759"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) {
				return; // L: 35
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "1158300194"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			this.baseVar = var1.readUnsignedShort(); // L: 39
			this.startBit = var1.readUnsignedByte(); // L: 40
			this.endBit = var1.readUnsignedByte(); // L: 41
		}

	} // L: 44

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbm;",
		garbageValue = "-42"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class71.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = FriendSystem.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "235490030"
	)
	public static String method3779(String var0) {
		int var1 = var0.length(); // L: 183
		char[] var2 = new char[var1]; // L: 184
		byte var3 = 2; // L: 185

		for (int var4 = 0; var4 < var1; ++var4) { // L: 186
			char var5 = var0.charAt(var4); // L: 187
			if (var3 == 0) { // L: 188
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 189
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 192
					var6 = Character.toTitleCase(var5); // L: 196
				} else {
					var6 = var5; // L: 193
				}

				var5 = var6; // L: 198
			}

			if (Character.isLetter(var5)) { // L: 200
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 201
				if (Character.isSpaceChar(var5)) { // L: 202
					if (var3 != 2) { // L: 203
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 205
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 206
		}

		return new String(var2); // L: 208
	}
}
