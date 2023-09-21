import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class178 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1412529255
	)
	static int field1853;
	@ObfuscatedName("jn")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	static IndexedSprite[] field1854;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	public UrlRequest field1856;
	@ObfuscatedName("al")
	public float[] field1855;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class172 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class178(class172 var1) {
		this.this$0 = var1;
		this.field1855 = new float[4]; // L: 348
	} // L: 350

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-871910304"
	)
	static final int method3551(long var0, String var2) {
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

		var4.encryptRsa(class74.field906, class74.field907); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.writeInt(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		if (Client.randomDatData != null) { // L: 92
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 93
		} else {
			byte[] var16 = class131.method3015(); // L: 96
			var5.writeBytes(var16, 0, var16.length); // L: 97
		}

		var5.writeLong(var3.nextLong()); // L: 99
		var5.encryptRsa(class74.field906, class74.field907); // L: 100
		var7 = class478.stringCp1252NullTerminatedByteSize(var2); // L: 101
		if (var7 % 8 != 0) { // L: 102
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 103
		var8.writeStringCp1252NullTerminated(var2); // L: 104
		var8.offset = var7; // L: 105
		var8.xteaEncryptAll(var6); // L: 106
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5); // L: 107
		var9.writeByte(2); // L: 108
		var9.writeByte(var4.offset); // L: 109
		var9.writeBytes(var4.array, 0, var4.offset); // L: 110
		var9.writeByte(var5.offset); // L: 111
		var9.writeBytes(var5.array, 0, var5.offset); // L: 112
		var9.writeShort(var8.offset); // L: 113
		var9.writeBytes(var8.array, 0, var8.offset); // L: 114
		String var10 = class233.method4421(var9.array); // L: 115

		try {
			URL var11 = new URL(ScriptEvent.method2315("services", false) + "m=accountappeal/login.ws"); // L: 117
			URLConnection var12 = var11.openConnection(); // L: 118
			var12.setDoInput(true); // L: 119
			var12.setDoOutput(true); // L: 120
			var12.setConnectTimeout(5000); // L: 121
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream()); // L: 122
			var13.write("data2=" + Timer.method7850(var10) + "&dest=" + Timer.method7850("passwordchoice.ws")); // L: 123
			var13.flush(); // L: 124
			InputStream var14 = var12.getInputStream(); // L: 125
			var9 = new Buffer(new byte[1000]); // L: 126

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset); // L: 128
				if (var15 == -1) { // L: 129
					var13.close(); // L: 135
					var14.close(); // L: 136
					String var17 = new String(var9.array); // L: 137
					if (var17.startsWith("OFFLINE")) { // L: 138
						return 4; // L: 139
					} else if (var17.startsWith("WRONG")) { // L: 141
						return 7; // L: 142
					} else if (var17.startsWith("RELOAD")) { // L: 144
						return 3; // L: 145
					} else if (var17.startsWith("Not permitted for social network accounts.")) { // L: 147
						return 6; // L: 148
					} else {
						var9.xteaDecryptAll(var6); // L: 150

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 151
							--var9.offset; // L: 152
						}

						var17 = new String(var9.array, 0, var9.offset); // L: 154
						if (ItemComposition.method4137(var17)) { // L: 155
							VertexNormal.openURL(var17, true, false); // L: 156
							return 2; // L: 157
						} else {
							return 5; // L: 159
						}
					}
				}

				var9.offset += var15; // L: 130
			} while(var9.offset < 1000); // L: 131

			return 5; // L: 132
		} catch (Throwable var18) { // L: 161
			var18.printStackTrace(); // L: 162
			return 5; // L: 163
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4613
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1551769490"
	)
	static final void method3552(int var0) {
		if (class33.field184.method6242(var0)) { // L: 12163
			class174.drawModelComponents(class33.field184.field3587[var0], -1); // L: 12164
		}
	} // L: 12165
}
