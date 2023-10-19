import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	static PlatformInfo field2583;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1064870909
	)
	@Export("id")
	int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -553331405
	)
	@Export("count")
	int count;
	@ObfuscatedName("ab")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("am")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	class241 field2581;

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
				this.field2581 = new class241(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1245812999"
	)
	public int method4654() {
		return this.count; // L: 38
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "-13"
	)
	public class241 method4657() {
		return this.field2581; // L: 42
	}
}
