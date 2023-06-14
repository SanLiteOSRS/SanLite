import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class53 extends Node {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 1645246149
	)
	static int field368;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	class47 field371;

	public class53() {
		this.field371 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lca;)V"
	)
	class53(VorbisSample var1) {
		this.field371 = new class47(var1, (RawSound)null); // L: 13
	} // L: 14

	@ObfuscatedSignature(
		descriptor = "(Lbp;)V"
	)
	public class53(RawSound var1) {
		this.field371 = new class47((VorbisSample)null, var1); // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "378003017"
	)
	public boolean method1041() {
		return this.field371 == null; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lbp;",
		garbageValue = "-497930795"
	)
	public RawSound method1039() {
		if (this.field371 != null && this.field371.field331.tryLock()) { // L: 25
			RawSound var1 = this.method1040(); // L: 26
			this.field371.field331.unlock(); // L: 27
			return var1; // L: 28
		} else {
			return null; // L: 30
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lbp;",
		garbageValue = "0"
	)
	public RawSound method1038() {
		if (this.field371 != null) { // L: 34
			this.field371.field331.lock(); // L: 35
			RawSound var1 = this.method1040(); // L: 36
			this.field371.field331.unlock();
			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lbp;",
		garbageValue = "1167825683"
	)
	RawSound method1040() {
		if (this.field371.field332 == null) {
			this.field371.field332 = this.field371.field333.toRawSound((int[])null); // L: 45
			this.field371.field333 = null; // L: 46
		}

		return this.field371.field332; // L: 48
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "1589321614"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltb;",
		garbageValue = "94"
	)
	static class494 method1052(int var0) {
		class494 var1 = (class494)Client.Widget_cachedModels.get((long)var0); // L: 12788
		if (var1 == null) { // L: 12789
			var1 = new class494(Messages.field1377, class152.method3196(var0), class481.method8660(var0)); // L: 12790
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12791
		}

		return var1; // L: 12793
	}
}
