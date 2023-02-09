import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ao")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 87402149
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1896922469
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("j")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5; // L: 25
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D); // L: 49
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "29"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-23"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-61929497"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-1891594649"
	)
	public static long method1122(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (0L == var1 % 37L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-383062820"
	)
	static final void method1115(String var0) {
		class280.addGameMessage(30, "", var0); // L: 116
	} // L: 117

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ZI)V",
		garbageValue = "-1568414212"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5067
			var0.isUnanimated = false; // L: 5068
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5069 5070
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5072
			int var3 = var0.y >> 7; // L: 5073
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5074
				long var4 = ItemLayer.calculateTag(0, 0, 0, false, var0.index); // L: 5075
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5076
					var0.isUnanimated = false; // L: 5077
					var0.tileHeight = GrandExchangeOfferNameComparator.getTileHeight(var0.x, var0.y, class103.Client_plane); // L: 5078
					var0.playerCycle = Client.cycle; // L: 5079
					WorldMapAreaData.scene.addNullableObject(class103.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5080
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5083
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5084
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5085
					}

					var0.tileHeight = GrandExchangeOfferNameComparator.getTileHeight(var0.x, var0.y, class103.Client_plane); // L: 5087
					var0.playerCycle = Client.cycle; // L: 5088
					WorldMapAreaData.scene.drawEntity(class103.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5089
				}
			}
		}

	} // L: 5093

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljs;B)V",
		garbageValue = "0"
	)
	static final void method1123(class280 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7910
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		if (class280.field3178 == var0) { // L: 7911
			var2 = var1.method8730(); // L: 7912
			var3 = var1.readUnsignedByte(); // L: 7913
			var4 = var3 >> 2; // L: 7914
			var5 = var3 & 3; // L: 7915
			var6 = Client.field573[var4]; // L: 7916
			var7 = var1.readUnsignedByte(); // L: 7917
			var8 = (var7 >> 4 & 7) + class373.field4406; // L: 7918
			var9 = (var7 & 7) + class25.field147; // L: 7919
			if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 7920
				if (var6 == 0) { // L: 7921
					WallObject var35 = WorldMapAreaData.scene.method4478(class103.Client_plane, var8, var9); // L: 7922
					if (var35 != null) { // L: 7923
						var11 = class124.Entity_unpackID(var35.tag); // L: 7924
						if (var4 == 2) { // L: 7925
							var35.renderable1 = new DynamicObject(var11, 2, var5 + 4, class103.Client_plane, var8, var9, var2, false, var35.renderable1); // L: 7926
							var35.renderable2 = new DynamicObject(var11, 2, var5 + 1 & 3, class103.Client_plane, var8, var9, var2, false, var35.renderable2); // L: 7927
						} else {
							var35.renderable1 = new DynamicObject(var11, var4, var5, class103.Client_plane, var8, var9, var2, false, var35.renderable1); // L: 7929
						}
					}
				}

				if (var6 == 1) { // L: 7932
					DecorativeObject var44 = WorldMapAreaData.scene.method4479(class103.Client_plane, var8, var9); // L: 7933
					if (var44 != null) { // L: 7934
						var11 = class124.Entity_unpackID(var44.tag); // L: 7935
						if (var4 != 4 && var4 != 5) { // L: 7936
							if (var4 == 6) { // L: 7937
								var44.renderable1 = new DynamicObject(var11, 4, var5 + 4, class103.Client_plane, var8, var9, var2, false, var44.renderable1);
							} else if (var4 == 7) { // L: 7938
								var44.renderable1 = new DynamicObject(var11, 4, (var5 + 2 & 3) + 4, class103.Client_plane, var8, var9, var2, false, var44.renderable1);
							} else if (var4 == 8) { // L: 7939
								var44.renderable1 = new DynamicObject(var11, 4, var5 + 4, class103.Client_plane, var8, var9, var2, false, var44.renderable1); // L: 7940
								var44.renderable2 = new DynamicObject(var11, 4, (var5 + 2 & 3) + 4, class103.Client_plane, var8, var9, var2, false, var44.renderable2); // L: 7941
							}
						} else {
							var44.renderable1 = new DynamicObject(var11, 4, var5, class103.Client_plane, var8, var9, var2, false, var44.renderable1);
						}
					}
				}

				if (var6 == 2) { // L: 7945
					GameObject var45 = WorldMapAreaData.scene.getGameObject(class103.Client_plane, var8, var9); // L: 7946
					if (var4 == 11) { // L: 7947
						var4 = 10;
					}

					if (var45 != null) { // L: 7948
						var45.renderable = new DynamicObject(class124.Entity_unpackID(var45.tag), var4, var5, class103.Client_plane, var8, var9, var2, false, var45.renderable);
					}
				}

				if (var6 == 3) { // L: 7950
					GroundObject var46 = WorldMapAreaData.scene.getGroundObject(class103.Client_plane, var8, var9); // L: 7951
					if (var46 != null) { // L: 7952
						var46.renderable = new DynamicObject(class124.Entity_unpackID(var46.tag), 22, var5, class103.Client_plane, var8, var9, var2, false, var46.renderable);
					}
				}
			}

		} else {
			TileItem var43;
			if (class280.field3181 == var0) { // L: 7957
				var2 = var1.readUnsignedByte(); // L: 7958
				var3 = (var2 >> 4 & 7) + class373.field4406; // L: 7959
				var4 = (var2 & 7) + class25.field147; // L: 7960
				var5 = var1.method8676(); // L: 7961
				var1.method8676(); // L: 7962
				var1.method8714(); // L: 7963
				var6 = var1.method8730(); // L: 7964
				var7 = var1.readInt(); // L: 7965
				var1.method8676(); // L: 7966
				var1.method8730(); // L: 7967
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7968
					var43 = new TileItem(); // L: 7969
					var43.id = var6; // L: 7970
					var43.quantity = var7; // L: 7971
					var43.method2723(var5); // L: 7972
					if (Client.groundItems[class103.Client_plane][var3][var4] == null) { // L: 7973
						Client.groundItems[class103.Client_plane][var3][var4] = new NodeDeque(); // L: 7974
					}

					Client.groundItems[class103.Client_plane][var3][var4].addFirst(var43); // L: 7976
					ClientPacket.updateItemPile(var3, var4); // L: 7977
				}

			} else {
				int var10;
				if (class280.field3182 == var0) { // L: 7981
					var2 = var1.method8714(); // L: 7982
					var3 = var1.method8677(); // L: 7983
					var4 = var3 >> 4 & 15; // L: 7984
					var5 = var3 & 7; // L: 7985
					var6 = var1.method8676(); // L: 7986
					var7 = var1.method8676(); // L: 7987
					var8 = (var7 >> 4 & 7) + class373.field4406; // L: 7988
					var9 = (var7 & 7) + class25.field147; // L: 7989
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7990
						var10 = var4 + 1; // L: 7991
						if (class387.localPlayer.pathX[0] >= var8 - var10 && class387.localPlayer.pathX[0] <= var10 + var8 && class387.localPlayer.pathY[0] >= var9 - var10 && class387.localPlayer.pathY[0] <= var10 + var9 && PacketWriter.clientPreferences.method2499() != 0 && var5 > 0 && Client.soundEffectCount < 50) { // L: 7992 7993
							Client.soundEffectIds[Client.soundEffectCount] = var2; // L: 7994
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5; // L: 7995
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6; // L: 7996
							Client.soundEffects[Client.soundEffectCount] = null; // L: 7997
							Client.soundLocations[Client.soundEffectCount] = var4 + (var9 << 8) + (var8 << 16); // L: 7998
							++Client.soundEffectCount; // L: 7999
						}
					}
				}

				NodeDeque var34;
				if (class280.field3174 == var0) { // L: 8004
					var2 = var1.method8676(); // L: 8005
					var3 = (var2 >> 4 & 7) + class373.field4406; // L: 8006
					var4 = (var2 & 7) + class25.field147; // L: 8007
					var5 = var1.method8714(); // L: 8008
					var6 = var1.method8699(); // L: 8009
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8010
						var34 = Client.groundItems[class103.Client_plane][var3][var4]; // L: 8011
						if (var34 != null) { // L: 8012
							for (var43 = (TileItem)var34.last(); var43 != null; var43 = (TileItem)var34.previous()) { // L: 8013 8014 8019
								if ((var5 & 32767) == var43.id && var6 == var43.quantity) { // L: 8015
									var43.remove(); // L: 8016
									break;
								}
							}

							if (var34.last() == null) { // L: 8021
								Client.groundItems[class103.Client_plane][var3][var4] = null;
							}

							ClientPacket.updateItemPile(var3, var4); // L: 8022
						}
					}

				} else if (class280.field3171 == var0) { // L: 8027
					var2 = var1.readUnsignedByte(); // L: 8028
					var3 = (var2 >> 4 & 7) + class373.field4406; // L: 8029
					var4 = (var2 & 7) + class25.field147; // L: 8030
					var5 = var1.method8678(); // L: 8031
					var6 = var5 >> 2; // L: 8032
					var7 = var5 & 3; // L: 8033
					var8 = Client.field573[var6]; // L: 8034
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8035
						class179.method3571(class103.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8036
					}

				} else if (class280.field3176 == var0) { // L: 8040
					var2 = var1.method8676(); // L: 8041
					var3 = var1.method8714(); // L: 8042
					var4 = var1.method8677(); // L: 8043
					var5 = (var4 >> 4 & 7) + class373.field4406; // L: 8044
					var6 = (var4 & 7) + class25.field147; // L: 8045
					var7 = var1.readUnsignedByte(); // L: 8046
					var8 = var7 >> 2; // L: 8047
					var9 = var7 & 3; // L: 8048
					var10 = Client.field573[var8]; // L: 8049
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8050
						class179.method3571(class103.Client_plane, var5, var6, var10, var3, var8, var9, var2, 0, -1); // L: 8051
					}

				} else {
					NodeDeque var31;
					TileItem var33;
					if (class280.field3175 == var0) { // L: 8055
						var2 = var1.method8714(); // L: 8056
						var3 = var1.method8719(); // L: 8057
						var4 = var1.method8719(); // L: 8058
						var5 = var1.method8676(); // L: 8059
						var6 = (var5 >> 4 & 7) + class373.field4406; // L: 8060
						var7 = (var5 & 7) + class25.field147; // L: 8061
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 8062
							var31 = Client.groundItems[class103.Client_plane][var6][var7]; // L: 8063
							if (var31 != null) { // L: 8064
								for (var33 = (TileItem)var31.last(); var33 != null; var33 = (TileItem)var31.previous()) { // L: 8065 8066 8071
									if ((var3 & 32767) == var33.id && var4 == var33.quantity) { // L: 8067
										var33.quantity = var2; // L: 8068
										break;
									}
								}

								ClientPacket.updateItemPile(var6, var7); // L: 8073
							}
						}

					} else if (class280.field3180 == var0) { // L: 8078
						var2 = var1.readUnsignedByte(); // L: 8079
						var3 = (var2 >> 4 & 7) + class373.field4406; // L: 8080
						var4 = (var2 & 7) + class25.field147; // L: 8081
						var5 = var1.method8676(); // L: 8082
						var6 = var1.readUnsignedShort(); // L: 8083
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8084
							var34 = Client.groundItems[class103.Client_plane][var3][var4]; // L: 8085
							if (var34 != null) { // L: 8086
								for (var43 = (TileItem)var34.last(); var43 != null; var43 = (TileItem)var34.previous()) { // L: 8087 8088 8093
									if ((var6 & 32767) == var43.id) { // L: 8089
										var43.method2723(var5); // L: 8090
										break;
									}
								}
							}
						}

					} else {
						int var12;
						int var13;
						int var14;
						byte var39;
						if (class280.field3172 == var0) { // L: 8099
							var2 = var1.readUnsignedShort(); // L: 8100
							byte var36 = var1.readByte(); // L: 8101
							byte var37 = var1.method8786(); // L: 8102
							var5 = var1.method8730(); // L: 8103
							var6 = var1.method8676(); // L: 8104
							var7 = var6 >> 2; // L: 8105
							var8 = var6 & 3; // L: 8106
							var9 = Client.field573[var7]; // L: 8107
							var39 = var1.readByte(); // L: 8108
							var11 = var1.readUnsignedShort(); // L: 8109
							var12 = var1.method8678(); // L: 8110
							var13 = (var12 >> 4 & 7) + class373.field4406; // L: 8111
							var14 = (var12 & 7) + class25.field147; // L: 8112
							int var15 = var1.method8730(); // L: 8113
							byte var16 = var1.method8679(); // L: 8114
							Player var17;
							if (var15 == Client.localPlayerIndex) { // L: 8116
								var17 = class387.localPlayer;
							} else {
								var17 = Client.players[var15]; // L: 8117
							}

							if (var17 != null) { // L: 8118
								ObjectComposition var18 = class463.getObjectDefinition(var2); // L: 8119
								int var19;
								int var20;
								if (var8 != 1 && var8 != 3) { // L: 8122
									var19 = var18.sizeX; // L: 8127
									var20 = var18.sizeY; // L: 8128
								} else {
									var19 = var18.sizeY; // L: 8123
									var20 = var18.sizeX; // L: 8124
								}

								int var21 = var13 + (var19 >> 1); // L: 8130
								int var22 = var13 + (var19 + 1 >> 1); // L: 8131
								int var23 = var14 + (var20 >> 1); // L: 8132
								int var24 = var14 + (var20 + 1 >> 1); // L: 8133
								int[][] var25 = Tiles.Tiles_heights[class103.Client_plane]; // L: 8134
								int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2; // L: 8135
								int var27 = (var13 << 7) + (var19 << 6); // L: 8136
								int var28 = (var14 << 7) + (var20 << 6); // L: 8137
								Model var29 = var18.getModel(var7, var8, var25, var27, var26, var28); // L: 8138
								if (var29 != null) { // L: 8139
									class179.method3571(class103.Client_plane, var13, var14, var9, -1, 0, 0, 31, var5 + 1, var11 + 1); // L: 8140
									var17.animationCycleStart = var5 + Client.cycle; // L: 8141
									var17.animationCycleEnd = var11 + Client.cycle; // L: 8142
									var17.model0 = var29; // L: 8143
									var17.field1117 = var13 * 128 + var19 * 64; // L: 8144
									var17.field1123 = var14 * 128 + var20 * 64; // L: 8145
									var17.tileHeight2 = var26; // L: 8146
									byte var30;
									if (var39 > var16) { // L: 8147
										var30 = var39; // L: 8148
										var39 = var16; // L: 8149
										var16 = var30; // L: 8150
									}

									if (var36 > var37) { // L: 8152
										var30 = var36; // L: 8153
										var36 = var37; // L: 8154
										var37 = var30; // L: 8155
									}

									var17.minX = var39 + var13; // L: 8157
									var17.maxX = var13 + var16; // L: 8158
									var17.minY = var36 + var14; // L: 8159
									var17.maxY = var37 + var14; // L: 8160
								}
							}
						}

						if (class280.field3177 != var0) { // L: 8164
							Projectile var32;
							if (class280.field3173 == var0) { // L: 8187
								var2 = var1.method8719(); // L: 8188
								var3 = var1.readUnsignedByte(); // L: 8189
								var4 = var1.method8694(); // L: 8190
								var5 = var1.method8678(); // L: 8191
								var6 = var1.method8676() * 4; // L: 8192
								var7 = var1.method8677() * 4; // L: 8193
								var8 = var1.method8730(); // L: 8194
								var9 = var1.method8730(); // L: 8195
								var39 = var1.method8786(); // L: 8196
								byte var40 = var1.method8875(); // L: 8197
								var12 = var1.method8677(); // L: 8198
								var13 = (var12 >> 4 & 7) + class373.field4406; // L: 8199
								var14 = (var12 & 7) + class25.field147; // L: 8200
								var11 = var40 + var13; // L: 8201
								var10 = var39 + var14; // L: 8202
								if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && var11 >= 0 && var10 >= 0 && var11 < 104 && var10 < 104 && var2 != 65535) { // L: 8203
									var13 = var13 * 128 + 64; // L: 8204
									var14 = var14 * 128 + 64; // L: 8205
									var11 = var11 * 128 + 64; // L: 8206
									var10 = var10 * 128 + 64; // L: 8207
									var32 = new Projectile(var2, class103.Client_plane, var13, var14, GrandExchangeOfferNameComparator.getTileHeight(var13, var14, class103.Client_plane) - var7, var8 + Client.cycle, var9 + Client.cycle, var3, var5, var4, var6); // L: 8208
									var32.setDestination(var11, var10, GrandExchangeOfferNameComparator.getTileHeight(var11, var10, class103.Client_plane) - var6, var8 + Client.cycle); // L: 8209
									Client.projectiles.addFirst(var32); // L: 8210
								}

							} else if (class280.field3179 == var0) { // L: 8214
								var2 = var1.readUnsignedByte(); // L: 8215
								var3 = var1.method8678(); // L: 8216
								var4 = (var3 >> 4 & 7) + class373.field4406; // L: 8217
								var5 = (var3 & 7) + class25.field147; // L: 8218
								var6 = var1.method8730(); // L: 8219
								var7 = var1.readUnsignedByte(); // L: 8220
								byte var38 = var1.method8679(); // L: 8221
								var9 = var1.method8719(); // L: 8222
								var10 = var1.method8677() * 4; // L: 8223
								var11 = var1.method8689(); // L: 8224
								var12 = var1.method8676() * 4; // L: 8225
								var13 = var1.method8714(); // L: 8226
								byte var41 = var1.method8875(); // L: 8227
								var14 = var41 + var4; // L: 8228
								var8 = var38 + var5; // L: 8229
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var14 >= 0 && var8 >= 0 && var14 < 104 && var8 < 104 && var6 != 65535) { // L: 8230
									var4 = var4 * 128 + 64; // L: 8231
									var5 = var5 * 128 + 64; // L: 8232
									var14 = var14 * 128 + 64; // L: 8233
									var8 = var8 * 128 + 64; // L: 8234
									var32 = new Projectile(var6, class103.Client_plane, var4, var5, GrandExchangeOfferNameComparator.getTileHeight(var4, var5, class103.Client_plane) - var12, var9 + Client.cycle, var13 + Client.cycle, var2, var7, var11, var10); // L: 8235
									var32.setDestination(var14, var8, GrandExchangeOfferNameComparator.getTileHeight(var14, var8, class103.Client_plane) - var10, var9 + Client.cycle); // L: 8236
									Client.projectiles.addFirst(var32); // L: 8237
								}

							} else if (class280.field3183 == var0) { // L: 8241
								var2 = var1.method8677(); // L: 8242
								var3 = (var2 >> 4 & 7) + class373.field4406; // L: 8243
								var4 = (var2 & 7) + class25.field147; // L: 8244
								var5 = var1.method8719(); // L: 8245
								var6 = var1.method8678(); // L: 8246
								var7 = var1.readUnsignedShort(); // L: 8247
								if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8248
									var3 = var3 * 128 + 64; // L: 8249
									var4 = var4 * 128 + 64; // L: 8250
									GraphicsObject var42 = new GraphicsObject(var7, class103.Client_plane, var3, var4, GrandExchangeOfferNameComparator.getTileHeight(var3, var4, class103.Client_plane) - var6, var5, Client.cycle); // L: 8251
									Client.graphicsObjects.addFirst(var42); // L: 8252
								}

							}
						} else {
							var2 = var1.method8719(); // L: 8165
							var3 = var1.method8698(); // L: 8166
							var4 = var1.method8699(); // L: 8167
							var5 = var1.readUnsignedByte(); // L: 8168
							var6 = (var5 >> 4 & 7) + class373.field4406; // L: 8169
							var7 = (var5 & 7) + class25.field147; // L: 8170
							if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) { // L: 8171
								var31 = Client.groundItems[class103.Client_plane][var6][var7]; // L: 8172
								if (var31 != null) { // L: 8173
									for (var33 = (TileItem)var31.last(); var33 != null; var33 = (TileItem)var31.previous()) { // L: 8174 8175 8180
										if ((var2 & 32767) == var33.id && var3 == var33.quantity) { // L: 8176
											var33.quantity = var4; // L: 8177
											break;
										}
									}

									ClientPacket.updateItemPile(var6, var7); // L: 8182
								}
							}

						}
					}
				}
			}
		}
	} // L: 7955 7979 8025 8038 8053 8076 8097 8185 8212 8239 8254 8256
}
