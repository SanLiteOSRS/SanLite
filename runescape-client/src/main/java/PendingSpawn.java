import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1966483205
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 827005237
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 602578105
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -890591527
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -852502005
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1719605699
	)
	int field1148;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 933994981
	)
	int field1149;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1534871701
	)
	int field1150;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 518048967
	)
	int field1151;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -354364767
	)
	int field1152;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -854755163
	)
	int field1153;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1645697629
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2085294823
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1153 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "178165513"
	)
	void method2414(int var1) {
		this.field1153 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-211927889"
	)
	boolean method2415(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 28
			return (this.field1153 & 1 << var1) != 0; // L: 29
		} else {
			return true; // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;B)V",
		garbageValue = "1"
	)
	public static void method2421(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIB)V",
		garbageValue = "-1"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4608
			int var3 = class85.SequenceDefinition_get(var1).field2308; // L: 4609
			if (var3 == 1) { // L: 4610
				var0.sequenceFrame = 0; // L: 4611
				var0.sequenceFrameCycle = 0; // L: 4612
				var0.sequenceDelay = var2; // L: 4613
				var0.field1205 = 0; // L: 4614
			}

			if (var3 == 2) { // L: 4616
				var0.field1205 = 0; // L: 4617
			}
		} else if (var1 == -1 || var0.sequence == -1 || class85.SequenceDefinition_get(var1).field2292 >= class85.SequenceDefinition_get(var0.sequence).field2292) { // L: 4620
			var0.sequence = var1; // L: 4621
			var0.sequenceFrame = 0; // L: 4622
			var0.sequenceFrameCycle = 0; // L: 4623
			var0.sequenceDelay = var2; // L: 4624
			var0.field1205 = 0; // L: 4625
			var0.field1230 = var0.pathLength; // L: 4626
		}

	} // L: 4628
}
