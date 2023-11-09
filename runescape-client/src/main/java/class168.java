import java.util.Collections;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class168 extends class180 {
	@ObfuscatedName("at")
	String field1792;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class169 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class168(class169 var1, String var2, String var3) {
		super(var1, var2); // L: 412
		this.this$0 = var1; // L: 411
		this.field1792 = var3; // L: 413
	} // L: 414

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1756234342"
	)
	public int vmethod3531() {
		return 1; // L: 417
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1324098336"
	)
	public String vmethod3532() {
		return this.field1792; // L: 422
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "-32"
	)
	public static void method3400(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 49
			class152.ByteArrayPool_alternativeSizes = var0; // L: 62
			PendingSpawn.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 63
			JagexCache.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 64

			for (int var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 65
				JagexCache.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 66
				ByteArrayPool.field4491.add(var0[var2]); // L: 67
			}

			Collections.sort(ByteArrayPool.field4491); // L: 69
		} else {
			class152.ByteArrayPool_alternativeSizes = null; // L: 50
			PendingSpawn.ByteArrayPool_altSizeArrayCounts = null; // L: 51
			JagexCache.ByteArrayPool_arrays = null; // L: 52
			ByteArrayPool.field4491.clear(); // L: 54
			ByteArrayPool.field4491.add(100); // L: 55
			ByteArrayPool.field4491.add(5000); // L: 56
			ByteArrayPool.field4491.add(10000); // L: 57
			ByteArrayPool.field4491.add(30000); // L: 58
		}
	} // L: 60 70

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1167974267"
	)
	public static void method3398() {
		StructComposition.StructDefinition_cached.clear(); // L: 71
	} // L: 72
}
