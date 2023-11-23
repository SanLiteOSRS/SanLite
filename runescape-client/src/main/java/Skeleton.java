import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 334360487
	)
	@Export("id")
	int id;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 521667617
	)
	@Export("count")
	int count;
	@ObfuscatedName("ac")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("al")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	class267 field2795;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2795 = new class267(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1055269733"
	)
	public int method5316() {
		return this.count; // L: 38
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-155827584"
	)
	public class267 method5317() {
		return this.field2795; // L: 42
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Loh;",
		garbageValue = "-1589546581"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1981
		if (JagexCache.JagexCache_dat2File != null) { // L: 1982
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class25.JagexCache_idxFiles[var0], 1000000); // L: 1983
		}

		return new Archive(var5, class302.field3118, WorldMapSectionType.field2556, var0, var1, var2, var3, var4, false); // L: 1985
	}
}
