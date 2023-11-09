import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class350 {
	@ObfuscatedName("an")
	static byte[][][] field3891;
	@ObfuscatedName("ao")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class345[] var2 = class521.method9388(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class345 var4 = var2[var3]; // L: 14
			if (var4.field3857 > var0) {
				var0 = var4.field3857; // L: 16
			}

			if (var4.field3858 > var1) { // L: 17
				var1 = var4.field3858;
			}
		}

	} // L: 21

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1150920234"
	)
	public static String method6677(String var0) {
		int var1 = var0.length(); // L: 167
		char[] var2 = new char[var1]; // L: 168
		byte var3 = 2; // L: 169

		for (int var4 = 0; var4 < var1; ++var4) { // L: 170
			char var5 = var0.charAt(var4); // L: 171
			if (var3 == 0) { // L: 172
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 173
				var5 = Decimator.method1148(var5);
			}

			if (Character.isLetter(var5)) { // L: 174
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 175
				if (Character.isSpaceChar(var5)) { // L: 176
					if (var3 != 2) { // L: 177
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 179
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 180
		}

		return new String(var2); // L: 182
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	static final void method6676(int var0, int var1, int var2) {
		if (PacketWriter.cameraX < var0) { // L: 4020
			PacketWriter.cameraX = (var0 - PacketWriter.cameraX) * class166.field1794 / 1000 + PacketWriter.cameraX + UserComparator8.field1451; // L: 4021
			if (PacketWriter.cameraX > var0) { // L: 4022
				PacketWriter.cameraX = var0;
			}
		}

		if (PacketWriter.cameraX > var0) { // L: 4024
			PacketWriter.cameraX -= (PacketWriter.cameraX - var0) * class166.field1794 / 1000 + UserComparator8.field1451; // L: 4025
			if (PacketWriter.cameraX < var0) { // L: 4026
				PacketWriter.cameraX = var0;
			}
		}

		if (class309.cameraY < var1) { // L: 4028
			class309.cameraY = (var1 - class309.cameraY) * class166.field1794 / 1000 + class309.cameraY + UserComparator8.field1451; // L: 4029
			if (class309.cameraY > var1) { // L: 4030
				class309.cameraY = var1;
			}
		}

		if (class309.cameraY > var1) { // L: 4032
			class309.cameraY -= (class309.cameraY - var1) * class166.field1794 / 1000 + UserComparator8.field1451; // L: 4033
			if (class309.cameraY < var1) { // L: 4034
				class309.cameraY = var1;
			}
		}

		if (World.cameraZ < var2) { // L: 4036
			World.cameraZ = (var2 - World.cameraZ) * class166.field1794 / 1000 + World.cameraZ + UserComparator8.field1451; // L: 4037
			if (World.cameraZ > var2) { // L: 4038
				World.cameraZ = var2;
			}
		}

		if (World.cameraZ > var2) { // L: 4040
			World.cameraZ -= (World.cameraZ - var2) * class166.field1794 / 1000 + UserComparator8.field1451; // L: 4041
			if (World.cameraZ < var2) { // L: 4042
				World.cameraZ = var2;
			}
		}

	} // L: 4044
}
