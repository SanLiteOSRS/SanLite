import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class30 {
	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lsw;B)Ljava/lang/String;",
		garbageValue = "-85"
	)
	public static String method468(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 32
			return null;
		} else {
			int var2 = 0; // L: 33

			int var3;
			for (var3 = var0.length(); var2 < var3 && MouseRecorder.method2266(var0.charAt(var2)); ++var2) { // L: 34 35
			}

			while (var3 > var2 && MouseRecorder.method2266(var0.charAt(var3 - 1))) { // L: 36
				--var3;
			}

			int var4 = var3 - var2; // L: 37
			if (var4 >= 1 && var4 <= class283.method5686(var1)) { // L: 38
				StringBuilder var5 = new StringBuilder(var4); // L: 39

				for (int var6 = var2; var6 < var3; ++var6) { // L: 40
					char var7 = var0.charAt(var6); // L: 41
					boolean var8;
					if (Character.isISOControl(var7)) { // L: 44
						var8 = false; // L: 45
					} else if (MenuAction.isAlphaNumeric(var7)) { // L: 48
						var8 = true; // L: 49
					} else {
						char[] var9 = class469.field4917; // L: 53
						int var10 = 0;

						label90:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class469.field4919; // L: 63

								for (var10 = 0; var10 < var9.length; ++var10) {
									var11 = var9[var10]; // L: 65
									if (var11 == var7) { // L: 66
										var8 = true; // L: 67
										break label90; // L: 68
									}
								}

								var8 = false; // L: 72
								break;
							}

							var11 = var9[var10]; // L: 55
							if (var11 == var7) { // L: 56
								var8 = true; // L: 57
								break; // L: 58
							}

							++var10; // L: 54
						}
					}

					if (var8) { // L: 74
						char var12;
						switch(var7) { // L: 77
						case ' ':
						case '-':
						case '_':
						case ' ':
							var12 = '_'; // L: 147
							break; // L: 148
						case '#':
						case '[':
						case ']':
							var12 = var7; // L: 135
							break; // L: 136
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var12 = 'a'; // L: 96
							break; // L: 97
						case 'Ç':
						case 'ç':
							var12 = 'c'; // L: 130
							break; // L: 131
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var12 = 'e'; // L: 110
							break; // L: 111
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var12 = 'i'; // L: 84
							break;
						case 'Ñ':
						case 'ñ':
							var12 = 'n'; // L: 100
							break; // L: 101
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var12 = 'o'; // L: 126
							break; // L: 127
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var12 = 'u'; // L: 157
							break;
						case 'ß':
							var12 = 'b'; // L: 138
							break; // L: 139
						case 'ÿ':
						case 'Ÿ':
							var12 = 'y'; // L: 114
							break; // L: 115
						default:
							var12 = Character.toLowerCase(var7); // L: 141
						}

						if (var12 != 0) { // L: 162
							var5.append(var12); // L: 163
						}
					}
				}

				if (var5.length() == 0) { // L: 165
					return null;
				} else {
					return var5.toString(); // L: 166
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "2061308557"
	)
	public static long method465(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 64
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)V",
		garbageValue = "900654741"
	)
	static final void method467(PacketBuffer var0) {
		var0.importIndex(); // L: 8449
		int var1 = var0.readBits(8); // L: 8450
		int var2;
		if (var1 < Client.npcCount) { // L: 8451
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8452
				Client.field617[++Client.field616 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8454
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8455

			for (var2 = 0; var2 < var1; ++var2) { // L: 8456
				int var3 = Client.npcIndices[var2]; // L: 8457
				NPC var4 = Client.npcs[var3]; // L: 8458
				int var5 = var0.readBits(1); // L: 8459
				if (var5 == 0) { // L: 8460
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8461
					var4.npcCycle = Client.cycle; // L: 8462
				} else {
					int var6 = var0.readBits(2); // L: 8465
					if (var6 == 0) { // L: 8466
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8467
						var4.npcCycle = Client.cycle; // L: 8468
						Client.field549[++Client.field548 - 1] = var3; // L: 8469
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8472
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8473
							var4.npcCycle = Client.cycle; // L: 8474
							var7 = var0.readBits(3); // L: 8475
							var4.method2562(var7, class210.field2389); // L: 8476
							var8 = var0.readBits(1); // L: 8477
							if (var8 == 1) { // L: 8478
								Client.field549[++Client.field548 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8481
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8482
							var4.npcCycle = Client.cycle; // L: 8483
							if (var0.readBits(1) == 1) { // L: 8484
								var7 = var0.readBits(3); // L: 8485
								var4.method2562(var7, class210.field2387); // L: 8486
								var8 = var0.readBits(3); // L: 8487
								var4.method2562(var8, class210.field2387); // L: 8488
							} else {
								var7 = var0.readBits(3); // L: 8491
								var4.method2562(var7, class210.field2388); // L: 8492
							}

							var7 = var0.readBits(1); // L: 8494
							if (var7 == 1) { // L: 8495
								Client.field549[++Client.field548 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8498
							Client.field617[++Client.field616 - 1] = var3; // L: 8499
						}
					}
				}
			}

		}
	} // L: 8503
}
