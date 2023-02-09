import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("z")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 149855437
	)
	static int field4573;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1005076993
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loz;I)I",
		garbageValue = "-331795509"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Low;I)I",
		garbageValue = "1651786682"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;S)I",
		garbageValue = "255"
	)
	static final int method7741(long var0, String var2) {
		Random var3 = new Random(); // L: 65
		Buffer var4 = new Buffer(128); // L: 66
		Buffer var5 = new Buffer(128); // L: 67
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 68 69 70 71 72
		var4.writeByte(10); // L: 73

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 74
			var4.writeInt(var3.nextInt()); // L: 75
		}

		var4.writeInt(var6[0]); // L: 77
		var4.writeInt(var6[1]); // L: 78
		var4.writeLong(var0); // L: 79
		var4.writeLong(0L); // L: 80

		for (var7 = 0; var7 < 4; ++var7) { // L: 81
			var4.writeInt(var3.nextInt()); // L: 82
		}

		var4.encryptRsa(class68.field883, class68.field880); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.writeInt(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		UserComparator3.method2941(var5); // L: 91
		var5.writeLong(var3.nextLong()); // L: 92
		var5.encryptRsa(class68.field883, class68.field880); // L: 93
		var7 = class96.stringCp1252NullTerminatedByteSize(var2); // L: 94
		if (var7 % 8 != 0) { // L: 95
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 96
		var8.writeStringCp1252NullTerminated(var2); // L: 97
		var8.offset = var7; // L: 98
		var8.xteaEncryptAll(var6); // L: 99
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5); // L: 100
		var9.writeByte(2); // L: 101
		var9.writeByte(var4.offset); // L: 102
		var9.writeBytes(var4.array, 0, var4.offset); // L: 103
		var9.writeByte(var5.offset); // L: 104
		var9.writeBytes(var5.array, 0, var5.offset); // L: 105
		var9.writeShort(var8.offset); // L: 106
		var9.writeBytes(var8.array, 0, var8.offset); // L: 107
		byte[] var11 = var9.array; // L: 109
		int var13 = var11.length; // L: 112
		StringBuilder var14 = new StringBuilder(); // L: 114

		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) { // L: 115
			int var16 = var11[var15] & 255; // L: 116
			var14.append(class363.field4363[var16 >>> 2]); // L: 117
			if (var15 < var13 - 1) { // L: 118
				var17 = var11[var15 + 1] & 255; // L: 119
				var14.append(class363.field4363[(var16 & 3) << 4 | var17 >>> 4]); // L: 120
				if (var15 < var13 - 2) { // L: 121
					int var18 = var11[var15 + 2] & 255; // L: 122
					var14.append(class363.field4363[(var17 & 15) << 2 | var18 >>> 6]).append(class363.field4363[var18 & 63]); // L: 123
				} else {
					var14.append(class363.field4363[(var17 & 15) << 2]).append("="); // L: 125
				}
			} else {
				var14.append(class363.field4363[(var16 & 3) << 4]).append("=="); // L: 127
			}
		}

		String var12 = var14.toString(); // L: 129
		var12 = var12; // L: 133

		try {
			URL var19 = new URL(class310.method6356("services", false) + "m=accountappeal/login.ws"); // L: 135
			URLConnection var24 = var19.openConnection(); // L: 136
			var24.setDoInput(true); // L: 137
			var24.setDoOutput(true); // L: 138
			var24.setConnectTimeout(5000); // L: 139
			OutputStreamWriter var20 = new OutputStreamWriter(var24.getOutputStream()); // L: 140
			var20.write("data2=" + GameObject.method4868(var12) + "&dest=" + GameObject.method4868("passwordchoice.ws")); // L: 141
			var20.flush(); // L: 142
			InputStream var21 = var24.getInputStream(); // L: 143
			var9 = new Buffer(new byte[1000]); // L: 144

			do {
				var17 = var21.read(var9.array, var9.offset, 1000 - var9.offset); // L: 146
				if (var17 == -1) { // L: 147
					var20.close(); // L: 153
					var21.close(); // L: 154
					String var22 = new String(var9.array); // L: 155
					if (var22.startsWith("OFFLINE")) { // L: 156
						return 4; // L: 157
					} else if (var22.startsWith("WRONG")) { // L: 159
						return 7; // L: 160
					} else if (var22.startsWith("RELOAD")) { // L: 162
						return 3; // L: 163
					} else if (var22.startsWith("Not permitted for social network accounts.")) { // L: 165
						return 6; // L: 166
					} else {
						var9.xteaDecryptAll(var6); // L: 168

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 169
							--var9.offset; // L: 170
						}

						var22 = new String(var9.array, 0, var9.offset); // L: 172
						if (class194.method3807(var22)) { // L: 173
							AttackOption.openURL(var22, true, false); // L: 174
							return 2; // L: 175
						} else {
							return 5; // L: 177
						}
					}
				}

				var9.offset += var17; // L: 148
			} while(var9.offset < 1000); // L: 149

			return 5; // L: 150
		} catch (Throwable var23) { // L: 179
			var23.printStackTrace(); // L: 180
			return 5; // L: 181
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrn;",
		garbageValue = "-8"
	)
	public static class468 method7740(int var0) {
		class468 var1 = (class468)class468.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class468.field4918.takeFile(38, var0); // L: 26
			var1 = new class468(); // L: 27
			if (var2 != null) { // L: 28
				var1.method8556(new Buffer(var2));
			}

			var1.method8558(); // L: 29
			class468.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
