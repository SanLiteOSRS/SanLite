import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class59 {
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 1556739777
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	VorbisFloor field427;
	@ObfuscatedName("aw")
	boolean field423;
	@ObfuscatedName("al")
	int[] field424;
	@ObfuscatedName("ai")
	int[] field422;
	@ObfuscatedName("ar")
	boolean[] field426;

	@ObfuscatedSignature(
		descriptor = "(Lbp;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field427 = var1;
		this.field423 = var2; // L: 12
		this.field424 = var3; // L: 13
		this.field422 = var4; // L: 14
		this.field426 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FIS)V",
		garbageValue = "12621"
	)
	void method1124(float[] var1, int var2) {
		int var3 = this.field427.field274.length; // L: 19
		VorbisFloor var10000 = this.field427; // L: 20
		int var4 = VorbisFloor.field276[this.field427.multiplier - 1];
		boolean[] var5 = this.field426; // L: 21
		this.field426[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field427.method730(this.field424, var6); // L: 25
			var8 = this.field427.method738(this.field424, var6); // L: 26
			var9 = this.field427.method725(this.field424[var7], this.field422[var7], this.field424[var8], this.field422[var8], this.field424[var6]); // L: 27
			var10 = this.field422[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field426; // L: 33
				this.field426[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field426[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field422[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field422[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field426[var6] = false; // L: 46
				this.field422[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field427.multiplier * this.field422[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field426[var8]) { // L: 54
				var9 = this.field424[var8]; // L: 55
				var10 = this.field427.multiplier * this.field422[var8]; // L: 56
				this.field427.method726(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field427; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "811887838"
	)
	boolean method1125() {
		return this.field423; // L: 68
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field424[var1]; // L: 74
			int var5 = this.field422[var1]; // L: 75
			boolean var6 = this.field426[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field424[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field424[var3] = var8; // L: 80
					this.field422[var3] = this.field422[var7]; // L: 81
					this.field426[var3] = this.field426[var7]; // L: 82
					++var3; // L: 83
					this.field424[var7] = this.field424[var3]; // L: 84
					this.field422[var7] = this.field422[var3]; // L: 85
					this.field426[var7] = this.field426[var3]; // L: 86
				}
			}

			this.field424[var3] = var4; // L: 89
			this.field422[var3] = var5; // L: 90
			this.field426[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILuu;B)Z",
		garbageValue = "-38"
	)
	public static boolean method1133(int var0, class529 var1) {
		return (var0 & var1.rsOrdinal()) != 0; // L: 11
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	static final void method1137() {
		SecureRandomCallable.method2319("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 113
	} // L: 114

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-66317546"
	)
	public static void method1129() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 182
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 183
		HitSplatDefinition.field2088.clear(); // L: 184
	} // L: 185

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	static final void method1134() {
		DevicePcmPlayerProvider.method287(false); // L: 6060
		Client.field594 = 0; // L: 6061
		boolean var0 = true; // L: 6062

		int var1;
		for (var1 = 0; var1 < Player.field1163.length; ++var1) { // L: 6063
			if (class318.field3461[var1] != -1 && Player.field1163[var1] == null) { // L: 6064 6065
				Player.field1163[var1] = JagexCache.field2336.takeFile(class318.field3461[var1], 0); // L: 6066
				if (Player.field1163[var1] == null) { // L: 6067
					var0 = false; // L: 6068
					++Client.field594; // L: 6069
				}
			}

			if (class146.field1675[var1] != -1 && HorizontalAlignment.field1952[var1] == null) { // L: 6073 6074
				HorizontalAlignment.field1952[var1] = JagexCache.field2336.takeFileEncrypted(class146.field1675[var1], 0, FriendLoginUpdate.field4752[var1]); // L: 6075
				if (HorizontalAlignment.field1952[var1] == null) { // L: 6076
					var0 = false; // L: 6077
					++Client.field594; // L: 6078
				}
			}
		}

		if (!var0) { // L: 6083
			Client.field598 = 1; // L: 6084
		} else {
			Client.field621 = 0; // L: 6087
			var0 = true; // L: 6088

			int var3;
			int var4;
			for (var1 = 0; var1 < Player.field1163.length; ++var1) { // L: 6089
				byte[] var17 = HorizontalAlignment.field1952[var1]; // L: 6090
				if (var17 != null) { // L: 6091
					var3 = (class13.field63[var1] >> 8) * 64 - Projectile.baseX * 64; // L: 6092
					var4 = (class13.field63[var1] & 255) * 64 - GameEngine.baseY * 8; // L: 6093
					if (Client.isInInstance) { // L: 6094
						var3 = 10; // L: 6095
						var4 = 10; // L: 6096
					}

					var0 &= class127.method2999(var17, var3, var4); // L: 6098
				}
			}

			if (!var0) { // L: 6101
				Client.field598 = 2; // L: 6102
			} else {
				if (Client.field598 != 0) { // L: 6105
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class190.method3774(); // L: 6106
				Actor.scene.clear(); // L: 6107

				for (var1 = 0; var1 < 4; ++var1) { // L: 6108
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6109
					for (var2 = 0; var2 < 104; ++var2) { // L: 6110
						for (var3 = 0; var3 < 104; ++var3) { // L: 6111
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6112
						}
					}
				}

				class190.method3774(); // L: 6116
				GameEngine.method605(); // L: 6117
				var1 = Player.field1163.length; // L: 6118
				InterfaceParent.method2350(); // L: 6119
				DevicePcmPlayerProvider.method287(true); // L: 6120
				int var5;
				if (!Client.isInInstance) { // L: 6121
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6122
						var3 = (class13.field63[var2] >> 8) * 64 - Projectile.baseX * 64; // L: 6123
						var4 = (class13.field63[var2] & 255) * 64 - GameEngine.baseY * 8; // L: 6124
						var16 = Player.field1163[var2]; // L: 6125
						if (var16 != null) { // L: 6126
							class190.method3774(); // L: 6127
							class482.method8782(var16, var3, var4, class378.field4434 * 8 - 48, class317.field3456 * 8 - 48, Client.collisionMaps); // L: 6128
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6131
						var3 = (class13.field63[var2] >> 8) * 64 - Projectile.baseX * 64; // L: 6132
						var4 = (class13.field63[var2] & 255) * 64 - GameEngine.baseY * 8; // L: 6133
						var16 = Player.field1163[var2]; // L: 6134
						if (var16 == null && class317.field3456 < 800) { // L: 6135
							class190.method3774(); // L: 6136
							Login.method2200(var3, var4, 64, 64); // L: 6137
						}
					}

					DevicePcmPlayerProvider.method287(true); // L: 6140

					for (var2 = 0; var2 < var1; ++var2) { // L: 6141
						byte[] var15 = HorizontalAlignment.field1952[var2]; // L: 6142
						if (var15 != null) { // L: 6143
							var4 = (class13.field63[var2] >> 8) * 64 - Projectile.baseX * 64; // L: 6144
							var5 = (class13.field63[var2] & 255) * 64 - GameEngine.baseY * 8; // L: 6145
							class190.method3774(); // L: 6146
							VarcInt.method3606(var15, var4, var5, Actor.scene, Client.collisionMaps); // L: 6147
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6151
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6152
						class190.method3774(); // L: 6153

						for (var3 = 0; var3 < 13; ++var3) { // L: 6154
							for (var4 = 0; var4 < 13; ++var4) { // L: 6155
								boolean var18 = false; // L: 6156
								var6 = Client.field830[var2][var3][var4]; // L: 6157
								if (var6 != -1) { // L: 6158
									var7 = var6 >> 24 & 3; // L: 6159
									var8 = var6 >> 1 & 3; // L: 6160
									var9 = var6 >> 14 & 1023; // L: 6161
									var10 = var6 >> 3 & 2047; // L: 6162
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6163

									for (int var12 = 0; var12 < class13.field63.length; ++var12) { // L: 6164
										if (class13.field63[var12] == var11 && Player.field1163[var12] != null) { // L: 6165
											int var13 = (var9 - var3) * 8; // L: 6166
											int var14 = (var10 - var4) * 8; // L: 6167
											class20.method269(Player.field1163[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6168
											var18 = true; // L: 6169
											break;
										}
									}
								}

								if (!var18) { // L: 6174
									class33.method454(var2, var3 * 8, var4 * 8); // L: 6175
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6180
						for (var3 = 0; var3 < 13; ++var3) { // L: 6181
							var4 = Client.field830[0][var2][var3]; // L: 6182
							if (var4 == -1) { // L: 6183
								Login.method2200(var2 * 8, var3 * 8, 8, 8); // L: 6184
							}
						}
					}

					DevicePcmPlayerProvider.method287(true); // L: 6188

					for (var2 = 0; var2 < 4; ++var2) { // L: 6189
						class190.method3774(); // L: 6190

						for (var3 = 0; var3 < 13; ++var3) { // L: 6191
							for (var4 = 0; var4 < 13; ++var4) { // L: 6192
								var5 = Client.field830[var2][var3][var4]; // L: 6193
								if (var5 != -1) { // L: 6194
									var6 = var5 >> 24 & 3; // L: 6195
									var7 = var5 >> 1 & 3; // L: 6196
									var8 = var5 >> 14 & 1023; // L: 6197
									var9 = var5 >> 3 & 2047; // L: 6198
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6199

									for (var11 = 0; var11 < class13.field63.length; ++var11) { // L: 6200
										if (class13.field63[var11] == var10 && HorizontalAlignment.field1952[var11] != null) { // L: 6201
											Tiles.method2285(HorizontalAlignment.field1952[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Actor.scene, Client.collisionMaps); // L: 6202
											break; // L: 6203
										}
									}
								}
							}
						}
					}
				}

				DevicePcmPlayerProvider.method287(true); // L: 6211
				class190.method3774(); // L: 6212
				class53.method1069(Actor.scene, Client.collisionMaps); // L: 6213
				DevicePcmPlayerProvider.method287(true); // L: 6214
				var2 = Tiles.Tiles_minPlane; // L: 6215
				if (var2 > class473.Client_plane) { // L: 6216
					var2 = class473.Client_plane;
				}

				if (var2 < class473.Client_plane - 1) { // L: 6217
					var2 = class473.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6218
					Actor.scene.init(Tiles.Tiles_minPlane);
				} else {
					Actor.scene.init(0); // L: 6219
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6220
					for (var4 = 0; var4 < 104; ++var4) { // L: 6221
						class73.method2117(class473.Client_plane, var3, var4); // L: 6222
					}
				}

				class190.method3774(); // L: 6225
				CollisionMap.method4503(); // L: 6226
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6227
				PacketBufferNode var19;
				if (class193.client.hasFrame()) { // L: 6228
					var19 = ViewportMouse.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 6230
					var19.packetBuffer.writeInt(1057001181); // L: 6231
					Client.packetWriter.addNode(var19); // L: 6232
				}

				if (!Client.isInInstance) { // L: 6234
					var3 = (class378.field4434 - 6) / 8; // L: 6235
					var4 = (class378.field4434 + 6) / 8; // L: 6236
					var5 = (class317.field3456 - 6) / 8; // L: 6237
					var6 = (class317.field3456 + 6) / 8; // L: 6238

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6239
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6240
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6241
								JagexCache.field2336.loadRegionFromName("m" + var7 + "_" + var8); // L: 6242
								JagexCache.field2336.loadRegionFromName("l" + var7 + "_" + var8); // L: 6243
							}
						}
					}
				}

				Interpreter.method2106(30); // L: 6247
				class190.method3774(); // L: 6248
				MouseRecorder.method2366(); // L: 6249
				var19 = ViewportMouse.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher); // L: 6250
				Client.packetWriter.addNode(var19); // L: 6251
				class321.method6145(); // L: 6252
			}
		}
	} // L: 6085 6103 6253

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711332225"
	)
	static final void method1135() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8649 8650 8669
			if (var0.hitpoints > 0) { // L: 8651
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) { // L: 8652
				if (var0.objectId < 0 || class237.method4615(var0.objectId, var0.field1196)) { // L: 8653
					class439.method8189(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1197, var0.field1196, var0.field1203); // L: 8654
					var0.remove(); // L: 8655
				}
			} else {
				if (var0.delay > 0) { // L: 8659
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.field1198 < 0 || class237.method4615(var0.field1198, var0.field1191))) { // L: 8660 8661
					class439.method8189(var0.plane, var0.type, var0.x, var0.y, var0.field1198, var0.field1199, var0.field1191, var0.field1203); // L: 8662
					var0.delay = -1; // L: 8663
					if (var0.field1198 == var0.objectId && var0.objectId == -1) { // L: 8664
						var0.remove();
					} else if (var0.objectId == var0.field1198 && var0.field1197 == var0.field1199 && var0.field1191 == var0.field1196) {
						var0.remove(); // L: 8665
					}
				}
			}
		}

	} // L: 8671
}
