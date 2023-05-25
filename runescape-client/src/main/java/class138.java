import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class138 extends class139 {
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = -1514927571
	)
	static int field1637;
	@ObfuscatedName("aq")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -469795657
	)
	int field1640;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class138(class142 var1) {
		this.this$0 = var1;
		this.field1640 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1640 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3307(this.field1640); // L: 123
	} // L: 124

	@ObfuscatedName("af")
	static double method3201(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1407581500"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(class513.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "1"
	)
	public static void method3212(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 43
			int var4 = (var3 + var2) / 2; // L: 44
			int var5 = var2; // L: 45
			String var6 = var0[var4]; // L: 46
			var0[var4] = var0[var3]; // L: 47
			var0[var3] = var6; // L: 48
			int var7 = var1[var4]; // L: 49
			var1[var4] = var1[var3]; // L: 50
			var1[var3] = var7; // L: 51

			for (int var8 = var2; var8 < var3; ++var8) { // L: 52
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 53
					String var9 = var0[var8]; // L: 54
					var0[var8] = var0[var5]; // L: 55
					var0[var5] = var9; // L: 56
					int var10 = var1[var8]; // L: 57
					var1[var8] = var1[var5]; // L: 58
					var1[var5++] = var10; // L: 59
				}
			}

			var0[var3] = var0[var5]; // L: 63
			var0[var5] = var6; // L: 64
			var1[var3] = var1[var5]; // L: 65
			var1[var5] = var7; // L: 66
			method3212(var0, var1, var2, var5 - 1); // L: 67
			method3212(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	static void method3210() {
		Login.worldSelectOpen = false; // L: 2211
		class123.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2212
		ParamComposition.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2213
		Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18); // L: 2214
	} // L: 2215

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "468091997"
	)
	static void method3208(int var0) {
		if (var0 != Client.gameState) { // L: 1249
			if (Client.gameState == 30) { // L: 1250
				Client.field722.method4181(); // L: 1251
			}

			if (Client.gameState == 0) { // L: 1253
				ScriptFrame.client.method644();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1254
				class284.method5687(0); // L: 1255
				Client.field523 = 0; // L: 1256
				Client.field524 = 0; // L: 1257
				Client.timer.method7603(var0); // L: 1258
				if (var0 != 20) { // L: 1259
					class14.method180(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class333.field3824 != null) { // L: 1261 1262
				class333.field3824.close(); // L: 1263
				class333.field3824 = null; // L: 1264
			}

			if (Client.gameState == 25) { // L: 1267
				Client.field621 = 0; // L: 1268
				Client.field559 = 0; // L: 1269
				Client.field725 = 1; // L: 1270
				Client.field557 = 0; // L: 1271
				Client.field558 = 1; // L: 1272
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1274
				if (var0 == 20) { // L: 1278
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1279
					class25.method366(NetFileRequest.archive10, class452.archive8, false, var1); // L: 1280
				} else if (var0 == 11) { // L: 1282
					class25.method366(NetFileRequest.archive10, class452.archive8, false, 4); // L: 1283
				} else if (var0 == 50) { // L: 1285
					class205.setLoginResponseString("", "Updating date of birth...", ""); // L: 1286
					class25.method366(NetFileRequest.archive10, class452.archive8, false, 7); // L: 1287
				} else {
					Player.method2356(); // L: 1289
				}
			} else {
				var1 = class134.method3178() ? 0 : 12; // L: 1275
				class25.method366(NetFileRequest.archive10, class452.archive8, true, var1); // L: 1276
			}

			Client.gameState = var0; // L: 1290
		}
	} // L: 1291

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lcb;IIB)V",
		garbageValue = "46"
	)
	static final void method3205(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 8763
			class17.method249(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.field875, var0.field880, var0.field882, var1, var2); // L: 8764
		}

	} // L: 8766

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIS)V",
		garbageValue = "2663"
	)
	static final void method3204(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		SceneTilePaint.method4912(var0, var1, var2, var3, var4, var5, var6, false); // L: 9647
	} // L: 9648
}
