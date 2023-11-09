import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -577196497
	)
	@Export("id")
	int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -61318255
	)
	@Export("count")
	int count;
	@ObfuscatedName("k")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("o")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	class201 field2370;

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
				this.field2370 = new class201(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int method4042() {
		return this.count; // L: 38
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lgd;",
		garbageValue = "-93"
	)
	public class201 method4044() {
		return this.field2370; // L: 42
	}
}
