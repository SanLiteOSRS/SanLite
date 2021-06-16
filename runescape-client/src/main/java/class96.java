import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class96 implements Runnable {
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -107969121
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("f")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("e")
	@Export("lock")
	Object lock;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -123388215
	)
	@Export("index")
	int index;
	@ObfuscatedName("y")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("j")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("o")
	@Export("millis")
	long[] millis;

	class96() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class18.method272(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method2203(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2020302651"
	)
	public static void method2202() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
