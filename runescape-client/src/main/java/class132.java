import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
class class132 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	final class137 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lez;"
	)
	final class128[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfx;II[Lez;)V"
	)
	class132(class137 var1, int var2, int var3, class128[] var4) {
		this.this$0 = var1; // L: 141
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) { // L: 144
			this.val$curveLoadJobs[var1].call(); // L: 145
		}

		return null; // L: 147
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lqa;",
		garbageValue = "1741154650"
	)
	public static class437 method3023() {
		synchronized(class437.field4689) { // L: 26
			if (class437.field4683 == 0) { // L: 27
				return new class437();
			} else {
				class437.field4689[--class437.field4683].method8115(); // L: 29
				return class437.field4689[class437.field4683]; // L: 30
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhu;",
		garbageValue = "9355"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "118"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 231
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 232
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 233
		}
	}
}
