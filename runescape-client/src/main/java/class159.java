import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class159 extends class140 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -390805345
	)
	int field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class159(class143 var1) {
		this.this$0 = var1;
		this.field1752 = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1752 = var1.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3192(this.field1752);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "872602777"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 128

		for (int var6 = 0; var6 < var5; ++var6) { // L: 129
			char var7 = var0.charAt(var6 + var1); // L: 130
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 131
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 132
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 133
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 134
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 135
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 136
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 137
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 138
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 139
			} else if (var7 == 8240) { // L: 140
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 141
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 142
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 143
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 144
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 145
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 146
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 147
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 148
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 149
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 150
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 151
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 152
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 153
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 154
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 155
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 156
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 157
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 158
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 159
			}
		}

		return var5; // L: 161
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "1"
	)
	static int method3324(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class471 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5052
			if (var0 != 7501) { // L: 5074
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5083
					Interpreter.Interpreter_intStackSize -= 3; // L: 5084
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5085
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5086
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5087
					var20 = class36.method674(var19); // L: 5088
					var7 = GameObject.method4778(var19); // L: 5089
					int var21 = Clock.method3535(var19); // L: 5090
					class472 var26 = SecureRandomCallable.method2223(var3); // L: 5091
					class470 var27 = WorldMapSection0.method5184(var20); // L: 5092
					int[] var28 = var27.field4872[var7]; // L: 5093
					int var12 = 0; // L: 5094
					int var13 = var28.length; // L: 5095
					if (var21 >= 0) { // L: 5096
						if (var21 >= var13) { // L: 5097
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5098
						}

						var12 = var21; // L: 5100
						var13 = var21 + 1; // L: 5101
					}

					Object[] var14 = var26.method8530(var7); // L: 5103
					if (var14 == null && var27.field4873 != null) { // L: 5104 5105
						var14 = var27.field4873[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5107
						for (var15 = var12; var15 < var13; ++var15) { // L: 5108
							var16 = var28[var15]; // L: 5109
							class467 var22 = class458.method8343(var16); // L: 5110
							if (var22 == class467.field4865) { // L: 5111
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ItemComposition.method3970(var16); // L: 5112
							}
						}

						return 1; // L: 5114
					} else {
						var15 = var14.length / var28.length; // L: 5116
						if (var5 >= 0 && var5 < var15) { // L: 5117
							for (var16 = var12; var16 < var13; ++var16) { // L: 5120
								int var17 = var16 + var28.length * var5; // L: 5121
								class467 var18 = class458.method8343(var28[var16]); // L: 5122
								if (var18 == class467.field4865) { // L: 5123
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5124
								}
							}

							return 1; // L: 5126
						} else {
							throw new RuntimeException(); // L: 5118
						}
					}
				} else if (var0 == 7503) { // L: 5128
					Interpreter.Interpreter_intStackSize -= 2; // L: 5129
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5130
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5131
					var5 = 0; // L: 5132
					var20 = class36.method674(var19); // L: 5133
					var7 = GameObject.method4778(var19); // L: 5134
					class472 var25 = SecureRandomCallable.method2223(var3); // L: 5135
					class470 var9 = WorldMapSection0.method5184(var20); // L: 5136
					int[] var10 = var9.field4872[var7]; // L: 5137
					Object[] var11 = var25.method8530(var7); // L: 5138
					if (var11 == null && var9.field4873 != null) { // L: 5139 5140
						var11 = var9.field4873[var7]; // L: 5141
					}

					if (var11 != null) { // L: 5144
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5145
					return 1; // L: 5146
				} else if (var0 != 7504 && var0 != 7510) { // L: 5148
					if (var0 == 7505) { // L: 5165
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5166
						class472 var24 = SecureRandomCallable.method2223(var3); // L: 5167
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field4883; // L: 5168
						return 1; // L: 5169
					} else if (var0 == 7506) { // L: 5171
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5172
						var19 = -1; // L: 5173
						if (class258.field2982 != null && var3 >= 0 && var3 < class258.field2982.size()) { // L: 5174
							var19 = (Integer)class258.field2982.get(var3); // L: 5175
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5177
						return 1; // L: 5178
					} else if (var0 != 7507 && var0 != 7509) { // L: 5180
						return 2; // L: 5207
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5181
						var4 = class135.method3074(var3); // L: 5182
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5183
						var6 = class126.method2968(var5); // L: 5184
						if (var6 == null) { // L: 5185
							throw new RuntimeException(); // L: 5186
						} else if (class36.method674(var5) != Client.field765) { // L: 5188
							throw new RuntimeException(); // L: 5189
						} else if (class258.field2982 == null && class258.field2982.isEmpty()) { // L: 5191
							throw new RuntimeException(); // L: 5192
						} else {
							var7 = Clock.method3535(var5); // L: 5194
							List var8 = var6.method8512(var4, var7); // L: 5195
							class258.field2982 = new LinkedList(class258.field2982); // L: 5196
							if (var8 != null) { // L: 5197
								class258.field2982.retainAll(var8); // L: 5198
							} else {
								class258.field2982.clear(); // L: 5201
							}

							ScriptFrame.field450 = class258.field2982.iterator(); // L: 5203
							if (var0 == 7507) { // L: 5204
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class258.field2982.size();
							}

							return 1; // L: 5205
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5149
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5150
					class471 var23 = class70.method2050(var3); // L: 5151
					if (var23 == null) { // L: 5152
						throw new RuntimeException(); // L: 5153
					} else {
						class258.field2982 = var23.method8512(0, 0); // L: 5155
						var5 = 0; // L: 5156
						if (class258.field2982 != null) { // L: 5157
							Client.field765 = var3; // L: 5158
							ScriptFrame.field450 = class258.field2982.iterator(); // L: 5159
							var5 = class258.field2982.size(); // L: 5160
						}

						if (var0 == 7504) { // L: 5162
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5163
					}
				}
			} else {
				if (ScriptFrame.field450 != null && ScriptFrame.field450.hasNext()) { // L: 5075
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)ScriptFrame.field450.next(); // L: 5076
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5079
				}

				return 1; // L: 5081
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5053
			var4 = class135.method3074(var3); // L: 5054
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5055
			var6 = class126.method2968(var5); // L: 5056
			if (var6 == null) { // L: 5057
				throw new RuntimeException(); // L: 5058
			} else {
				var7 = Clock.method3535(var5); // L: 5060
				class258.field2982 = var6.method8512(var4, var7); // L: 5061
				if (class258.field2982 != null) { // L: 5062
					Client.field765 = class36.method674(var5); // L: 5063
					ScriptFrame.field450 = class258.field2982.iterator(); // L: 5064
					if (var0 == 7500) { // L: 5065
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class258.field2982.size();
					}
				} else {
					Client.field765 = -1; // L: 5068
					ScriptFrame.field450 = null; // L: 5069
					if (var0 == 7500) { // L: 5070
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5072
			}
		}
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-284669755"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		GrandExchangeOfferNameComparator.method6553(); // L: 11670
		WorldMapSection2.method4824(); // L: 11671
		int var1 = GameEngine.VarpDefinition_get(var0).type; // L: 11672
		if (var1 != 0) { // L: 11673
			int var2 = Varps.Varps_main[var0]; // L: 11674
			if (var1 == 1) { // L: 11675
				if (var2 == 1) { // L: 11676
					class7.method54(0.9D);
				}

				if (var2 == 2) { // L: 11677
					class7.method54(0.8D);
				}

				if (var2 == 3) { // L: 11678
					class7.method54(0.7D);
				}

				if (var2 == 4) { // L: 11679
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 11680
					((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 11681
					TaskHandler.method3446(); // L: 11682
					WorldMapSectionType.clientPreferences.method2522(0.6D); // L: 11683
				}
			}

			if (var1 == 3) { // L: 11686
				if (var2 == 0) { // L: 11687
					class70.method2047(255);
				}

				if (var2 == 1) { // L: 11688
					class70.method2047(192);
				}

				if (var2 == 2) { // L: 11689
					class70.method2047(128);
				}

				if (var2 == 3) { // L: 11690
					class70.method2047(64);
				}

				if (var2 == 4) { // L: 11691
					class70.method2047(0);
				}
			}

			if (var1 == 4) { // L: 11693
				if (var2 == 0) { // L: 11694
					ApproximateRouteStrategy.method1201(127);
				}

				if (var2 == 1) { // L: 11695
					ApproximateRouteStrategy.method1201(96);
				}

				if (var2 == 2) { // L: 11696
					ApproximateRouteStrategy.method1201(64);
				}

				if (var2 == 3) { // L: 11697
					ApproximateRouteStrategy.method1201(32);
				}

				if (var2 == 4) { // L: 11698
					ApproximateRouteStrategy.method1201(0);
				}
			}

			if (var1 == 5) {
				Client.field621 = var2 == 1; // L: 11700
			}

			if (var1 == 6) { // L: 11701
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 11702
			}

			if (var1 == 10) { // L: 11703
				if (var2 == 0) { // L: 11704
					class12.method151(127);
				}

				if (var2 == 1) { // L: 11705
					class12.method151(96);
				}

				if (var2 == 2) { // L: 11706
					class12.method151(64);
				}

				if (var2 == 3) { // L: 11707
					class12.method151(32);
				}

				if (var2 == 4) { // L: 11708
					class12.method151(0);
				}
			}

			if (var1 == 17) { // L: 11710
				Client.followerIndex = var2 & 65535; // L: 11711
			}

			AttackOption[] var3;
			if (var1 == 18) { // L: 11713
				var3 = new AttackOption[]{AttackOption.field1306, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1303}; // L: 11716
				Client.playerAttackOption = (AttackOption)SpriteMask.findEnumerated(var3, var2); // L: 11718
				if (Client.playerAttackOption == null) { // L: 11719
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 11721
				if (var2 == -1) { // L: 11722
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11723
				}
			}

			if (var1 == 22) { // L: 11725
				var3 = new AttackOption[]{AttackOption.field1306, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1303}; // L: 11728
				Client.npcAttackOption = (AttackOption)SpriteMask.findEnumerated(var3, var2); // L: 11730
				if (Client.npcAttackOption == null) { // L: 11731
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11733
}
