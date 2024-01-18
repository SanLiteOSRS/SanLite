import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
class class326 implements Callable {
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmk;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class326(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1; // L: 118
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3496; // L: 121

		while (true) {
			class323 var2 = null; // L: 123
			synchronized(var1) { // L: 124
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 125
					return null; // L: 126
				}

				var2 = (class323)var1.remove(); // L: 128
			}

			var2.field3518.method1098(); // L: 130
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1965469996"
	)
	static void method6257() {
		ByteArrayPool.field4627.clear(); // L: 68
		ByteArrayPool.field4627.add(100); // L: 69
		ByteArrayPool.field4627.add(5000); // L: 70
		ByteArrayPool.field4627.add(10000); // L: 71
		ByteArrayPool.field4627.add(30000); // L: 72
	} // L: 73

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "-201240370"
	)
	static final void method6261(Widget var0) {
		int var1 = var0.contentType; // L: 12218
		if (var1 == 324) { // L: 12219
			if (Client.field736 == -1) { // L: 12220
				Client.field736 = var0.spriteId2; // L: 12221
				Client.field787 = var0.spriteId; // L: 12222
			}

			if (Client.playerAppearance.field3640 == 1) { // L: 12224
				var0.spriteId2 = Client.field736;
			} else {
				var0.spriteId2 = Client.field787; // L: 12225
			}

		} else if (var1 == 325) { // L: 12228
			if (Client.field736 == -1) { // L: 12229
				Client.field736 = var0.spriteId2; // L: 12230
				Client.field787 = var0.spriteId; // L: 12231
			}

			if (Client.playerAppearance.field3640 == 1) { // L: 12233
				var0.spriteId2 = Client.field787;
			} else {
				var0.spriteId2 = Client.field736; // L: 12234
			}

		} else if (var1 == 327) { // L: 12237
			var0.modelAngleX = 150; // L: 12238
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12239
			var0.modelType = 5; // L: 12240
			var0.modelId = 0; // L: 12241
		} else if (var1 == 328) { // L: 12244
			var0.modelAngleX = 150; // L: 12245
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12246
			var0.modelType = 5; // L: 12247
			var0.modelId = 1; // L: 12248
		}
	} // L: 12226 12235 12242 12249 12251
}
