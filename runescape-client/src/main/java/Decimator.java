import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field403;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 620670661
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1580600363
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -135318399
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("q")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = method1005(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = 6.0D + (double)var4 / (double)var1; // L: 23
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D);
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
				}
			}

		}
	} // L: 37

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1902066376"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2068008362"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 66
		}

		return var1; // L: 67
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-945066766"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1674028137"
	)
	public static int method1005(int var0, int var1) {
		int var2;
		if (var1 > var0) { // L: 24
			var2 = var0; // L: 25
			var0 = var1; // L: 26
			var1 = var2; // L: 27
		}

		while (var1 != 0) {
			var2 = var0 % var1; // L: 30
			var0 = var1; // L: 31
			var1 = var2; // L: 32
		}

		return var0; // L: 34
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-762396085"
	)
	public static void method994(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 28
	} // L: 29

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkn;B)Ljava/lang/String;",
		garbageValue = "-38"
	)
	static String method1006(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10296
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10297
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10299
					if (var3 == -1) { // L: 10300
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10301
					int var6 = GrandExchangeEvents.method5876(var1, var2 - 1); // L: 10303
					String var5;
					if (var6 < 999999999) { // L: 10305
						var5 = Integer.toString(var6); // L: 10306
					} else {
						var5 = "*"; // L: 10309
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10311
				}
			}
		}

		return var0; // L: 10315
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcb;",
		garbageValue = "-2111411796"
	)
	static final InterfaceParent method1001(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11762
		var3.group = var1; // L: 11763
		var3.type = var2; // L: 11764
		Client.interfaceParents.put(var3, (long)var0); // L: 11765
		PacketWriter.Widget_resetModelFrames(var1); // L: 11766
		Widget var4 = HitSplatDefinition.getWidget(var0); // L: 11767
		class125.invalidateWidget(var4); // L: 11768
		if (Client.meslayerContinueWidget != null) { // L: 11769
			class125.invalidateWidget(Client.meslayerContinueWidget); // L: 11770
			Client.meslayerContinueWidget = null; // L: 11771
		}

		class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11773
		class282.runWidgetOnLoadListener(var1); // L: 11774
		if (Client.rootInterface != -1) { // L: 11775
			ModelData0.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11776
	}
}
