import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
class class135 implements Callable {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 87944983
	)
	static int field1618;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class140 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfi;"
	)
	final class131[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfc;II[Lfi;)V"
	)
	class135(class140 var1, int var2, int var3, class131[] var4) {
		this.this$0 = var1; // L: 145
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) { // L: 148
			this.val$curveLoadJobs[var1].call(); // L: 149
		}

		return null; // L: 151
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-739194429"
	)
	public static long method3138(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}
}
