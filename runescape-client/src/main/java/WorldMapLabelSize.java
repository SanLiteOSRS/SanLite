import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static Archive field2868;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 868350029
	)
	final int field2861;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 513003821
	)
	final int field2858;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2106192169
	)
	final int field2863;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2861 = var1; // L: 15
		this.field2858 = var2; // L: 16
		this.field2863 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "0"
	)
	boolean method5046(float var1) {
		return var1 >= (float)this.field2863; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "1545697832"
	)
	static WorldMapLabelSize method5047(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2858) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "7"
	)
	static final void method5053(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 443
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 444
			Player var3 = Client.players[var2]; // L: 445
			int var4 = var0.readUnsignedByte(); // L: 446
			if ((var4 & 8) != 0) { // L: 447
				var4 += var0.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) {
				var4 += var0.readUnsignedByte() << 16; // L: 448
			}

			ClientPreferences.method2501(var0, var2, var3, var4); // L: 449
		}

	} // L: 451

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lnd;",
		garbageValue = "2134354855"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1854
		if (JagexCache.JagexCache_dat2File != null) { // L: 1855
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class370.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, WorldMapID.masterDisk, var0, var1, var2, var3, var4); // L: 1856
	}
}
