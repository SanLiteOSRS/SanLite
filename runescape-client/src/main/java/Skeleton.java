import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ha")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -946798709
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1178553901
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1443695477
	)
	@Export("count")
	int count;
	@ObfuscatedName("s")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("a")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}
}
