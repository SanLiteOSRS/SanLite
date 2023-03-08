import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("vx")
	static List field2521;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1291388827
	)
	@Export("id")
	int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 339077095
	)
	@Export("count")
	int count;
	@ObfuscatedName("n")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("l")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	class217 field2523;

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

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2523 = new class217(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-210758645"
	)
	public int method4446() {
		return this.count; // L: 38
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "289819628"
	)
	public class217 method4450() {
		return this.field2523; // L: 42
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-1743211471"
	)
	public static void method4454(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1); // L: 26
		int var6 = var0.getFileId(var5, var2); // L: 27
		class148.method3216(var0, var5, var6, var3, var4); // L: 28
	} // L: 29
}
