import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class16 implements ThreadFactory {
	@ObfuscatedName("ao")
	static byte[][][] field81;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("aw")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("aj")
	final ThreadGroup field83;
	@ObfuscatedName("al")
	final AtomicInteger field79;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lam;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field79 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field83 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field83, var1, this.this$0.field70 + "-rest-request-" + this.field79.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILip;Liz;Z[I[II)I",
		garbageValue = "-1121357907"
	)
	public static int method207(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) { // L: 19
			for (var9 = 0; var9 < 128; ++var9) { // L: 20
				class212.directions[var8][var9] = 0;
				class212.distances[var8][var9] = 99999999;
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var17;
		int var19;
		int var20;
		int var21;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) { // L: 26
			var10 = var0; // L: 29
			var11 = var1; // L: 30
			byte var12 = 64; // L: 31
			var13 = 64; // L: 32
			var14 = var0 - var12; // L: 33
			var15 = var1 - var13; // L: 34
			class212.directions[var12][var13] = 99; // L: 35
			class212.distances[var12][var13] = 0; // L: 36
			byte var16 = 0; // L: 37
			var17 = 0; // L: 38
			class212.bufferX[var16] = var0; // L: 39
			var33 = var16 + 1;
			class212.bufferY[var16] = var1; // L: 40
			int[][] var18 = var4.flags; // L: 41

			boolean var29;
			while (true) {
				if (var33 == var17) { // L: 44
					class212.field2344 = var10;
					class83.field1035 = var11;
					var29 = false; // L: 118
					break;
				}

				var10 = class212.bufferX[var17]; // L: 45
				var11 = class212.bufferY[var17]; // L: 46
				var17 = var17 + 1 & 4095; // L: 47
				var30 = var10 - var14; // L: 48
				var31 = var11 - var15; // L: 49
				var19 = var10 - var4.xInset; // L: 50
				var20 = var11 - var4.yInset; // L: 51
				if (var3.hasArrived(1, var10, var11, var4)) { // L: 52
					class212.field2344 = var10; // L: 53
					class83.field1035 = var11; // L: 54
					var29 = true; // L: 55
					break;
				}

				var21 = class212.distances[var30][var31] + 1; // L: 58
				if (var30 > 0 && class212.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136776) == 0) { // L: 59
					class212.bufferX[var33] = var10 - 1; // L: 60
					class212.bufferY[var33] = var11; // L: 61
					var33 = var33 + 1 & 4095; // L: 62
					class212.directions[var30 - 1][var31] = 2; // L: 63
					class212.distances[var30 - 1][var31] = var21; // L: 64
				}

				if (var30 < 127 && class212.directions[var30 + 1][var31] == 0 && (var18[var19 + 1][var20] & 19136896) == 0) { // L: 66
					class212.bufferX[var33] = var10 + 1; // L: 67
					class212.bufferY[var33] = var11; // L: 68
					var33 = var33 + 1 & 4095; // L: 69
					class212.directions[var30 + 1][var31] = 8; // L: 70
					class212.distances[var30 + 1][var31] = var21; // L: 71
				}

				if (var31 > 0 && class212.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 73
					class212.bufferX[var33] = var10; // L: 74
					class212.bufferY[var33] = var11 - 1; // L: 75
					var33 = var33 + 1 & 4095; // L: 76
					class212.directions[var30][var31 - 1] = 1; // L: 77
					class212.distances[var30][var31 - 1] = var21; // L: 78
				}

				if (var31 < 127 && class212.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 80
					class212.bufferX[var33] = var10;
					class212.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class212.directions[var30][var31 + 1] = 4;
					class212.distances[var30][var31 + 1] = var21;
				}

				if (var30 > 0 && var31 > 0 && class212.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
					class212.bufferX[var33] = var10 - 1;
					class212.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095; // L: 90
					class212.directions[var30 - 1][var31 - 1] = 3;
					class212.distances[var30 - 1][var31 - 1] = var21;
				}

				if (var30 < 127 && var31 > 0 && class212.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) { // L: 94
					class212.bufferX[var33] = var10 + 1;
					class212.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class212.directions[var30 + 1][var31 - 1] = 9; // L: 98
					class212.distances[var30 + 1][var31 - 1] = var21;
				}

				if (var30 > 0 && var31 < 127 && class212.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) {
					class212.bufferX[var33] = var10 - 1;
					class212.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095; // L: 104
					class212.directions[var30 - 1][var31 + 1] = 6;
					class212.distances[var30 - 1][var31 + 1] = var21;
				}

				if (var30 < 127 && var31 < 127 && class212.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0 && (var18[var19][var20 + 1] & 19136800) == 0) { // L: 108
					class212.bufferX[var33] = var10 + 1; // L: 109
					class212.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class212.directions[var30 + 1][var31 + 1] = 12; // L: 112
					class212.distances[var30 + 1][var31 + 1] = var21;
				}
			}

			var28 = var29; // L: 120
		} else if (var2 == 2) { // L: 122
			var28 = class130.method3028(var0, var1, var3, var4);
		} else {
			var28 = PendingSpawn.method2343(var0, var1, var2, var3, var4); // L: 123
		}

		var9 = var0 - 64;
		var10 = var1 - 64; // L: 125
		var11 = class212.field2344;
		var30 = class83.field1035;
		if (!var28) { // L: 128
			var31 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var32 = 10;
			var33 = var3.approxDestinationX; // L: 133
			var17 = var3.approxDestinationY;
			int var27 = var3.approxDestinationSizeX;
			var19 = var3.approxDestinationSizeY;

			for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) {
				for (var21 = var17 - var32; var21 <= var32 + var17; ++var21) {
					int var22 = var20 - var9; // L: 139
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class212.distances[var22][var23] < 100) {
						int var24 = 0; // L: 143
						if (var20 < var33) { // L: 144
							var24 = var33 - var20;
						} else if (var20 > var33 + var27 - 1) {
							var24 = var20 - (var27 + var33 - 1);
						}

						int var25 = 0;
						if (var21 < var17) { // L: 147
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) {
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var25 * var25 + var24 * var24;
						if (var26 < var31 || var26 == var31 && class212.distances[var22][var23] < var14) { // L: 150
							var31 = var26;
							var14 = class212.distances[var22][var23];
							var11 = var20; // L: 153
							var30 = var21;
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) { // L: 164
			var6[0] = var11;
			var7[0] = var30;
			return 0; // L: 167
		} else {
			var13 = 0; // L: 169
			class212.bufferX[var13] = var11; // L: 172
			var31 = var13 + 1;
			class212.bufferY[var13] = var30; // L: 173

			for (var14 = var15 = class212.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class212.directions[var11 - var9][var30 - var10]) { // L: 174 175 185
				if (var15 != var14) { // L: 176
					var15 = var14; // L: 177
					class212.bufferX[var31] = var11; // L: 178
					class212.bufferY[var31++] = var30; // L: 179
				}

				if ((var14 & 2) != 0) { // L: 181
					++var11;
				} else if ((var14 & 8) != 0) { // L: 182
					--var11;
				}

				if ((var14 & 1) != 0) { // L: 183
					++var30;
				} else if ((var14 & 4) != 0) { // L: 184
					--var30;
				}
			}

			var33 = 0; // L: 187

			while (var31-- > 0) { // L: 188
				var6[var33] = class212.bufferX[var31]; // L: 189
				var7[var33++] = class212.bufferY[var31]; // L: 190
				if (var33 >= var6.length) { // L: 191
					break;
				}
			}

			return var33; // L: 193
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-2075076819"
	)
	public static void method208(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Lcz;II[I[II)V",
		garbageValue = "-1922698011"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var12 != var11) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-75"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4484
			byte var2 = 4; // L: 4485
			int var3 = var2 + 6; // L: 4486
			int var4 = var2 + 6; // L: 4487
			int var5 = class420.fontPlain12.lineWidth(var0, 250); // L: 4488
			int var6 = class420.fontPlain12.lineCount(var0, 250) * 13; // L: 4489
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0); // L: 4490
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215); // L: 4491
			class420.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4492
			class167.method3445(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6); // L: 4493
			if (var1) { // L: 4494
				StudioGame.rasterProvider.drawFull(0, 0); // L: 4495
			} else {
				VarbitComposition.method3769(var3, var4, var5, var6); // L: 4498
			}

		}
	} // L: 4500

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1869289523"
	)
	static void method201(class207 var0) {
		if (var0 != null && var0.field2284 != null) { // L: 4960
			if (var0.field2284.childIndex >= 0) { // L: 4961
				Widget var1 = WorldMapSection1.getWidget(var0.field2284.parentId); // L: 4962
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2284.childIndex >= var1.children.length || var0.field2284 != var1.children[var0.field2284.childIndex]) { // L: 4963
					return; // L: 4964
				}
			}

			if (var0.field2284.type == 11 && var0.field2285 == 0) { // L: 4967
				if (var0.field2284.method6190(var0.field2281, var0.field2282, 0, 0)) { // L: 4968
					switch(var0.field2284.method6111()) { // L: 4969
					case 0:
						class25.openURL(var0.field2284.method6113(), true, false); // L: 4986
						break;
					case 1:
						if (UserComparator5.method2862(ParamComposition.getWidgetFlags(var0.field2284))) { // L: 4971
							int[] var4 = var0.field2284.method6114(); // L: 4972
							if (var4 != null) { // L: 4973
								PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher); // L: 4974
								var2.packetBuffer.method8670(var4[1]); // L: 4975
								var2.packetBuffer.writeInt(var4[0]); // L: 4976
								var2.packetBuffer.writeInt(var0.field2284.id); // L: 4977
								var2.packetBuffer.method8671(var4[2]); // L: 4978
								var2.packetBuffer.method8671(var0.field2284.method6121()); // L: 4979
								var2.packetBuffer.writeShort(var0.field2284.childIndex); // L: 4980
								Client.packetWriter.addNode(var2); // L: 4981
							}
						}
					}
				}
			} else if (var0.field2284.type == 12) { // L: 4991
				class310 var3 = var0.field2284.method6118(); // L: 4992
				if (var3 != null && var3.method5933()) { // L: 4993
					switch(var0.field2285) { // L: 4994
					case 0:
						Client.field713.method4049(var0.field2284); // L: 4996
						var3.method5891(true); // L: 4997
						var3.method5856(var0.field2281, var0.field2282, Client.field712.method4074(82), Client.field712.method4074(81)); // L: 4998
						break;
					case 1:
						var3.method5857(var0.field2281, var0.field2282); // L: 5001
					}
				}
			}

		}
	} // L: 5006

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "991801272"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class1.scene.getWallObjectTag(var0, var1, var2); // L: 5953
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) { // L: 5954
			var7 = class1.scene.getObjectFlags(var0, var1, var2, var5); // L: 5955
			var8 = var7 >> 6 & 3; // L: 5956
			var9 = var7 & 31; // L: 5957
			var10 = var3; // L: 5958
			if (Decimator.method1127(var5)) { // L: 5959
				var10 = var4;
			}

			int[] var11 = class188.sceneMinimapSprite.pixels; // L: 5960
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5961
			var13 = class279.Entity_unpackID(var5); // L: 5962
			ObjectComposition var14 = DecorativeObject.getObjectDefinition(var13); // L: 5963
			if (var14.mapSceneId != -1) { // L: 5964
				IndexedSprite var15 = LoginScreenAnimation.mapSceneSprites[var14.mapSceneId]; // L: 5965
				if (var15 != null) { // L: 5966
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5967
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5968
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5969
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5973
					if (var8 == 0) { // L: 5974
						var11[var12] = var10; // L: 5975
						var11[var12 + 512] = var10; // L: 5976
						var11[var12 + 1024] = var10; // L: 5977
						var11[var12 + 1536] = var10; // L: 5978
					} else if (var8 == 1) { // L: 5980
						var11[var12] = var10; // L: 5981
						var11[var12 + 1] = var10; // L: 5982
						var11[var12 + 2] = var10; // L: 5983
						var11[var12 + 3] = var10; // L: 5984
					} else if (var8 == 2) { // L: 5986
						var11[var12 + 3] = var10; // L: 5987
						var11[var12 + 512 + 3] = var10; // L: 5988
						var11[var12 + 1024 + 3] = var10; // L: 5989
						var11[var12 + 1536 + 3] = var10; // L: 5990
					} else if (var8 == 3) { // L: 5992
						var11[var12 + 1536] = var10; // L: 5993
						var11[var12 + 1536 + 1] = var10; // L: 5994
						var11[var12 + 1536 + 2] = var10; // L: 5995
						var11[var12 + 1536 + 3] = var10; // L: 5996
					}
				}

				if (var9 == 3) { // L: 5999
					if (var8 == 0) { // L: 6000
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6001
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6002
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6003
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6005
					if (var8 == 3) { // L: 6006
						var11[var12] = var10; // L: 6007
						var11[var12 + 512] = var10; // L: 6008
						var11[var12 + 1024] = var10; // L: 6009
						var11[var12 + 1536] = var10; // L: 6010
					} else if (var8 == 0) { // L: 6012
						var11[var12] = var10; // L: 6013
						var11[var12 + 1] = var10; // L: 6014
						var11[var12 + 2] = var10; // L: 6015
						var11[var12 + 3] = var10; // L: 6016
					} else if (var8 == 1) { // L: 6018
						var11[var12 + 3] = var10; // L: 6019
						var11[var12 + 512 + 3] = var10; // L: 6020
						var11[var12 + 1024 + 3] = var10; // L: 6021
						var11[var12 + 1536 + 3] = var10; // L: 6022
					} else if (var8 == 2) { // L: 6024
						var11[var12 + 1536] = var10; // L: 6025
						var11[var12 + 1536 + 1] = var10; // L: 6026
						var11[var12 + 1536 + 2] = var10; // L: 6027
						var11[var12 + 1536 + 3] = var10; // L: 6028
					}
				}
			}
		}

		var5 = class1.scene.getGameObjectTag(var0, var1, var2); // L: 6033
		if (0L != var5) { // L: 6034
			var7 = class1.scene.getObjectFlags(var0, var1, var2, var5); // L: 6035
			var8 = var7 >> 6 & 3; // L: 6036
			var9 = var7 & 31; // L: 6037
			var10 = class279.Entity_unpackID(var5); // L: 6038
			ObjectComposition var24 = DecorativeObject.getObjectDefinition(var10); // L: 6039
			int var19;
			if (var24.mapSceneId != -1) { // L: 6040
				IndexedSprite var20 = LoginScreenAnimation.mapSceneSprites[var24.mapSceneId]; // L: 6041
				if (var20 != null) { // L: 6042
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6043
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6044
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6045
				}
			} else if (var9 == 9) { // L: 6048
				var12 = 15658734; // L: 6049
				if (Decimator.method1127(var5)) { // L: 6050
					var12 = 15597568;
				}

				int[] var18 = class188.sceneMinimapSprite.pixels; // L: 6051
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6052
				if (var8 != 0 && var8 != 2) { // L: 6053
					var18[var19] = var12; // L: 6060
					var18[var19 + 1 + 512] = var12; // L: 6061
					var18[var19 + 1024 + 2] = var12; // L: 6062
					var18[var19 + 1536 + 3] = var12; // L: 6063
				} else {
					var18[var19 + 1536] = var12; // L: 6054
					var18[var19 + 1 + 1024] = var12; // L: 6055
					var18[var19 + 512 + 2] = var12; // L: 6056
					var18[var19 + 3] = var12; // L: 6057
				}
			}
		}

		var5 = class1.scene.getGroundObjectTag(var0, var1, var2); // L: 6067
		if (0L != var5) { // L: 6068
			var7 = class279.Entity_unpackID(var5); // L: 6069
			ObjectComposition var21 = DecorativeObject.getObjectDefinition(var7); // L: 6070
			if (var21.mapSceneId != -1) { // L: 6071
				IndexedSprite var22 = LoginScreenAnimation.mapSceneSprites[var21.mapSceneId]; // L: 6072
				if (var22 != null) { // L: 6073
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6074
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6075
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6076
				}
			}
		}

	} // L: 6080

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IIII)V",
		garbageValue = "-39008914"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (BuddyRankComparator.localPlayer != var0) { // L: 9966
			if (Client.menuOptionsCount < 400) { // L: 9967
				String var4;
				if (var0.skillLevel == 0) { // L: 9969
					var4 = var0.actions[0] + var0.username + var0.actions[1] + NPC.method2569(var0.combatLevel, BuddyRankComparator.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9970
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 9971
					class110.insertMenuItemNoShift("Use", Client.field640 + " " + "->" + " " + Canvas.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9972
				} else if (Client.isSpellSelected) { // L: 9975
					if ((class90.selectedSpellFlags & 8) == 8) { // L: 9976
						class110.insertMenuItemNoShift(Client.field711, Client.field645 + " " + "->" + " " + Canvas.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9977
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 9982
						if (Client.playerMenuActions[var5] != null) { // L: 9983
							short var6 = 0; // L: 9984
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 9985
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 9986
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > BuddyRankComparator.localPlayer.combatLevel) { // L: 9987
									var6 = 2000; // L: 9988
								}

								if (BuddyRankComparator.localPlayer.team != 0 && var0.team != 0) { // L: 9990
									if (var0.team == BuddyRankComparator.localPlayer.team) { // L: 9991
										var6 = 2000;
									} else {
										var6 = 0; // L: 9992
									}
								} else if (Client.playerAttackOption == AttackOption.field1306 && var0.isClanMember()) { // L: 9994
									var6 = 2000; // L: 9995
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 9998
								var6 = 2000;
							}

							boolean var7 = false; // L: 9999
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10000
							class110.insertMenuItemNoShift(Client.playerMenuActions[var5], Canvas.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10001
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10006
					if (Client.menuOpcodes[var5] == 23) { // L: 10007
						Client.menuTargets[var5] = Canvas.colorStartTag(16777215) + var4; // L: 10008
						break;
					}
				}

			}
		}
	} // L: 10012
}
