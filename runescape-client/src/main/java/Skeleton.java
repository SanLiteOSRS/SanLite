import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1324166715
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1540964352
	)
	static int field2633;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1822758027
	)
	@Export("id")
	int id;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -536717565
	)
	@Export("count")
	int count;
	@ObfuscatedName("aw")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ad")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	class243 field2636;

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
				this.field2636 = new class243(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-619378321"
	)
	public int method4695() {
		return this.count; // L: 38
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "1023110495"
	)
	public class243 method4697() {
		return this.field2636; // L: 42
	}
}
