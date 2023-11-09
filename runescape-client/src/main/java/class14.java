import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class14 {
	@ObfuscatedName("y")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 972522393
	)
	final int field85;
	@ObfuscatedName("q")
	final String field75;
	@ObfuscatedName("f")
	final ThreadFactory field86;
	@ObfuscatedName("u")
	final ThreadPoolExecutor field77;

	public class14(String var1, int var2, int var3) {
		this.field75 = var1; // L: 15
		this.field85 = var2; // L: 16
		this.field86 = new class16(this); // L: 17
		this.field77 = this.method176(var3); // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-1584530923"
	)
	final ThreadPoolExecutor method176(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field85), this.field86); // L: 22
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ld;I)Lv;",
		garbageValue = "31921380"
	)
	public class19 method177(class10 var1) {
		if (this.field77.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field77.getCorePoolSize() + " Queue capacity " + this.field85); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field77.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public final void method184() {
		try {
			this.field77.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lgc;",
		garbageValue = "-1388203318"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 48
		if (var1 != null) { // L: 49
			return var1; // L: 50
		} else {
			byte[] var2 = class343.SequenceDefinition_archive.takeFile(12, var0); // L: 52
			var1 = new SequenceDefinition(); // L: 53
			if (var2 != null) { // L: 54
				var1.decode(new Buffer(var2)); // L: 55
			}

			var1.postDecode(); // L: 57
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 58
			return var1; // L: 59
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BI)Lmx;",
		garbageValue = "-405910924"
	)
	public static Font method182(byte[] var0) {
		if (var0 == null) { // L: 185
			return null;
		} else {
			Font var1 = new Font(var0, class267.SpriteBuffer_xOffsets, class457.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, Decimator.SpriteBuffer_spriteHeights, GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette, class436.SpriteBuffer_pixels); // L: 186
			class267.SpriteBuffer_xOffsets = null; // L: 188
			class457.SpriteBuffer_yOffsets = null; // L: 189
			class457.SpriteBuffer_spriteWidths = null; // L: 190
			Decimator.SpriteBuffer_spriteHeights = null; // L: 191
			GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null; // L: 192
			class436.SpriteBuffer_pixels = null; // L: 193
			return var1; // L: 195
		}
	}
}
