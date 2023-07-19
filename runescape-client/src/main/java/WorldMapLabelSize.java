import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1938250909
	)
	final int field2872;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2098424945
	)
	final int field2869;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1808667427
	)
	final int field2874;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2872 = var1; // L: 19
		this.field2869 = var2; // L: 20
		this.field2874 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "8"
	)
	boolean method5137(float var1) {
		return var1 >= (float)this.field2874; // L: 25
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljl;",
		garbageValue = "-1573465084"
	)
	static WorldMapLabelSize[] method5144() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium}; // L: 15
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIS)V",
		garbageValue = "1048"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3916
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3917
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3918
				if (var3 == null) { // L: 3919
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3920
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3921
				if (var3.contains(var4, var5)) { // L: 3922
					var4 -= var3.width / 2; // L: 3923
					var5 -= var3.height / 2; // L: 3924
					int var6 = Client.camAngleY & 2047; // L: 3925
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3926
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3927
					int var9 = var7 * var5 + var8 * var4 >> 11; // L: 3928
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 3929
					int var11 = var9 + class27.localPlayer.x >> 7; // L: 3930
					int var12 = class27.localPlayer.y - var10 >> 7; // L: 3931
					PacketBufferNode var13 = class217.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 3933
					var13.packetBuffer.writeByte(18); // L: 3934
					var13.packetBuffer.writeShort(class166.baseX * 64 + var11); // L: 3935
					var13.packetBuffer.method9087(Client.field519.method4285(82) ? (Client.field519.method4285(81) ? 2 : 1) : 0); // L: 3936
					var13.packetBuffer.method9096(class9.baseY * 64 + var12); // L: 3937
					var13.packetBuffer.writeByte(var4); // L: 3938
					var13.packetBuffer.writeByte(var5); // L: 3939
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3940
					var13.packetBuffer.writeByte(57); // L: 3941
					var13.packetBuffer.writeByte(0); // L: 3942
					var13.packetBuffer.writeByte(0); // L: 3943
					var13.packetBuffer.writeByte(89); // L: 3944
					var13.packetBuffer.writeShort(class27.localPlayer.x); // L: 3945
					var13.packetBuffer.writeShort(class27.localPlayer.y); // L: 3946
					var13.packetBuffer.writeByte(63); // L: 3947
					Client.packetWriter.addNode(var13); // L: 3948
					Client.destinationX = var11; // L: 3949
					Client.destinationY = var12; // L: 3950
				}
			}

		}
	} // L: 3953

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "297445401"
	)
	static boolean method5139() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5267
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lme;II)I",
		garbageValue = "1070042143"
	)
	static final int method5145(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11193
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11195
				int var3 = 0; // L: 11196
				int var4 = 0; // L: 11197
				byte var5 = 0; // L: 11198

				while (true) {
					int var6 = var2[var4++]; // L: 11200
					int var7 = 0; // L: 11201
					byte var8 = 0; // L: 11202
					if (var6 == 0) { // L: 11203
						return var3;
					}

					if (var6 == 1) { // L: 11204
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11205
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11206
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11207
						var9 = var2[var4++] << 16; // L: 11208
						var9 += var2[var4++]; // L: 11209
						var10 = Interpreter.getWidget(var9); // L: 11210
						var11 = var2[var4++]; // L: 11211
						if (var11 != -1 && (!class141.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11212
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11213
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11214
									var7 += var10.field3765[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11218
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11219
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11220
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11221
						var7 = class27.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11222
						for (var9 = 0; var9 < 25; ++var9) { // L: 11223
							if (Skills.Skills_enabled[var9]) { // L: 11224
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11227
						var9 = var2[var4++] << 16; // L: 11228
						var9 += var2[var4++]; // L: 11229
						var10 = Interpreter.getWidget(var9); // L: 11230
						var11 = var2[var4++]; // L: 11231
						if (var11 != -1 && (!class141.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11232
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11233
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11234
									var7 = 999999999; // L: 11235
									break; // L: 11236
								}
							}
						}
					}

					if (var6 == 11) { // L: 11241
						var7 = Client.field723;
					}

					if (var6 == 12) { // L: 11242
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11243
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11244
						int var13 = var2[var4++]; // L: 11245
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11246
					}

					if (var6 == 14) { // L: 11248
						var9 = var2[var4++]; // L: 11249
						var7 = GrandExchangeOfferOwnWorldComparator.getVarbit(var9); // L: 11250
					}

					if (var6 == 15) { // L: 11252
						var8 = 1;
					}

					if (var6 == 16) { // L: 11253
						var8 = 2;
					}

					if (var6 == 17) { // L: 11254
						var8 = 3;
					}

					if (var6 == 18) { // L: 11255
						var7 = class166.baseX * 64 + (class27.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11256
						var7 = class9.baseY * 64 + (class27.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11257
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11258
						if (var5 == 0) { // L: 11259
							var3 += var7;
						}

						if (var5 == 1) { // L: 11260
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11261
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11262
							var3 *= var7;
						}

						var5 = 0; // L: 11263
					} else {
						var5 = var8; // L: 11265
					}
				}
			} catch (Exception var14) { // L: 11268
				return -1; // L: 11269
			}
		} else {
			return -2;
		}
	}
}
