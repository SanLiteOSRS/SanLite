import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class135 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -8784518186452882157L
	)
	static long field1574;
	@ObfuscatedName("at")
	@Export("cacheDir")
	public static File cacheDir;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;B)I",
		garbageValue = "92"
	)
	static int method3031(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 167
		String[] var3 = Login.field904; // L: 169

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 170
			var5 = var3[var4]; // L: 171
			if (var0.tryLoadFileByNames(var5, "")) { // L: 173
				++var2; // L: 174
			}
		}

		var3 = Login.field920; // L: 180

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 181
			var5 = var3[var4]; // L: 182
			if (var1.tryLoadFileByNames(var5, "")) { // L: 184
				++var2; // L: 185
			}
		}

		var3 = Login.field907; // L: 191

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 192
			var5 = var3[var4]; // L: 193
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 195
				++var2; // L: 196
			}
		}

		return var2; // L: 201
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "146980773"
	)
	static Object method3030(int var0) {
		return class72.method2048((class490)class217.findEnumerated(class490.method8832(), var0)); // L: 5283
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V",
		garbageValue = "-5"
	)
	static final void method3032(Actor var0) {
		boolean var1 = var0.field1196 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4278
		if (!var1) { // L: 4279
			SequenceDefinition var2 = class149.SequenceDefinition_get(var0.sequence); // L: 4280
			if (var2 != null && !var2.isCachedModelIdSet()) { // L: 4281
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame]; // L: 4285
			} else {
				var1 = true; // L: 4282
			}
		}

		if (var1) { // L: 4288
			int var8 = var0.field1196 - var0.spotAnimation; // L: 4289
			int var3 = Client.cycle - var0.spotAnimation; // L: 4290
			int var4 = var0.field1158 * 128 + var0.field1147 * -3932160; // L: 4291
			int var5 = var0.field1193 * 128 + var0.field1147 * -3932160; // L: 4292
			int var6 = var0.field1192 * 128 + var0.field1147 * -3932160; // L: 4293
			int var7 = var0.field1189 * 128 + var0.field1147 * -3932160; // L: 4294
			var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8; // L: 4295
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8; // L: 4296
		}

		var0.field1213 = 0; // L: 4298
		var0.orientation = var0.field1139; // L: 4299
		var0.rotation = var0.orientation; // L: 4300
	} // L: 4301
}
