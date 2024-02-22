import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public enum class130 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1548(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1539(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1540(2, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1541(3, 3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1544(4, 4);

	@ObfuscatedName("ad")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1565111505
	)
	final int field1543;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1722145621
	)
	final int field1542;

	class130(int var3, int var4) {
		this.field1543 = var3; // L: 131
		this.field1542 = var4; // L: 132
	} // L: 133

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1542; // L: 136
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1407301917"
	)
	public static void method3072(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 50
		VarbitComposition var2;
		if (var3 != null) { // L: 51
			var2 = var3; // L: 52
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 55
			var3 = new VarbitComposition(); // L: 56
			if (var4 != null) { // L: 57
				var3.decode(new Buffer(var4));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0); // L: 58
			var2 = var3; // L: 59
		}

		int var8 = var2.baseVar; // L: 62
		int var5 = var2.startBit; // L: 63
		int var6 = var2.endBit; // L: 64
		int var7 = Varps.Varps_masks[var6 - var5]; // L: 65
		if (var1 < 0 || var1 > var7) { // L: 66
			var1 = 0;
		}

		var7 <<= var5; // L: 67
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7; // L: 68
	} // L: 69

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lcj;",
		garbageValue = "213489814"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 238
		return UserComparator5.getNextWorldListWorld(); // L: 239
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-76"
	)
	public static int method3069(CharSequence var0) {
		int var1 = var0.length(); // L: 144
		int var2 = 0; // L: 145

		for (int var3 = 0; var3 < var1; ++var3) { // L: 146
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 147
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIB)Z",
		garbageValue = "55"
	)
	public static boolean method3074(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 190
		if (var3 == null) { // L: 191
			return false;
		} else {
			ServerPacket.SpriteBuffer_decode(var3); // L: 192
			return true; // L: 193
		}
	}
}
