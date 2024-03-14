import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("az")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1776138225
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1179032873
	)
	@Export("health")
	int health;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -354392767
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1503916889
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "67"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "123"
	)
	public static void method2495(AbstractArchive var0) {
		class524.field5137 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZS)Z",
		garbageValue = "-694"
	)
	static boolean method2494(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 219
			int var3 = var2.read(); // L: 220
			var2.seek(0L); // L: 221
			var2.write(var3); // L: 222
			var2.seek(0L); // L: 223
			var2.close(); // L: 224
			if (var1) { // L: 225
				var0.delete();
			}

			return true; // L: 226
		} catch (Exception var4) { // L: 228
			return false; // L: 229
		}
	}
}
