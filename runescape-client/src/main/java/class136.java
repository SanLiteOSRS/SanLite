import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class136 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luk;IIIIIII)V",
		garbageValue = "-1443303721"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104; // L: 171
		int var8;
		if (var7) { // L: 173
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 174

			while (true) {
				var8 = var0.readUnsignedShort(); // L: 176
				if (var8 == 0) { // L: 177
					if (var1 == 0) { // L: 178
						int[] var15 = Tiles.Tiles_heights[0][var2]; // L: 179
						int var12 = var4 + 932731; // L: 182
						int var13 = var5 + 556238; // L: 183
						int var14 = class363.method6942(var12 + 45365, var13 + 91923, 4) - 128 + (class363.method6942(var12 + 10294, var13 + 37821, 2) - 128 >> 1) + (class363.method6942(var12, var13, 1) - 128 >> 2); // L: 185
						var14 = (int)((double)var14 * 0.3D) + 35; // L: 186
						if (var14 < 10) { // L: 187
							var14 = 10;
						} else if (var14 > 60) { // L: 188
							var14 = 60;
						}

						var15[var3] = -var14 * 8; // L: 191
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 193
					}
					break;
				}

				if (var8 == 1) { // L: 196
					int var9 = var0.readUnsignedByte(); // L: 197
					if (var9 == 1) { // L: 198
						var9 = 0;
					}

					if (var1 == 0) { // L: 199
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8; // L: 200
					}
					break;
				}

				if (var8 <= 49) { // L: 203
					Tiles.field1011[var1][var2][var3] = (short)var0.readShort(); // L: 204
					class141.field1628[var1][var2][var3] = (byte)((var8 - 2) / 4); // L: 205
					class208.field2278[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3); // L: 206
				} else if (var8 <= 81) { // L: 209
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49); // L: 210
				} else {
					Tiles.field1021[var1][var2][var3] = (short)(var8 - 81); // L: 213
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort(); // L: 218
				if (var8 == 0) { // L: 219
					break;
				}

				if (var8 == 1) { // L: 220
					var0.readUnsignedByte(); // L: 221
					break; // L: 222
				}

				if (var8 <= 49) { // L: 224
					var0.readShort(); // L: 225
				}
			}
		}

	} // L: 229

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "521893994"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ClientPacket.method5980(); // L: 12165
		class162.method3486(); // L: 12166
		int var1 = class128.VarpDefinition_get(var0).type; // L: 12167
		if (var1 != 0) { // L: 12168
			int var2 = Varps.Varps_main[var0]; // L: 12169
			if (var1 == 1) { // L: 12170
				if (var2 == 1) { // L: 12171
					MidiPcmStream.method6190(0.9D);
				}

				if (var2 == 2) { // L: 12172
					MidiPcmStream.method6190(0.8D);
				}

				if (var2 == 3) { // L: 12173
					MidiPcmStream.method6190(0.7D);
				}

				if (var2 == 4) { // L: 12174
					MidiPcmStream.method6190(0.6D);
				}
			}

			if (var1 == 3) { // L: 12176
				if (var2 == 0) { // L: 12177
					class401.method7500(255);
				}

				if (var2 == 1) { // L: 12178
					class401.method7500(192);
				}

				if (var2 == 2) { // L: 12179
					class401.method7500(128);
				}

				if (var2 == 3) { // L: 12180
					class401.method7500(64);
				}

				if (var2 == 4) { // L: 12181
					class401.method7500(0);
				}
			}

			if (var1 == 4) { // L: 12183
				if (var2 == 0) { // L: 12184
					Canvas.method327(127);
				}

				if (var2 == 1) { // L: 12185
					Canvas.method327(96);
				}

				if (var2 == 2) { // L: 12186
					Canvas.method327(64);
				}

				if (var2 == 3) { // L: 12187
					Canvas.method327(32);
				}

				if (var2 == 4) { // L: 12188
					Canvas.method327(0);
				}
			}

			if (var1 == 5) { // L: 12190
				Client.field645 = var2 == 1;
			}

			if (var1 == 6) { // L: 12191
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12192
			}

			if (var1 == 10) { // L: 12193
				if (var2 == 0) { // L: 12194
					class165.method3515(127);
				}

				if (var2 == 1) { // L: 12195
					class165.method3515(96);
				}

				if (var2 == 2) { // L: 12196
					class165.method3515(64);
				}

				if (var2 == 3) { // L: 12197
					class165.method3515(32);
				}

				if (var2 == 4) { // L: 12198
					class165.method3515(0);
				}
			}

			if (var1 == 17) { // L: 12200
				Client.followerIndex = var2 & 65535; // L: 12201
			}

			if (var1 == 18) { // L: 12203
				Client.playerAttackOption = (AttackOption)GrandExchangeEvents.findEnumerated(class150.method3301(), var2); // L: 12204
				if (Client.playerAttackOption == null) { // L: 12205
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12207
				if (var2 == -1) { // L: 12208
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12209
				}
			}

			if (var1 == 22) { // L: 12211
				Client.npcAttackOption = (AttackOption)GrandExchangeEvents.findEnumerated(class150.method3301(), var2); // L: 12212
				if (Client.npcAttackOption == null) { // L: 12213
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12215
}
