import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class401 {
	@ObfuscatedName("am")
	static char[] field4493;
	@ObfuscatedName("ap")
	static char[] field4492;
	@ObfuscatedName("af")
	static char[] field4494;
	@ObfuscatedName("aj")
	static int[] field4495;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	static {
		field4493 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4493[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4493[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4493[var0] = (char)(var0 + 48 - 52);
		}

		field4493[62] = '+'; // L: 11
		field4493[63] = '/'; // L: 12
		field4492 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4492[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4492[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4492[var0] = (char)(var0 + 48 - 52);
		}

		field4492[62] = '*'; // L: 22
		field4492[63] = '-'; // L: 23
		field4494 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4494[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4494[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4494[var0] = (char)(var0 + 48 - 52);
		}

		field4494[62] = '-'; // L: 33
		field4494[63] = '_'; // L: 34
		field4495 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4495.length; ++var0) { // L: 41
			field4495[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4495[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4495[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4495[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4495; // L: 45
		field4495[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4495; // L: 48
		field4495[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	static final void method7504(int var0, int var1) {
		if (var0 < 128) { // L: 4060
			var0 = 128; // L: 4061
		} else if (var0 > 383) { // L: 4063
			var0 = 383; // L: 4064
		}

		if (UserComparator3.cameraPitch < var0) { // L: 4066
			UserComparator3.cameraPitch = (var0 - UserComparator3.cameraPitch) * class439.field4690 / 1000 + UserComparator3.cameraPitch + class195.field2045; // L: 4067
			if (UserComparator3.cameraPitch > var0) { // L: 4068
				UserComparator3.cameraPitch = var0; // L: 4069
			}
		} else if (UserComparator3.cameraPitch > var0) { // L: 4072
			UserComparator3.cameraPitch -= (UserComparator3.cameraPitch - var0) * class439.field4690 / 1000 + class195.field2045; // L: 4073
			if (UserComparator3.cameraPitch < var0) { // L: 4074
				UserComparator3.cameraPitch = var0; // L: 4075
			}
		}

		var1 &= 2047; // L: 4078
		int var2 = var1 - HealthBarUpdate.cameraYaw; // L: 4079
		if (var2 > 1024) { // L: 4080
			var2 -= 2048; // L: 4081
		} else if (var2 < -1024) { // L: 4083
			var2 += 2048; // L: 4084
		}

		if (var2 > 0) { // L: 4086
			HealthBarUpdate.cameraYaw = HealthBarUpdate.cameraYaw + class195.field2045 + var2 * class439.field4690 / 1000; // L: 4087
			HealthBarUpdate.cameraYaw &= 2047; // L: 4088
		} else if (var2 < 0) { // L: 4090
			HealthBarUpdate.cameraYaw -= -var2 * class439.field4690 / 1000 + class195.field2045; // L: 4091
			HealthBarUpdate.cameraYaw &= 2047; // L: 4092
		}

		int var3 = var1 - HealthBarUpdate.cameraYaw; // L: 4094
		if (var3 > 1024) { // L: 4095
			var3 -= 2048; // L: 4096
		} else if (var3 < -1024) { // L: 4098
			var3 += 2048; // L: 4099
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4101
			HealthBarUpdate.cameraYaw = var1; // L: 4102
		}

	} // L: 4104

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	static final void method7505(int var0) {
		if (class380.field4414.method6357(var0)) { // L: 12030
			class168.drawModelComponents(class380.field4414.field3610[var0], -1); // L: 12031
		}
	} // L: 12032

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "122"
	)
	static final void method7500(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12113
		if (var0 != class93.clientPreferences.method2597()) { // L: 12114
			label61: {
				if (class93.clientPreferences.method2597() == 0) { // L: 12116
					boolean var1 = !class319.field3466.isEmpty(); // L: 12119
					if (var1) { // L: 12121
						class221.method4364(WorldMapSection0.field2587, var0); // L: 12122
						Client.playingJingle = false; // L: 12123
						break label61;
					}
				}

				if (var0 == 0) { // L: 12127
					Actor.method2488(0, 0); // L: 12128
					Client.playingJingle = false; // L: 12129
				} else if (!class319.field3459.isEmpty()) { // L: 12132
					Iterator var3 = class319.field3459.iterator(); // L: 12133

					while (var3.hasNext()) {
						class331 var2 = (class331)var3.next(); // L: 12134
						if (var2 != null) { // L: 12136
							var2.field3577 = var0; // L: 12139
						}
					}

					class331 var4 = (class331)class319.field3459.get(0); // L: 12142
					if (var4 != null && var4.field3582 != null && var4.field3582.isReady() && !var4.field3580) { // L: 12143
						var4.field3582.setPcmStreamVolume(var0); // L: 12144
						var4.field3576 = (float)var0; // L: 12145
					}
				}
			}

			class93.clientPreferences.method2628(var0); // L: 12150
		}

	} // L: 12152
}
