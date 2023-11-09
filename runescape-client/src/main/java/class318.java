import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.BitSet;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class318 extends Node {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -299416591
	)
	int field3527;
	@ObfuscatedName("ae")
	BitSet field3526;

	class318(int var1) {
		this.field3527 = var1; // L: 11
		this.field3526 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)I",
		garbageValue = "-14"
	)
	static final int method6018(long var0, String var2) {
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

		var4.encryptRsa(class72.field910, class72.field912); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		class177.method3495(var5); // L: 61
		var5.writeLong(var3.nextLong()); // L: 62
		var5.encryptRsa(class72.field910, class72.field912); // L: 63
		var7 = AbstractSocket.stringCp1252NullTerminatedByteSize(var2); // L: 64
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
		String var10 = class11.method97(var11, 0, var11.length); // L: 81
		String var12 = var10; // L: 83

		try {
			URL var13 = new URL(HorizontalAlignment.method3682("services", false) + "m=accountappeal/login.ws"); // L: 85
			URLConnection var14 = var13.openConnection(); // L: 86
			var14.setDoInput(true); // L: 87
			var14.setDoOutput(true); // L: 88
			var14.setConnectTimeout(5000); // L: 89
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 90
			String var17 = "data2=" + UserComparator10.method2909(var12) + "&dest="; // L: 92
			int var19 = "passwordchoice.ws".length(); // L: 95
			StringBuilder var20 = new StringBuilder(var19); // L: 96

			for (int var21 = 0; var21 < var19; ++var21) { // L: 97
				char var22 = "passwordchoice.ws".charAt(var21); // L: 98
				if ((var22 < 'a' || var22 > 'z') && (var22 < 'A' || var22 > 'Z') && (var22 < '0' || var22 > '9') && var22 != '.' && var22 != '-' && var22 != '*' && var22 != '_') { // L: 99
					if (var22 == ' ') { // L: 100
						var20.append('+');
					} else {
						byte var23 = class348.charToByteCp1252(var22); // L: 102
						var20.append('%'); // L: 103
						int var24 = var23 >> 4 & 15; // L: 104
						if (var24 >= 10) { // L: 105
							var20.append((char)(var24 + 55));
						} else {
							var20.append((char)(var24 + 48)); // L: 106
						}

						var24 = var23 & 15; // L: 107
						if (var24 >= 10) { // L: 108
							var20.append((char)(var24 + 55));
						} else {
							var20.append((char)(var24 + 48)); // L: 109
						}
					}
				} else {
					var20.append(var22);
				}
			}

			String var18 = var20.toString(); // L: 112
			var15.write(var17 + var18); // L: 114
			var15.flush(); // L: 115
			InputStream var25 = var14.getInputStream(); // L: 116
			var9 = new Buffer(new byte[1000]); // L: 117

			do {
				int var26 = var25.read(var9.array, var9.offset, 1000 - var9.offset); // L: 119
				if (var26 == -1) { // L: 120
					var15.close(); // L: 126
					var25.close(); // L: 127
					String var28 = new String(var9.array); // L: 128
					if (var28.startsWith("OFFLINE")) { // L: 129
						return 4; // L: 130
					} else if (var28.startsWith("WRONG")) { // L: 132
						return 7; // L: 133
					} else if (var28.startsWith("RELOAD")) { // L: 135
						return 3; // L: 136
					} else if (var28.startsWith("Not permitted for social network accounts.")) { // L: 138
						return 6; // L: 139
					} else {
						var9.xteaDecryptAll(var6); // L: 141

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 142
							--var9.offset; // L: 143
						}

						var28 = new String(var9.array, 0, var9.offset); // L: 145
						if (PendingSpawn.method2369(var28)) { // L: 146
							class30.openURL(var28, true, false); // L: 147
							return 2; // L: 148
						} else {
							return 5; // L: 150
						}
					}
				}

				var9.offset += var26; // L: 121
			} while(var9.offset < 1000); // L: 122

			return 5; // L: 123
		} catch (Throwable var27) { // L: 152
			var27.printStackTrace(); // L: 153
			return 5; // L: 154
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1758045320"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1866
		Login.Login_response2 = var1; // L: 1867
		Login.Login_response3 = var2; // L: 1868
	} // L: 1869

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ldr;II)V",
		garbageValue = "-640211336"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.spotAnimation >= Client.cycle) { // L: 4004
			Huffman.method6552(var0);
		} else {
			int var3;
			int var4;
			int var5;
			int var7;
			int var8;
			if (var0.field1254 >= Client.cycle) { // L: 4005
				boolean var11 = var0.field1254 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4006
				if (!var11) { // L: 4007
					SequenceDefinition var12 = EnumComposition.SequenceDefinition_get(var0.sequence); // L: 4008
					if (var12 != null && !var12.isCachedModelIdSet()) { // L: 4009
						var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame]; // L: 4013
					} else {
						var11 = true; // L: 4010
					}
				}

				if (var11) { // L: 4016
					var3 = var0.field1254 - var0.spotAnimation; // L: 4017
					var4 = Client.cycle - var0.spotAnimation; // L: 4018
					var5 = var0.field1249 * 128 + var0.field1201 * -876008384; // L: 4019
					int var13 = var0.field1251 * 128 + var0.field1201 * -876008384; // L: 4020
					var7 = var0.field1247 * 128 + var0.field1201 * -876008384; // L: 4021
					var8 = var0.field1217 * 128 + var0.field1201 * -876008384; // L: 4022
					var0.x = (var4 * var7 + var5 * (var3 - var4)) / var3; // L: 4023
					var0.y = (var4 * var8 + var13 * (var3 - var4)) / var3; // L: 4024
				}

				var0.field1271 = 0; // L: 4026
				var0.orientation = var0.field1255; // L: 4027
				var0.rotation = var0.orientation; // L: 4028
			} else {
				var0.movementSequence = var0.idleSequence; // L: 4031
				if (var0.pathLength == 0) { // L: 4032
					var0.field1271 = 0; // L: 4033
				} else {
					label373: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4036
							SequenceDefinition var2 = EnumComposition.SequenceDefinition_get(var0.sequence); // L: 4037
							if (var0.field1261 > 0 && var2.field2325 == 0) { // L: 4038
								++var0.field1271; // L: 4039
								break label373; // L: 4040
							}

							if (var0.field1261 <= 0 && var2.field2326 == 0) { // L: 4042
								++var0.field1271; // L: 4043
								break label373; // L: 4044
							}
						}

						int var14 = var0.x; // L: 4047
						var3 = var0.y; // L: 4048
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1201 * -876008384; // L: 4049
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1201 * -876008384; // L: 4050
						if (var14 < var4) { // L: 4051
							if (var3 < var5) { // L: 4052
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 4053
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 4054
							}
						} else if (var14 > var4) { // L: 4056
							if (var3 < var5) { // L: 4057
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 4058
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 4059
							}
						} else if (var3 < var5) { // L: 4061
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 4062
							var0.orientation = 0;
						}

						class217 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4063
						if (var4 - var14 <= 256 && var4 - var14 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4064
							var7 = var0.orientation - var0.rotation & 2047; // L: 4071
							if (var7 > 1024) { // L: 4072
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence; // L: 4073
							if (var7 >= -256 && var7 <= 256) { // L: 4074
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 4075
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 4076
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 4077
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 4078
							int var9 = 4; // L: 4079
							boolean var10 = true; // L: 4080
							if (var0 instanceof NPC) { // L: 4081
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 4082
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1266 != 0) { // L: 4083
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 4084
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 4085
									var9 = 8;
								}

								if (var0.field1271 > 0 && var0.pathLength > 1) { // L: 4086
									var9 = 8; // L: 4087
									--var0.field1271; // L: 4088
								}
							} else {
								if (var0.pathLength > 1) { // L: 4092
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 4093
									var9 = 8;
								}

								if (var0.field1271 > 0 && var0.pathLength > 1) { // L: 4094
									var9 = 8; // L: 4095
									--var0.field1271; // L: 4096
								}
							}

							if (var6 == class217.field2407) { // L: 4099
								var9 <<= 1;
							} else if (var6 == class217.field2406) { // L: 4100
								var9 >>= 1;
							}

							if (var9 >= 8) { // L: 4101
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4102
									var0.movementSequence = var0.runSequence;
								} else if (var0.walkBackSequence == var0.movementSequence && var0.field1211 != -1) { // L: 4103
									var0.movementSequence = var0.field1211;
								} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1252 != -1) { // L: 4104
									var0.movementSequence = var0.field1252;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1213 != -1) { // L: 4105
									var0.movementSequence = var0.field1213;
								}
							} else if (var9 <= 2) { // L: 4107
								if (var0.movementSequence == var0.walkSequence && var0.field1214 != -1) { // L: 4108
									var0.movementSequence = var0.field1214;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1215 != -1) { // L: 4109
									var0.movementSequence = var0.field1215;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1216 != -1) { // L: 4110
									var0.movementSequence = var0.field1216;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1246 != -1) { // L: 4111
									var0.movementSequence = var0.field1246;
								}
							}

							if (var4 != var14 || var5 != var3) { // L: 4113
								if (var14 < var4) { // L: 4114
									var0.x += var9; // L: 4115
									if (var0.x > var4) { // L: 4116
										var0.x = var4;
									}
								} else if (var14 > var4) { // L: 4118
									var0.x -= var9; // L: 4119
									if (var0.x < var4) { // L: 4120
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 4122
									var0.y += var9; // L: 4123
									if (var0.y > var5) { // L: 4124
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 4126
									var0.y -= var9; // L: 4127
									if (var0.y < var5) { // L: 4128
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 4131
								--var0.pathLength; // L: 4132
								if (var0.field1261 > 0) { // L: 4133
									--var0.field1261;
								}
							}
						} else {
							var0.x = var4; // L: 4065
							var0.y = var5; // L: 4066
							--var0.pathLength; // L: 4067
							if (var0.field1261 > 0) { // L: 4068
								--var0.field1261;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4136
			var0.sequence = -1; // L: 4137
			var0.spotAnimation = 0; // L: 4138
			var0.field1254 = 0; // L: 4139
			var0.method2391(); // L: 4140
			var0.x = var0.pathX[0] * 128 + var0.field1201 * -876008384; // L: 4141
			var0.y = var0.field1201 * -876008384 + var0.pathY[0] * 128; // L: 4142
			var0.method2373(); // L: 4143
		}

		if (VarbitComposition.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4145 4146
			var0.sequence = -1; // L: 4147
			var0.spotAnimation = 0; // L: 4148
			var0.field1254 = 0; // L: 4149
			var0.method2391(); // L: 4150
			var0.x = var0.pathX[0] * 128 + var0.field1201 * -876008384; // L: 4151
			var0.y = var0.field1201 * -876008384 + var0.pathY[0] * 128; // L: 4152
			var0.method2373(); // L: 4153
		}

		ClanChannelMember.method3122(var0); // L: 4156
		UserComparator5.method2886(var0); // L: 4157
	} // L: 4158
}
