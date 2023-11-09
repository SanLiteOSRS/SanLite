import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@kv
@ObfuscatedName("mu")
public final class class357 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("w")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "813549097"
	)
	static final int method6825(long var0, String var2) {
		Random var3 = new Random(); // L: 35
		Buffer var4 = new Buffer(128); // L: 36
		Buffer var5 = new Buffer(128); // L: 37
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 38 39 40 41 42
		var4.writeByte(10); // L: 43

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 44
			var4.writeInt(var3.nextInt()); // L: 45
		}

		var4.writeInt(var6[0]); // L: 47
		var4.writeInt(var6[1]); // L: 48
		var4.writeLong(var0); // L: 49
		var4.writeLong(0L); // L: 50

		for (var7 = 0; var7 < 4; ++var7) { // L: 51
			var4.writeInt(var3.nextInt()); // L: 52
		}

		var4.encryptRsa(class69.field874, class69.field875); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		MusicPatchNode.method5669(var5); // L: 61
		var5.writeLong(var3.nextLong()); // L: 62
		var5.encryptRsa(class69.field874, class69.field875); // L: 63
		var7 = Actor.stringCp1252NullTerminatedByteSize(var2); // L: 64
		if (var7 % 8 != 0) { // L: 65
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 66
		var8.writeStringCp1252NullTerminated(var2); // L: 67
		var8.offset = var7; // L: 68
		var8.xteaEncryptAll(var6); // L: 69
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5); // L: 70
		var9.writeByte(2); // L: 71
		var9.writeByte(var4.offset); // L: 72
		var9.writeBytes(var4.array, 0, var4.offset); // L: 73
		var9.writeByte(var5.offset); // L: 74
		var9.writeBytes(var5.array, 0, var5.offset); // L: 75
		var9.writeShort(var8.offset); // L: 76
		var9.writeBytes(var8.array, 0, var8.offset); // L: 77
		byte[] var11 = var9.array; // L: 79
		int var13 = var11.length; // L: 82
		StringBuilder var14 = new StringBuilder(); // L: 84

		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) { // L: 85
			int var16 = var11[var15] & 255; // L: 86
			var14.append(class356.field4298[var16 >>> 2]); // L: 87
			if (var15 < var13 - 1) { // L: 88
				var17 = var11[var15 + 1] & 255; // L: 89
				var14.append(class356.field4298[(var16 & 3) << 4 | var17 >>> 4]); // L: 90
				if (var15 < var13 - 2) { // L: 91
					int var18 = var11[var15 + 2] & 255; // L: 92
					var14.append(class356.field4298[(var17 & 15) << 2 | var18 >>> 6]).append(class356.field4298[var18 & 63]); // L: 93
				} else {
					var14.append(class356.field4298[(var17 & 15) << 2]).append("="); // L: 95
				}
			} else {
				var14.append(class356.field4298[(var16 & 3) << 4]).append("=="); // L: 97
			}
		}

		String var12 = var14.toString(); // L: 99
		var12 = var12; // L: 103

		try {
			URL var19 = new URL(class135.method2990("services", false) + "m=accountappeal/login.ws"); // L: 105
			URLConnection var24 = var19.openConnection(); // L: 106
			var24.setDoInput(true); // L: 107
			var24.setDoOutput(true); // L: 108
			var24.setConnectTimeout(5000); // L: 109
			OutputStreamWriter var20 = new OutputStreamWriter(var24.getOutputStream()); // L: 110
			var20.write("data2=" + DynamicObject.method2132(var12) + "&dest=" + DynamicObject.method2132("passwordchoice.ws")); // L: 111
			var20.flush(); // L: 112
			InputStream var21 = var24.getInputStream(); // L: 113
			var9 = new Buffer(new byte[1000]); // L: 114

			do {
				var17 = var21.read(var9.array, var9.offset, 1000 - var9.offset); // L: 116
				if (var17 == -1) { // L: 117
					var20.close(); // L: 123
					var21.close(); // L: 124
					String var22 = new String(var9.array); // L: 125
					if (var22.startsWith("OFFLINE")) { // L: 126
						return 4; // L: 127
					} else if (var22.startsWith("WRONG")) { // L: 129
						return 7; // L: 130
					} else if (var22.startsWith("RELOAD")) { // L: 132
						return 3; // L: 133
					} else if (var22.startsWith("Not permitted for social network accounts.")) { // L: 135
						return 6; // L: 136
					} else {
						var9.xteaDecryptAll(var6); // L: 138

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 139
							--var9.offset; // L: 140
						}

						var22 = new String(var9.array, 0, var9.offset); // L: 142
						if (NPC.method2494(var22)) { // L: 143
							UrlRequester.openURL(var22, true, false); // L: 144
							return 2; // L: 145
						} else {
							return 5; // L: 147
						}
					}
				}

				var9.offset += var17; // L: 118
			} while(var9.offset < 1000); // L: 119

			return 5; // L: 120
		} catch (Throwable var23) { // L: 149
			var23.printStackTrace(); // L: 150
			return 5; // L: 151
		}
	}
}
