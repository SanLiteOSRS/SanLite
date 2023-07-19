import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public abstract class class182 {
	@ObfuscatedName("aw")
	String field1898;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class171 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;Ljava/lang/String;)V"
	)
	class182(class171 var1, String var2) {
		this.this$0 = var1; // L: 353
		this.field1898 = var2; // L: 354
	} // L: 355

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-403708913"
	)
	public abstract int vmethod3636();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-660184921"
	)
	public String vmethod3634() {
		return null; // L: 364
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	public int vmethod3633() {
		return -1; // L: 368
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method3640() {
		return this.field1898; // L: 358
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "363093804"
	)
	static String method3637() {
		return ScriptFrame.clientPreferences.method2505() ? StudioGame.method6664(Login.Login_username) : Login.Login_username; // L: 326
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-216621224"
	)
	public static int method3645(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 108
		return (var0 + var2) / var1 - var2; // L: 109
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIILiw;[Lig;B)V",
		garbageValue = "-33"
	)
	static final void method3646(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 237
		int var6 = -1; // L: 238

		while (true) {
			int var7 = var5.method9075(); // L: 240
			if (var7 == 0) { // L: 241
				return; // L: 265
			}

			var6 += var7; // L: 242
			int var8 = 0; // L: 243

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 245
				if (var9 == 0) { // L: 246
					break;
				}

				var8 += var9 - 1; // L: 247
				int var10 = var8 & 63; // L: 248
				int var11 = var8 >> 6 & 63; // L: 249
				int var12 = var8 >> 12; // L: 250
				int var13 = var5.readUnsignedByte(); // L: 251
				int var14 = var13 >> 2; // L: 252
				int var15 = var13 & 3; // L: 253
				int var16 = var11 + var1; // L: 254
				int var17 = var10 + var2; // L: 255
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 256
					int var18 = var12; // L: 257
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 258
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 259
					if (var18 >= 0) { // L: 260
						var19 = var4[var18];
					}

					class383.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 261
				}
			}
		}
	}
}
