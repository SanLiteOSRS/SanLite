import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class19 implements Callable {
	@ObfuscatedName("aj")
	static byte[][][] field104;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 2049941555
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final class10 field100;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laa;Laq;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field100 = var2;
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field100.method88()) { // L: 53
				class13.method180(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field100.method89(); // L: 60
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	public static void method280() {
		class36.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-525719060"
	)
	static void method277() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIILiz;[Lij;I)V",
		garbageValue = "-999166250"
	)
	static final void method282(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 279
		int var6 = -1; // L: 280

		while (true) {
			int var7 = var5.method9104(); // L: 282
			if (var7 == 0) { // L: 283
				return; // L: 307
			}

			var6 += var7; // L: 284
			int var8 = 0; // L: 285

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 287
				if (var9 == 0) { // L: 288
					break;
				}

				var8 += var9 - 1; // L: 289
				int var10 = var8 & 63; // L: 290
				int var11 = var8 >> 6 & 63; // L: 291
				int var12 = var8 >> 12; // L: 292
				int var13 = var5.readUnsignedByte(); // L: 293
				int var14 = var13 >> 2; // L: 294
				int var15 = var13 & 3; // L: 295
				int var16 = var11 + var1; // L: 296
				int var17 = var10 + var2; // L: 297
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 298
					int var18 = var12; // L: 299
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 300
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 301
					if (var18 >= 0) { // L: 302
						var19 = var4[var18];
					}

					PendingSpawn.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 303
				}
			}
		}
	}
}
