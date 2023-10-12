import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -138735309
	)
	public static int field1924;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1988274177
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1806040188"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 30
				return;
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;IS)V",
		garbageValue = "4095"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "445766054"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6; // L: 18
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7; // L: 21

			for (int var8 = var2; var8 < var3; ++var8) { // L: 22
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 23
					String var9 = var0[var8]; // L: 24
					var0[var8] = var0[var5]; // L: 25
					var0[var5] = var9; // L: 26
					short var10 = var1[var8]; // L: 27
					var1[var8] = var1[var5]; // L: 28
					var1[var5++] = var10; // L: 29
				}
			}

			var0[var3] = var0[var5]; // L: 33
			var0[var5] = var6; // L: 34
			var1[var3] = var1[var5]; // L: 35
			var1[var5] = var7; // L: 36
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 37
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 38
		}

	} // L: 40
}
