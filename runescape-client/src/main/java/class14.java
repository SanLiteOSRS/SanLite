import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class14 {
	@ObfuscatedName("bj")
	protected static String field67;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1975336687
	)
	final int field65;
	@ObfuscatedName("ah")
	final String field63;
	@ObfuscatedName("ar")
	final ThreadFactory field62;
	@ObfuscatedName("ao")
	final ThreadPoolExecutor field60;

	public class14(String var1, int var2, int var3) {
		this.field63 = var1; // L: 15
		this.field65 = var2; // L: 16
		this.field62 = new class16(this); // L: 17
		this.field60 = this.method184(var3); // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1434703627"
	)
	final ThreadPoolExecutor method184(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field65), this.field62);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lap;I)Laq;",
		garbageValue = "1326084774"
	)
	public class18 method181(class10 var1) {
		if (this.field60.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field60.getCorePoolSize() + " Queue capacity " + this.field65);
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field60.submit(new class19(this, var1))); // L: 30
			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107542128"
	)
	public final void method179() {
		try {
			this.field60.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ltt;I)Ljava/lang/String;",
		garbageValue = "-576035634"
	)
	public static String method180(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 20
			return null;
		} else {
			int var2 = 0; // L: 21

			int var3;
			for (var3 = var0.length(); var2 < var3 && class489.method8666(var0.charAt(var2)); ++var2) { // L: 22 23
			}

			while (var3 > var2 && class489.method8666(var0.charAt(var3 - 1))) { // L: 24
				--var3;
			}

			int var4 = var3 - var2; // L: 25
			if (var4 >= 1) { // L: 27
				byte var6;
				if (var1 == null) { // L: 31
					var6 = 12; // L: 32
				} else {
					switch(var1.field5022) {
					case 1:
						var6 = 20; // L: 37
						break; // L: 38
					default:
						var6 = 12; // L: 40
					}
				}

				if (var4 <= var6) { // L: 44
					StringBuilder var12 = new StringBuilder(var4); // L: 48

					for (int var14 = var2; var14 < var3; ++var14) { // L: 49
						char var7 = var0.charAt(var14); // L: 50
						boolean var8;
						if (Character.isISOControl(var7)) { // L: 53
							var8 = false; // L: 54
						} else if (class25.isAlphaNumeric(var7)) { // L: 57
							var8 = true; // L: 58
						} else {
							char[] var9 = class505.field5030; // L: 62
							int var10 = 0;

							label86:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class505.field5031; // L: 72

									for (var10 = 0; var10 < var9.length; ++var10) { // L: 73
										var11 = var9[var10]; // L: 74
										if (var11 == var7) { // L: 75
											var8 = true; // L: 76
											break label86; // L: 77
										}
									}

									var8 = false; // L: 81
									break;
								}

								var11 = var9[var10]; // L: 64
								if (var11 == var7) { // L: 65
									var8 = true; // L: 66
									break; // L: 67
								}

								++var10; // L: 63
							}
						}

						if (var8) { // L: 83
							char var13 = FriendsChatManager.method8113(var7); // L: 84
							if (var13 != 0) { // L: 85
								var12.append(var13); // L: 86
							}
						}
					}

					if (var12.length() == 0) { // L: 88
						return null;
					}

					return var12.toString(); // L: 89
				}
			}

			return null; // L: 46
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lco;",
		garbageValue = "69"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	static void method189() {
		if (class384.clearLoginScreen) { // L: 291
			Login.titleboxSprite = null; // L: 292
			Login.field897 = null; // L: 293
			class134.field1580 = null; // L: 294
			class250.leftTitleSprite = null; // L: 295
			Login.rightTitleSprite = null; // L: 296
			Login.logoSprite = null; // L: 297
			Login.title_muteSprite = null; // L: 298
			class310.field3386 = null; // L: 299
			FriendsList.field4665 = null; // L: 300
			class108.worldSelectBackSprites = null; // L: 301
			class130.worldSelectFlagSprites = null; // L: 302
			class148.worldSelectArrows = null; // L: 303
			class228.worldSelectStars = null; // L: 304
			class416.field4547 = null; // L: 305
			EnumComposition.loginScreenRunesAnimation.method2506(); // L: 306
			WorldMapManager.method4769(0, 100); // L: 307
			class157.method3396().method7045(true); // L: 308
			class384.clearLoginScreen = false; // L: 309
		}
	} // L: 310

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luj;IIIIIII)V",
		garbageValue = "834175330"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class134.method3146(var1, var2, var3)) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedShort(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) { // L: 174
						Tiles.Tiles_heights[0][var2][var3] = -DevicePcmPlayerProvider.method315(var4 + 932731, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 175
					}
					break;
				}

				if (var7 == 1) { // L: 178
					int var8 = var0.readUnsignedByte(); // L: 179
					if (var8 == 1) { // L: 180
						var8 = 0;
					}

					if (var1 == 0) { // L: 181
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 182
					}
					break;
				}

				if (var7 <= 49) { // L: 185
					Interpreter.field833[var1][var2][var3] = (short)var0.readShort(); // L: 186
					ViewportMouse.field3018[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					class369.field4297[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					class74.field891[var1][var2][var3] = (short)(var7 - 81); // L: 195
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort(); // L: 200
				if (var7 == 0) { // L: 201
					break;
				}

				if (var7 == 1) { // L: 202
					var0.readUnsignedByte(); // L: 203
					break; // L: 204
				}

				if (var7 <= 49) { // L: 206
					var0.readShort(); // L: 207
				}
			}
		}

	} // L: 211
}
