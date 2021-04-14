import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("f")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("o")
	@Export("lock")
	Object lock;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1900578569
	)
	@Export("index")
	int index;
	@ObfuscatedName("p")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("b")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("e")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; GrandExchangeEvent.method4625(50L)) {
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "([BIIII[Lel;I)V",
		garbageValue = "90989095"
	)
	static final void method2108(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					WorldMapData_1.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0);
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1618150631"
	)
	public static int method2107() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("js")
	static final void method2109(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		Clock.method2610();
		Login.clientPreferences.field1304 = var0;
		Message.savePreferences();
	}
}
