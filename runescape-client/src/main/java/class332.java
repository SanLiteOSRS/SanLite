import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class332 implements Comparator {
	class332() {
	} // L: 708

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;B)I",
		garbageValue = "60"
	)
	int method6387(class325 var1, class325 var2) {
		return var1.field3540 - var2.field3540; // L: 711
	}

	public int compare(Object var1, Object var2) {
		return this.method6387((class325)var1, (class325)var2); // L: 715
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 719
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-860570297"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		VarbitComposition var1;
		if (var2 != null) { // L: 29
			var1 = var2; // L: 30
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 33
			var2 = new VarbitComposition(); // L: 34
			if (var3 != null) { // L: 35
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 36
			var1 = var2; // L: 37
		}

		int var7 = var1.baseVar; // L: 40
		int var4 = var1.startBit; // L: 41
		int var5 = var1.endBit; // L: 42
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 43
		return Varps.Varps_main[var7] >> var4 & var6; // L: 44
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lks;",
		garbageValue = "191126928"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 516
		if (var1 != null) { // L: 517
			return var1;
		} else {
			var1 = class160.method3430(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var0, false); // L: 518
			if (var1 != null) { // L: 519
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 520
		}
	}
}
