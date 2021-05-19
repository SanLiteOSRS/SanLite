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

@ObfuscatedName("cw")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -670628763
	)
	static int field1204;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2028305435
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1822340223
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1106916281
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1868314049
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 951386477
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1193434187
	)
	int field1199;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -169637557
	)
	int field1203;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1882420351
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2081507135
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -228507891
	)
	int field1196;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 355878997
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1991837151
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-1496983965"
	)
	static final int method2180(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class80.field972, class80.field973);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var19 = DynamicObject.method2030();
			var5.writeBytes(var19, 0, var19.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class80.field972, class80.field973);
		var7 = class4.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		int var13 = var11.length;
		StringBuilder var14 = new StringBuilder();

		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) {
			int var16 = var11[var15] & 255;
			var14.append(class302.field3770[var16 >>> 2]);
			if (var15 < var13 - 1) {
				var17 = var11[var15 + 1] & 255;
				var14.append(class302.field3770[(var16 & 3) << 4 | var17 >>> 4]);
				if (var15 < var13 - 2) {
					int var18 = var11[var15 + 2] & 255;
					var14.append(class302.field3770[(var17 & 15) << 2 | var18 >>> 6]).append(class302.field3770[var18 & 63]);
				} else {
					var14.append(class302.field3770[(var17 & 15) << 2]).append("=");
				}
			} else {
				var14.append(class302.field3770[(var16 & 3) << 4]).append("==");
			}
		}

		String var12 = var14.toString();
		var12 = var12;

		try {
			URL var20 = new URL(class4.method57("services", false) + "m=accountappeal/login.ws");
			URLConnection var25 = var20.openConnection();
			var25.setDoInput(true);
			var25.setDoOutput(true);
			var25.setConnectTimeout(5000);
			OutputStreamWriter var21 = new OutputStreamWriter(var25.getOutputStream());
			var21.write("data2=" + class368.method6299(var12) + "&dest=" + class368.method6299("passwordchoice.ws"));
			var21.flush();
			InputStream var22 = var25.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				var17 = var22.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var21.close();
					var22.close();
					String var23 = new String(var9.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7;
					} else if (var23.startsWith("RELOAD")) {
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var23 = new String(var9.array, 0, var9.offset);
						if (class23.method308(var23)) {
							Interpreter.openURL(var23, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var17;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var24) {
			var24.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "11371461"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}
}
