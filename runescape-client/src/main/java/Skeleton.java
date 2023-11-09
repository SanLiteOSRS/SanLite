import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1427390003
	)
	@Export("id")
	int id;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1158767581
	)
	@Export("count")
	int count;
	@ObfuscatedName("al")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("at")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class219 field2541;

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
				this.field2541 = new class219(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "612928159"
	)
	public int method4516() {
		return this.count; // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "485057822"
	)
	public class219 method4517() {
		return this.field2541; // L: 42
	}
}
