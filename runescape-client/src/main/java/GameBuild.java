import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("o")
	@Export("name")
	public final String name;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1492187841
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)V",
		garbageValue = "-1245191259"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		int var4;
		int var6;
		byte[] var10000;
		int var19;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var19 = Players.Players_indices[var4];
			if ((Players.field1244[var19] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1244;
					var10000[var19] = (byte)(var10000[var19] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = DynamicObject.method1998(var0);
						var10000 = Players.field1244;
						var10000[var19] = (byte)(var10000[var19] | 2);
					} else {
						Projectile.readPlayerUpdate(var0, var19);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var19 = Players.Players_indices[var4];
				if ((Players.field1244[var19] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1244;
						var10000[var19] = (byte)(var10000[var19] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = DynamicObject.method1998(var0);
							var10000 = Players.field1244;
							var10000[var19] = (byte)(var10000[var19] | 2);
						} else {
							Projectile.readPlayerUpdate(var0, var19);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var19 = Players.Players_emptyIndices[var4];
					if ((Players.field1244[var19] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1244;
							var10000[var19] = (byte)(var10000[var19] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = DynamicObject.method1998(var0);
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							} else if (WorldMapData_0.updateExternalPlayer(var0, var19)) {
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var19 = Players.Players_emptyIndices[var4];
						if ((Players.field1244[var19] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1244;
								var10000[var19] = (byte)(var10000[var19] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = DynamicObject.method1998(var0);
									var10000 = Players.field1244;
									var10000[var19] = (byte)(var10000[var19] | 2);
								} else if (WorldMapData_0.updateExternalPlayer(var0, var19)) {
									var10000 = Players.field1244;
									var10000[var19] = (byte)(var10000[var19] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1244;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
							var4 = Players.Players_pendingUpdateIndices[var3];
							var5 = Client.players[var4];
							var6 = var0.readUnsignedByte();
							if ((var6 & 128) != 0) {
								var6 += var0.readUnsignedByte() << 8;
							}

							byte var7 = -1;
							if ((var6 & 4) != 0) {
								var5.targetIndex = var0.method7120();
								if (var5.targetIndex == 65535) {
									var5.targetIndex = -1;
								}
							}

							if ((var6 & 32) != 0) {
								var5.field1112 = var0.method7120();
								if (var5.pathLength == 0) {
									var5.orientation = var5.field1112;
									var5.field1112 = -1;
								}
							}

							int var8;
							int var11;
							int var12;
							int var15;
							if ((var6 & 16) != 0) {
								var8 = var0.method7120();
								PlayerType var9 = (PlayerType)UserComparator4.findEnumerated(VarbitComposition.PlayerType_values(), var0.method6996());
								boolean var10 = var0.readUnsignedByte() == 1;
								var11 = var0.readUnsignedByte();
								var12 = var0.offset;
								if (var5.username != null && var5.appearance != null) {
									boolean var13 = false;
									if (var9.isUser && class112.friendSystem.isIgnored(var5.username)) {
										var13 = true;
									}

									if (!var13 && Client.field539 == 0 && !var5.isHidden) {
										Players.field1240.offset = 0;
										var0.method7017(Players.field1240.array, 0, var11);
										Players.field1240.offset = 0;
										String var14 = AbstractFont.escapeBrackets(class19.method277(MilliClock.method2955(Players.field1240)));
										var5.overheadText = var14.trim();
										var5.overheadTextColor = var8 >> 8;
										var5.overheadTextEffect = var8 & 255;
										var5.overheadTextCyclesRemaining = 150;
										var5.isAutoChatting = var10;
										var5.field1099 = var5 != HealthBarDefinition.localPlayer && var9.isUser && "" != Client.field692 && var14.toLowerCase().indexOf(Client.field692) == -1;
										if (var9.isPrivileged) {
											var15 = var10 ? 91 : 1;
										} else {
											var15 = var10 ? 90 : 2;
										}

										if (var9.modIcon != -1) {
											class397.addGameMessage(var15, SpriteMask.method4998(var9.modIcon) + var5.username.getName(), var14);
										} else {
											class397.addGameMessage(var15, var5.username.getName(), var14);
										}
									}
								}

								var0.offset = var11 + var12;
							}

							if ((var6 & 64) != 0) {
								var5.overheadText = var0.readStringCp1252NullTerminated();
								if (var5.overheadText.charAt(0) == '~') {
									var5.overheadText = var5.overheadText.substring(1);
									class397.addGameMessage(2, var5.username.getName(), var5.overheadText);
								} else if (var5 == HealthBarDefinition.localPlayer) {
									class397.addGameMessage(2, var5.username.getName(), var5.overheadText);
								}

								var5.isAutoChatting = false;
								var5.overheadTextColor = 0;
								var5.overheadTextEffect = 0;
								var5.overheadTextCyclesRemaining = 150;
							}

							if ((var6 & 1) != 0) {
								var8 = var0.readUnsignedByte();
								byte[] var20 = new byte[var8];
								Buffer var16 = new Buffer(var20);
								var0.method7131(var20, 0, var8);
								Players.field1242[var4] = var16;
								var5.read(var16);
							}

							if ((var6 & 1024) != 0) {
								for (var8 = 0; var8 < 3; ++var8) {
									var5.actions[var8] = var0.readStringCp1252NullTerminated();
								}
							}

							int var17;
							if ((var6 & 8) != 0) {
								var8 = var0.method7120();
								if (var8 == 65535) {
									var8 = -1;
								}

								var17 = var0.method6996();
								FaceNormal.performPlayerAnimation(var5, var8, var17);
							}

							if ((var6 & 512) != 0) {
								var5.field1083 = var0.method6973();
								var5.field1100 = var0.readByte();
								var5.field1128 = var0.readByte();
								var5.field1130 = var0.readByte();
								var5.field1131 = var0.method7004() + Client.cycle;
								var5.field1132 = var0.method7120() + Client.cycle;
								var5.field1133 = var0.readUnsignedShort();
								if (var5.field1067) {
									var5.field1083 += var5.tileX;
									var5.field1100 += var5.tileY;
									var5.field1128 += var5.tileX;
									var5.field1130 += var5.tileY;
									var5.pathLength = 0;
								} else {
									var5.field1083 += var5.pathX[0];
									var5.field1100 += var5.pathY[0];
									var5.field1128 += var5.pathX[0];
									var5.field1130 += var5.pathY[0];
									var5.pathLength = 1;
								}

								var5.field1144 = 0;
							}

							if ((var6 & 4096) != 0) {
								var7 = var0.method6999();
							}

							if ((var6 & 256) != 0) {
								var5.spotAnimation = var0.method7004();
								var8 = var0.readInt();
								var5.field1126 = var8 >> 16;
								var5.field1125 = (var8 & 65535) + Client.cycle;
								var5.spotAnimationFrame = 0;
								var5.spotAnimationFrameCycle = 0;
								if (var5.field1125 > Client.cycle) {
									var5.spotAnimationFrame = -1;
								}

								if (var5.spotAnimation == 65535) {
									var5.spotAnimation = -1;
								}
							}

							if ((var6 & 2048) != 0) {
								Players.field1241[var4] = var0.method6999();
							}

							if ((var6 & 2) != 0) {
								var8 = var0.method6997();
								int var18;
								int var21;
								int var23;
								if (var8 > 0) {
									for (var17 = 0; var17 < var8; ++var17) {
										var11 = -1;
										var12 = -1;
										var23 = -1;
										var21 = var0.readUShortSmart();
										if (var21 == 32767) {
											var21 = var0.readUShortSmart();
											var12 = var0.readUShortSmart();
											var11 = var0.readUShortSmart();
											var23 = var0.readUShortSmart();
										} else if (var21 != 32766) {
											var12 = var0.readUShortSmart();
										} else {
											var21 = -1;
										}

										var18 = var0.readUShortSmart();
										var5.addHitSplat(var21, var12, var11, var23, Client.cycle, var18);
									}
								}

								var17 = var0.method6995();
								if (var17 > 0) {
									for (var21 = 0; var21 < var17; ++var21) {
										var11 = var0.readUShortSmart();
										var12 = var0.readUShortSmart();
										if (var12 != 32767) {
											var23 = var0.readUShortSmart();
											var18 = var0.method6997();
											var15 = var12 > 0 ? var0.method6997() : var18;
											var5.addHealthBar(var11, Client.cycle, var12, var23, var18, var15);
										} else {
											var5.removeHealthBar(var11);
										}
									}
								}
							}

							if (var5.field1067) {
								if (var7 == 127) {
									var5.resetPath(var5.tileX, var5.tileY);
								} else {
									byte var22;
									if (var7 != -1) {
										var22 = var7;
									} else {
										var22 = Players.field1241[var4];
									}

									var5.method2109(var5.tileX, var5.tileY, var22);
								}
							}
						}

						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}
}
