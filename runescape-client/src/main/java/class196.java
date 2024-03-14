import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class196 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static EvictingDualNodeHashTable field2058;

	static {
		field2058 = new EvictingDualNodeHashTable(64); // L: 8
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-776452670"
	)
	static final int method3817(long var0, String var2) {
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

		var4.encryptRsa(class73.field912, class73.field916); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		KitDefinition.method3636(var5); // L: 61
		var5.writeLong(var3.nextLong()); // L: 62
		var5.encryptRsa(class73.field912, class73.field916); // L: 63
		var7 = class145.stringCp1252NullTerminatedByteSize(var2); // L: 64
		if (var7 % 8 != 0) { // L: 65
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 66
		var8.writeStringCp1252NullTerminated(var2); // L: 67
		var8.offset = var7; // L: 68
		var8.xteaEncryptAll(var6); // L: 69
		Buffer var9 = new Buffer(var8.offset + var4.offset + var5.offset + 5); // L: 70
		var9.writeByte(2); // L: 71
		var9.writeByte(var4.offset); // L: 72
		var9.writeBytes(var4.array, 0, var4.offset); // L: 73
		var9.writeByte(var5.offset); // L: 74
		var9.writeBytes(var5.array, 0, var5.offset); // L: 75
		var9.writeShort(var8.offset); // L: 76
		var9.writeBytes(var8.array, 0, var8.offset); // L: 77
		String var10 = class371.method7022(var9.array); // L: 78

		try {
			URL var11 = new URL(class317.method6073("services", false) + "m=accountappeal/login.ws"); // L: 80
			URLConnection var12 = var11.openConnection(); // L: 81
			var12.setDoInput(true); // L: 82
			var12.setDoOutput(true); // L: 83
			var12.setConnectTimeout(5000); // L: 84
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream()); // L: 85
			var13.write("data2=" + class183.method3663(var10) + "&dest=" + class183.method3663("passwordchoice.ws")); // L: 86
			var13.flush(); // L: 87
			InputStream var14 = var12.getInputStream(); // L: 88
			var9 = new Buffer(new byte[1000]); // L: 89

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset); // L: 91
				if (var15 == -1) { // L: 92
					var13.close(); // L: 98
					var14.close(); // L: 99
					String var18 = new String(var9.array); // L: 100
					if (var18.startsWith("OFFLINE")) { // L: 101
						return 4; // L: 102
					} else if (var18.startsWith("WRONG")) { // L: 104
						return 7; // L: 105
					} else if (var18.startsWith("RELOAD")) { // L: 107
						return 3; // L: 108
					} else if (var18.startsWith("Not permitted for social network accounts.")) { // L: 110
						return 6; // L: 111
					} else {
						var9.xteaDecryptAll(var6); // L: 113

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 114
							--var9.offset; // L: 115
						}

						var18 = new String(var9.array, 0, var9.offset); // L: 117
						boolean var16;
						if (var18 == null) { // L: 120
							var16 = false; // L: 121
						} else {
							label85: {
								try {
									new URL(var18);
								} catch (MalformedURLException var19) { // L: 127
									var16 = false; // L: 128
									break label85; // L: 129
								}

								var16 = true; // L: 131
							}
						}

						if (var16) { // L: 133
							class137.openURL(var18, true, false); // L: 134
							return 2; // L: 135
						} else {
							return 5; // L: 137
						}
					}
				}

				var9.offset += var15; // L: 93
			} while(var9.offset < 1000); // L: 94

			return 5; // L: 95
		} catch (Throwable var20) { // L: 139
			var20.printStackTrace(); // L: 140
			return 5; // L: 141
		}
	}
}
