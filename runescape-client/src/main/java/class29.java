import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class29 implements Callable {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	final Buffer field228;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class31 field231;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class35 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lam;Lnk;Lat;)V"
	)
	class29(class35 var1, Buffer var2, class31 var3) {
		this.this$0 = var1;
		this.field228 = var2;
		this.field231 = var3;
	}

	public Object call() {
		return this.field231.vmethod358(this.field228);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	public static void method354() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfa;I)V",
		garbageValue = "1513429119"
	)
	static final void method355(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var3 + var10] &= -16777217;
				}
			}
		}

		Buffer var20 = new Buffer(var0);

		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						int var17 = var11 & 7;
						int var18 = var12 & 7;
						int var19 = var7 & 3;
						int var16;
						if (var19 == 0) {
							var16 = var17;
						} else if (var19 == 1) {
							var16 = var18;
						} else if (var19 == 2) {
							var16 = 7 - var17;
						} else {
							var16 = 7 - var18;
						}

						AbstractWorldMapData.loadTerrain(var20, var1, var2 + var16, var3 + ReflectionCheck.method1159(var11 & 7, var12 & 7, var7), 0, 0, var7);
					} else {
						AbstractWorldMapData.loadTerrain(var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}
}
