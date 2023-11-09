import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hd")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1533132055
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 490387531
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 810697233
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 459646283
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -86663039
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1253262399
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -853639905
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1143084627
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2018676367
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1791223475
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1083500843
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 570777789
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1627261971
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 734054673
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1464078865"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2119764221"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4; // L: 53
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "-1688632698"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "2062014732"
	)
	static final int method4852(long var0, String var2) {
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

		var4.encryptRsa(class65.field849, class65.field850); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		if (Client.randomDatData != null) { // L: 62
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 63
		} else {
			byte[] var8 = new byte[24]; // L: 68

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 70
				JagexCache.JagexCache_randomDat.readFully(var8); // L: 71

				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) { // L: 72 73 74
				}

				if (var9 >= 24) { // L: 76
					throw new IOException();
				}
			} catch (Exception var26) {
				for (int var10 = 0; var10 < 24; ++var10) { // L: 79
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length); // L: 84
		}

		var5.writeLong(var3.nextLong()); // L: 86
		var5.encryptRsa(class65.field849, class65.field850); // L: 87
		var7 = class309.stringCp1252NullTerminatedByteSize(var2); // L: 88
		if (var7 % 8 != 0) { // L: 89
			var7 += 8 - var7 % 8;
		}

		Buffer var27 = new Buffer(var7); // L: 90
		var27.writeStringCp1252NullTerminated(var2); // L: 91
		var27.offset = var7; // L: 92
		var27.xteaEncryptAll(var6); // L: 93
		Buffer var20 = new Buffer(var27.offset + var4.offset + var5.offset + 5); // L: 94
		var20.writeByte(2); // L: 95
		var20.writeByte(var4.offset); // L: 96
		var20.writeBytes(var4.array, 0, var4.offset); // L: 97
		var20.writeByte(var5.offset); // L: 98
		var20.writeBytes(var5.array, 0, var5.offset); // L: 99
		var20.writeShort(var27.offset); // L: 100
		var20.writeBytes(var27.array, 0, var27.offset); // L: 101
		byte[] var11 = var20.array; // L: 103
		String var22 = class326.method5963(var11, 0, var11.length); // L: 105
		String var12 = var22; // L: 107

		try {
			URL var13 = new URL(ModeWhere.method6005("services", false) + "m=accountappeal/login.ws"); // L: 109
			URLConnection var14 = var13.openConnection(); // L: 110
			var14.setDoInput(true); // L: 111
			var14.setDoOutput(true); // L: 112
			var14.setConnectTimeout(5000); // L: 113
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 114
			var15.write("data2=" + class11.method108(var12) + "&dest=" + class11.method108("passwordchoice.ws")); // L: 115
			var15.flush(); // L: 116
			InputStream var16 = var14.getInputStream(); // L: 117
			var20 = new Buffer(new byte[1000]); // L: 118

			do {
				int var17 = var16.read(var20.array, var20.offset, 1000 - var20.offset); // L: 120
				if (var17 == -1) { // L: 121
					var15.close(); // L: 127
					var16.close(); // L: 128
					String var23 = new String(var20.array); // L: 129
					if (var23.startsWith("OFFLINE")) { // L: 130
						return 4; // L: 131
					} else if (var23.startsWith("WRONG")) { // L: 133
						return 7; // L: 134
					} else if (var23.startsWith("RELOAD")) { // L: 136
						return 3; // L: 137
					} else if (var23.startsWith("Not permitted for social network accounts.")) { // L: 139
						return 6; // L: 140
					} else {
						var20.xteaDecryptAll(var6); // L: 142

						while (var20.offset > 0 && var20.array[var20.offset - 1] == 0) { // L: 143
							--var20.offset; // L: 144
						}

						var23 = new String(var20.array, 0, var20.offset); // L: 146
						boolean var18;
						if (var23 == null) { // L: 149
							var18 = false; // L: 150
						} else {
							label101: {
								try {
									new URL(var23);
								} catch (MalformedURLException var24) { // L: 156
									var18 = false; // L: 157
									break label101; // L: 158
								}

								var18 = true; // L: 160
							}
						}

						if (var18) { // L: 162
							class400.openURL(var23, true, false); // L: 163
							return 2; // L: 164
						} else {
							return 5; // L: 166
						}
					}
				}

				var20.offset += var17; // L: 122
			} while(var20.offset < 1000); // L: 123

			return 5; // L: 124
		} catch (Throwable var25) { // L: 168
			var25.printStackTrace(); // L: 169
			return 5; // L: 170
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-626299447"
	)
	static int method4869(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1130
			if (var1 <= var0 + 30) { // L: 1131
				return var2; // L: 1132
			}

			var0 += 30; // L: 1134
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1135
		}

		return 0; // L: 1137
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1483324777"
	)
	static int method4868(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3807
			Nameable.Interpreter_intStackSize -= 2; // L: 3808
			var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3809
			int var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3810
			if (!Client.isCameraLocked) { // L: 3811
				Client.camAngleX = var3; // L: 3812
				Client.camAngleY = var4; // L: 3813
			}

			return 1; // L: 3815
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3817
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3818
			return 1; // L: 3819
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3821
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3822
			return 1; // L: 3823
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3825
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3826
			if (var3 < 0) { // L: 3827
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3828
			return 1; // L: 3829
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3831
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3832
			return 1; // L: 3833
		} else {
			return 2; // L: 3835
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2118428310"
	)
	static String method4870(String var0) {
		PlayerType[] var1 = class220.PlayerType_values(); // L: 12236

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12237
			PlayerType var3 = var1[var2]; // L: 12238
			if (var3.modIcon != -1 && var0.startsWith(SoundSystem.method740(var3.modIcon))) { // L: 12240 12241
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12242
				break;
			}
		}

		return var0; // L: 12249
	}
}
