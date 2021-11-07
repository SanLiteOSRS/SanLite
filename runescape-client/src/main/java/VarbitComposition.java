import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("g")
	static final int[] field1780;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -71897969
	)
	static int field1775;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 207149791
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 348615607
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1999695007
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1780 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1780[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;S)V",
		garbageValue = "3911"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1096806966"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljb;",
		garbageValue = "51"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3652, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3650, PlayerType.PlayerType_ironman, PlayerType.PlayerType_ultimateIronman, PlayerType.field3649};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnf;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1356427947"
	)
	static String method3205(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}
}
