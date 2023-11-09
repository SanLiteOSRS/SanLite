import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2086767325
	)
	public static int field2553;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1760606919
	)
	@Export("id")
	int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -169016461
	)
	@Export("count")
	int count;
	@ObfuscatedName("an")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("au")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	class227 field2544;

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
				this.field2544 = new class227(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2116326629"
	)
	public int method4609() {
		return this.count; // L: 38
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lie;",
		garbageValue = "579255145"
	)
	public class227 method4608() {
		return this.field2544; // L: 42
	}
}
