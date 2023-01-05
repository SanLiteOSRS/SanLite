import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 227763471
	)
	@Export("id")
	int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 15717685
	)
	@Export("count")
	int count;
	@ObfuscatedName("r")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("u")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	class213 field2525;

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
				this.field2525 = new class213(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2112065673"
	)
	public int method4426() {
		return this.count; // L: 38
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "736109074"
	)
	public class213 method4422() {
		return this.field2525; // L: 42
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "81"
	)
	static final void method4428() {
		Object var10000 = null; // L: 123
		String var0 = "You can't add yourself to your own friend list";
		KitDefinition.addGameMessage(30, "", var0); // L: 125
	} // L: 127
}
