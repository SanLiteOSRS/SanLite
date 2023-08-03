import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
public class class47 {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	VorbisSample field358;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	RawSound field354;
	@ObfuscatedName("ar")
	ReentrantLock field355;

	@ObfuscatedSignature(
		descriptor = "(Lcz;Lbi;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field358 = var1; // L: 11
		this.field354 = var2; // L: 12
		this.field355 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2017715384"
	)
	static int method879(int var0, Script var1, boolean var2) {
		Widget var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1662
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1663
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1664
			return 1; // L: 1665
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1667
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1668
			return 1; // L: 1669
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1671
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1672
			return 1; // L: 1673
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1675
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1676
			return 1; // L: 1677
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1679
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1680
			return 1; // L: 1681
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1683
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1684
			return 1; // L: 1685
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1687
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1688
			return 1; // L: 1689
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1691
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1692
			return 1; // L: 1693
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1695
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1696
			return 1; // L: 1697
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1699
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1700
			return 1; // L: 1701
		} else if (var0 == 2610) { // L: 1703
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1704
			return 1; // L: 1705
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1707
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1708
			return 1; // L: 1709
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1711
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1712
			return 1; // L: 1713
		} else if (var0 == 2613) { // L: 1715
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1716
			return 1; // L: 1717
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1719
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1720
			return 1; // L: 1721
		} else {
			class325 var4;
			if (var0 == 2617) { // L: 1723
				var4 = var3.method6469(); // L: 1724
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3539 : 0; // L: 1725
			}

			if (var0 == 2618) { // L: 1727
				var4 = var3.method6469(); // L: 1728
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3540 : 0; // L: 1729
				return 1; // L: 1730
			} else {
				class330 var7;
				if (var0 == 2619) { // L: 1732
					var7 = var3.method6504(); // L: 1733
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6415().method7368() : ""; // L: 1734
					return 1; // L: 1735
				} else if (var0 == 2620) { // L: 1737
					var4 = var3.method6469(); // L: 1738
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3541 : 0; // L: 1739
					return 1; // L: 1740
				} else if (var0 == 2621) { // L: 1742
					var7 = var3.method6504(); // L: 1743
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6219() : 0; // L: 1744
					return 1; // L: 1745
				} else if (var0 == 2622) { // L: 1747
					var7 = var3.method6504(); // L: 1748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6220() : 0; // L: 1749
					return 1; // L: 1750
				} else if (var0 == 2623) { // L: 1752
					var7 = var3.method6504(); // L: 1753
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6221() : 0; // L: 1754
					return 1; // L: 1755
				} else if (var0 == 2624) { // L: 1757
					var7 = var3.method6504(); // L: 1758
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6211() ? 1 : 0; // L: 1759
					return 1; // L: 1760
				} else if (var0 != 2625) { // L: 1762
					if (var0 == 2626) { // L: 1767
						var7 = var3.method6504(); // L: 1768
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6210().method7582() : ""; // L: 1769
						return 1; // L: 1770
					} else if (var0 == 2627) { // L: 1772
						var7 = var3.method6504(); // L: 1773
						int var5 = var7 != null ? var7.method6215() : 0; // L: 1774
						int var6 = var7 != null ? var7.method6214() : 0; // L: 1775
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1776
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1777
						return 1; // L: 1778
					} else if (var0 == 2628) { // L: 1780
						var7 = var3.method6504(); // L: 1781
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6214() : 0; // L: 1782
						return 1; // L: 1783
					} else if (var0 == 2629) { // L: 1785
						var7 = var3.method6504(); // L: 1786
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6223() : 0; // L: 1787
						return 1; // L: 1788
					} else if (var0 == 2630) { // L: 1790
						var7 = var3.method6504(); // L: 1791
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6204() : 0; // L: 1792
						return 1; // L: 1793
					} else if (var0 == 2631) { // L: 1795
						var7 = var3.method6504(); // L: 1796
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6311() : 0; // L: 1797
						return 1; // L: 1798
					} else if (var0 == 2632) { // L: 1800
						var7 = var3.method6504(); // L: 1801
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6300() : 0; // L: 1802
						return 1; // L: 1803
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1805
							var8 = var3.method6463(); // L: 1806
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method391(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1807
							return 1; // L: 1808
						} else if (var0 == 2634) { // L: 1810
							var8 = var3.method6463(); // L: 1811
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method388((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1812
							return 1; // L: 1813
						} else {
							return 2; // L: 1815
						}
					}
				} else {
					var7 = var3.method6504(); // L: 1763
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6212() ? 1 : 0; // L: 1764
					return 1; // L: 1765
				}
			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ldx;II)V",
		garbageValue = "-1729917411"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var11;
		if (var0.spotAnimation >= Client.cycle) { // L: 4126
			var11 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4127
			var3 = var0.field1234 * 128 + var0.field1223 * 64; // L: 4128
			var4 = var0.field1236 * 128 + var0.field1223 * 64; // L: 4129
			var0.x += (var3 - var0.x) / var11; // L: 4130
			var0.y += (var4 - var0.y) / var11; // L: 4131
			var0.field1256 = 0; // L: 4132
			var0.orientation = var0.field1232; // L: 4133
		} else if (var0.field1239 >= Client.cycle) { // L: 4135
			class197.method3773(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 4137
			if (var0.pathLength == 0) { // L: 4138
				var0.field1256 = 0; // L: 4139
			} else {
				label576: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4142
						var2 = class135.SequenceDefinition_get(var0.sequence); // L: 4143
						if (var0.field1257 > 0 && var2.field2279 == 0) { // L: 4144
							++var0.field1256; // L: 4145
							break label576; // L: 4146
						}

						if (var0.field1257 <= 0 && var2.field2284 == 0) { // L: 4148
							++var0.field1256; // L: 4149
							break label576; // L: 4150
						}
					}

					var11 = var0.x; // L: 4153
					var3 = var0.y; // L: 4154
					var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1223 * 64; // L: 4155
					int var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1223 * 64; // L: 4156
					if (var11 < var4) { // L: 4157
						if (var3 < var5) { // L: 4158
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 4159
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 4160
						}
					} else if (var11 > var4) { // L: 4162
						if (var3 < var5) { // L: 4163
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 4164
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 4165
						}
					} else if (var3 < var5) { // L: 4167
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 4168
						var0.orientation = 0;
					}

					class218 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4169
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4170
						int var7 = var0.orientation - var0.rotation & 2047; // L: 4177
						if (var7 > 1024) { // L: 4178
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 4179
						if (var7 >= -256 && var7 <= 256) { // L: 4180
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 4181
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 4182
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 4183
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 4184
						int var9 = 4; // L: 4185
						boolean var10 = true; // L: 4186
						if (var0 instanceof NPC) { // L: 4187
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 4188
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1251 != 0) { // L: 4189
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 4190
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 4191
								var9 = 8;
							}

							if (var0.field1256 > 0 && var0.pathLength > 1) { // L: 4192
								var9 = 8; // L: 4193
								--var0.field1256; // L: 4194
							}
						} else {
							if (var0.pathLength > 1) { // L: 4198
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 4199
								var9 = 8;
							}

							if (var0.field1256 > 0 && var0.pathLength > 1) { // L: 4200
								var9 = 8; // L: 4201
								--var0.field1256; // L: 4202
							}
						}

						if (var6 == class218.field2377) { // L: 4205
							var9 <<= 1;
						} else if (var6 == class218.field2378) { // L: 4206
							var9 >>= 1;
						}

						if (var9 >= 8) { // L: 4207
							if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4208
								var0.movementSequence = var0.runSequence;
							} else if (var0.walkBackSequence == var0.movementSequence && var0.field1194 != -1) { // L: 4209
								var0.movementSequence = var0.field1194;
							} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1197 != -1) { // L: 4210
								var0.movementSequence = var0.field1197;
							} else if (var0.walkRightSequence == var0.movementSequence && var0.field1198 != -1) { // L: 4211
								var0.movementSequence = var0.field1198;
							}
						} else if (var9 <= 2) { // L: 4213
							if (var0.movementSequence == var0.walkSequence && var0.field1211 != -1) { // L: 4214
								var0.movementSequence = var0.field1211;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1200 != -1) { // L: 4215
								var0.movementSequence = var0.field1200;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1201 != -1) { // L: 4216
								var0.movementSequence = var0.field1201;
							} else if (var0.walkRightSequence == var0.movementSequence && var0.field1202 != -1) { // L: 4217
								var0.movementSequence = var0.field1202;
							}
						}

						if (var4 != var11 || var3 != var5) { // L: 4219
							if (var11 < var4) { // L: 4220
								var0.x += var9; // L: 4221
								if (var0.x > var4) { // L: 4222
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 4224
								var0.x -= var9; // L: 4225
								if (var0.x < var4) { // L: 4226
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 4228
								var0.y += var9; // L: 4229
								if (var0.y > var5) { // L: 4230
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 4232
								var0.y -= var9; // L: 4233
								if (var0.y < var5) { // L: 4234
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 4237
							--var0.pathLength; // L: 4238
							if (var0.field1257 > 0) { // L: 4239
								--var0.field1257;
							}
						}
					} else {
						var0.x = var4; // L: 4171
						var0.y = var5; // L: 4172
						--var0.pathLength; // L: 4173
						if (var0.field1257 > 0) { // L: 4174
							--var0.field1257;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4242
			var0.sequence = -1; // L: 4243
			var0.spotAnimation = 0; // L: 4244
			var0.field1239 = 0; // L: 4245
			var0.method2409(); // L: 4246
			var0.x = var0.pathX[0] * 128 + var0.field1223 * 64; // L: 4247
			var0.y = var0.pathY[0] * 128 + var0.field1223 * 64; // L: 4248
			var0.method2400(); // L: 4249
		}

		if (class136.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4251 4252
			var0.sequence = -1; // L: 4253
			var0.spotAnimation = 0; // L: 4254
			var0.field1239 = 0; // L: 4255
			var0.method2409(); // L: 4256
			var0.x = var0.pathX[0] * 128 + var0.field1223 * 64; // L: 4257
			var0.y = var0.pathY[0] * 128 + var0.field1223 * 64; // L: 4258
			var0.method2400(); // L: 4259
		}

		class389.method7260(var0); // L: 4262
		var0.isWalking = false; // L: 4264
		if (var0.movementSequence != -1) { // L: 4265
			var2 = class135.SequenceDefinition_get(var0.movementSequence); // L: 4266
			if (var2 != null) { // L: 4267
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4268
					++var0.field1225; // L: 4269
					if (var0.movementFrame < var2.frameIds.length && var0.field1225 > var2.frameLengths[var0.movementFrame]) { // L: 4270
						var0.field1225 = 1; // L: 4271
						++var0.movementFrame; // L: 4272
						class405.method7643(var2, var0.movementFrame, var0.x, var0.y); // L: 4273
					}

					if (var0.movementFrame >= var2.frameIds.length) { // L: 4275
						if (var2.frameCount > 0) { // L: 4276
							var0.movementFrame -= var2.frameCount; // L: 4277
							if (var2.field2285) { // L: 4278
								++var0.field1193;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2285 && var0.field1193 >= var2.field2281) { // L: 4279
								var0.field1225 = 0; // L: 4280
								var0.movementFrame = 0; // L: 4281
								var0.field1193 = 0; // L: 4282
							}
						} else {
							var0.field1225 = 0; // L: 4286
							var0.movementFrame = 0; // L: 4287
						}

						class405.method7643(var2, var0.movementFrame, var0.x, var0.y); // L: 4289
					}
				} else if (var2.isCachedModelIdSet()) { // L: 4292
					++var0.movementFrame; // L: 4293
					var3 = var2.method4074(); // L: 4294
					if (var0.movementFrame < var3) { // L: 4295
						class7.method51(var2, var0.movementFrame, var0.x, var0.y); // L: 4296
					} else {
						if (var2.frameCount > 0) { // L: 4299
							var0.movementFrame -= var2.frameCount; // L: 4300
							if (var2.field2285) { // L: 4301
								++var0.field1193;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2285 && var0.field1193 >= var2.field2281) { // L: 4302
								var0.movementFrame = 0; // L: 4303
								var0.field1225 = 0; // L: 4304
								var0.field1193 = 0; // L: 4305
							}
						} else {
							var0.field1225 = 0; // L: 4309
							var0.movementFrame = 0; // L: 4310
						}

						class7.method51(var2, var0.movementFrame, var0.x, var0.y); // L: 4312
					}
				} else {
					var0.movementSequence = -1; // L: 4315
				}
			} else {
				var0.movementSequence = -1; // L: 4317
			}
		}

		IterableNodeHashTableIterator var15 = new IterableNodeHashTableIterator(var0.method2388()); // L: 4319

		for (class536 var12 = (class536)var15.method8761(); var12 != null; var12 = (class536)var15.next()) { // L: 4320
			if (var12.field5225 != -1 && Client.cycle >= var12.field5221) { // L: 4321
				var4 = NPCComposition.SpotAnimationDefinition_get(var12.field5225).sequence; // L: 4324
				if (var4 == -1) { // L: 4325
					var12.remove(); // L: 4326
					--var0.field1233; // L: 4327
				} else {
					var12.field5224 = Math.max(var12.field5224, 0); // L: 4330
					SequenceDefinition var13 = class135.SequenceDefinition_get(var4); // L: 4331
					if (var13.frameIds != null && !var13.isCachedModelIdSet()) { // L: 4332
						++var12.field5223; // L: 4333
						if (var12.field5224 < var13.frameIds.length && var12.field5223 > var13.frameLengths[var12.field5224]) { // L: 4334
							var12.field5223 = 1; // L: 4335
							++var12.field5224; // L: 4336
							class405.method7643(var13, var12.field5224, var0.x, var0.y); // L: 4337
						}

						if (var12.field5224 >= var13.frameIds.length) { // L: 4339
							var12.remove(); // L: 4340
							--var0.field1233; // L: 4341
						}
					} else if (var13.isCachedModelIdSet()) { // L: 4344
						++var12.field5224; // L: 4345
						int var14 = var13.method4074(); // L: 4346
						if (var12.field5224 < var14) { // L: 4347
							class7.method51(var13, var12.field5224, var0.x, var0.y); // L: 4348
						} else {
							var12.remove(); // L: 4351
							--var0.field1233; // L: 4352
						}
					} else {
						var12.remove(); // L: 4356
						--var0.field1233; // L: 4357
					}
				}
			}
		}

		SequenceDefinition var16;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4360
			var16 = class135.SequenceDefinition_get(var0.sequence); // L: 4361
			if (var16.field2279 == 1 && var0.field1257 > 0 && var0.spotAnimation <= Client.cycle && var0.field1239 < Client.cycle) { // L: 4362 4363
				var0.sequenceDelay = 1; // L: 4364
				return; // L: 4420
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4369
			var16 = class135.SequenceDefinition_get(var0.sequence); // L: 4370
			if (var16 == null) { // L: 4371
				var0.sequence = -1; // L: 4416
			} else if (!var16.isCachedModelIdSet() && var16.frameIds != null) { // L: 4372
				++var0.sequenceFrameCycle; // L: 4373
				if (var0.sequenceFrame < var16.frameIds.length && var0.sequenceFrameCycle > var16.frameLengths[var0.sequenceFrame]) { // L: 4374
					var0.sequenceFrameCycle = 1; // L: 4375
					++var0.sequenceFrame; // L: 4376
					class405.method7643(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4377
				}

				if (var0.sequenceFrame >= var16.frameIds.length) { // L: 4379
					var0.sequenceFrame -= var16.frameCount; // L: 4380
					++var0.field1199; // L: 4381
					if (var0.field1199 >= var16.field2281) { // L: 4382
						var0.sequence = -1; // L: 4383
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var16.frameIds.length) { // L: 4385
						class405.method7643(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4389
					} else {
						var0.sequence = -1; // L: 4386
					}
				}

				var0.isWalking = var16.field2277; // L: 4392
			} else if (var16.isCachedModelIdSet()) { // L: 4394
				++var0.sequenceFrame; // L: 4395
				var4 = var16.method4074(); // L: 4396
				if (var0.sequenceFrame < var4) { // L: 4397
					class7.method51(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4398
				} else {
					var0.sequenceFrame -= var16.frameCount; // L: 4401
					++var0.field1199; // L: 4402
					if (var0.field1199 >= var16.field2281) { // L: 4403
						var0.sequence = -1; // L: 4404
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) { // L: 4406
						class7.method51(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4410
					} else {
						var0.sequence = -1; // L: 4407
					}
				}
			} else {
				var0.sequence = -1; // L: 4414
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4418
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "([Lmt;IIIIIIIII)V",
		garbageValue = "1798184407"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10639
		Rasterizer3D.method4417(); // L: 10640

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10641
			Widget var10 = var0[var9]; // L: 10642
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10643 10644
				int var11;
				if (var8 == -1) { // L: 10646
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10647
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10648
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10649
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10650
					var11 = ++Client.rootWidgetCount - 1; // L: 10651
				} else {
					var11 = var8; // L: 10653
				}

				var10.rootIndex = var11; // L: 10654
				var10.cycle = Client.cycle; // L: 10655
				if (!var10.isIf3 || !WorldMapDecorationType.isComponentHidden(var10)) { // L: 10656
					if (var10.contentType > 0) { // L: 10657
						VarbitComposition.method3823(var10);
					}

					int var12 = var10.x + var6; // L: 10658
					int var13 = var7 + var10.y; // L: 10659
					int var14 = var10.transparencyTop; // L: 10660
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10661
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10662
							WorldMapDecoration.field3003 = var0; // L: 10663
							class300.field3351 = var6; // L: 10664
							WorldMapIcon_0.field2956 = var7; // L: 10665
							continue; // L: 10666
						}

						if (Client.isDraggingWidget && Client.field761) { // L: 10668
							var15 = MouseHandler.MouseHandler_x; // L: 10669
							var16 = MouseHandler.MouseHandler_y; // L: 10670
							var15 -= Client.widgetClickX; // L: 10671
							var16 -= Client.widgetClickY; // L: 10672
							if (var15 < Client.field648) { // L: 10673
								var15 = Client.field648;
							}

							if (var15 + var10.width > Client.field648 + Client.clickedWidgetParent.width) { // L: 10674
								var15 = Client.field648 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field703) { // L: 10675
								var16 = Client.field703;
							}

							if (var16 + var10.height > Client.field703 + Client.clickedWidgetParent.height) { // L: 10676
								var16 = Client.field703 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10677
							var13 = var16; // L: 10678
						}

						if (!var10.isScrollBar) { // L: 10680
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10686
						var19 = var12; // L: 10687
						var20 = var13; // L: 10688
						var21 = var12 + var10.width; // L: 10689
						var22 = var13 + var10.height; // L: 10690
						if (var21 < var12) { // L: 10691
							var19 = var21; // L: 10693
							var21 = var12; // L: 10694
						}

						if (var22 < var13) { // L: 10696
							var20 = var22; // L: 10698
							var22 = var13; // L: 10699
						}

						++var21; // L: 10701
						++var22; // L: 10702
						var15 = var19 > var2 ? var19 : var2; // L: 10703
						var16 = var20 > var3 ? var20 : var3; // L: 10704
						var17 = var21 < var4 ? var21 : var4; // L: 10705
						var18 = var22 < var5 ? var22 : var5; // L: 10706
					} else {
						var19 = var12 + var10.width; // L: 10709
						var20 = var13 + var10.height; // L: 10710
						var15 = var12 > var2 ? var12 : var2; // L: 10711
						var16 = var13 > var3 ? var13 : var3; // L: 10712
						var17 = var19 < var4 ? var19 : var4; // L: 10713
						var18 = var20 < var5 ? var20 : var5; // L: 10714
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10716
						if (var10.contentType != 0) { // L: 10717
							if (var10.contentType == 1336) { // L: 10718
								if (class150.clientPreferences.method2546()) { // L: 10719
									var13 += 15; // L: 10720
									class113.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10721
									var13 += 15; // L: 10722
									Runtime var41 = Runtime.getRuntime(); // L: 10723
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10724
									var21 = 16776960; // L: 10725
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10726
										var21 = 16711680;
									}

									class113.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10727
									var13 += 15; // L: 10728
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10732
								Client.viewportX = var12; // L: 10733
								Client.viewportY = var13; // L: 10734
								class27.drawEntities(var12, var13, var10.width, var10.height); // L: 10735
								Client.field718[var10.rootIndex] = true; // L: 10736
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10737
								continue; // L: 10738
							}

							if (var10.contentType == 1338) { // L: 10740
								WorldMapManager.drawMinimap(var10, var12, var13, var11); // L: 10741
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10742
								continue; // L: 10743
							}

							if (var10.contentType == 1339) { // L: 10745
								DevicePcmPlayerProvider.drawCompass(var10, var12, var13, var11); // L: 10746
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10747
								continue; // L: 10748
							}

							if (var10.contentType == 1400) { // L: 10750
								class127.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10751
							}

							if (var10.contentType == 1401) { // L: 10753
								class127.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10754
							}

							if (var10.contentType == 1402) { // L: 10756
								class165.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10757
							}
						}

						if (var10.type == 0) { // L: 10760
							if (!var10.isIf3 && WorldMapDecorationType.isComponentHidden(var10) && var10 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 10761
								continue;
							}

							if (!var10.isIf3) { // L: 10762
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10763
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10764
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10766
							if (var10.children != null) { // L: 10767
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10768
							if (var28 != null) { // L: 10769
								class7.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10770
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10772
							Rasterizer3D.method4417(); // L: 10773
						} else if (var10.type == 11) { // L: 10775
							if (WorldMapDecorationType.isComponentHidden(var10) && var10 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 10776
								continue;
							}

							if (var10.children != null) { // L: 10777
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10778
							Rasterizer3D.method4417(); // L: 10779
						}

						if (Client.isResizable || Client.field736[var11] || Client.field672 > 1) { // L: 10781
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10782 10783
								class153.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10785
								if (var10.type == 3) { // L: 10788
									if (GrandExchangeOfferOwnWorldComparator.runCs1(var10)) { // L: 10790
										var19 = var10.color2; // L: 10791
										if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.field3651 != 0) { // L: 10792
											var19 = var10.field3651;
										}
									} else {
										var19 = var10.color; // L: 10795
										if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.field3650 != 0) { // L: 10796
											var19 = var10.field3650;
										}
									}

									if (var10.fill) { // L: 10798
										switch(var10.fillMode.field5152) { // L: 10799
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10805
											break; // L: 10806
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10808
											break; // L: 10809
										default:
											if (var14 == 0) { // L: 10801
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10802
											}
										}
									} else if (var14 == 0) { // L: 10813
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10814
									}
								} else if (var10.type == 4) { // L: 10818
									Font var40 = var10.getFont(); // L: 10819
									if (var40 == null) { // L: 10820
										if (Widget.field3754) { // L: 10821
											class200.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10825
										if (GrandExchangeOfferOwnWorldComparator.runCs1(var10)) { // L: 10826
											var20 = var10.color2; // L: 10827
											if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.field3651 != 0) { // L: 10828
												var20 = var10.field3651;
											}

											if (var10.field3687.length() > 0) { // L: 10829
												var42 = var10.field3687;
											}
										} else {
											var20 = var10.color; // L: 10832
											if (var10 == WorldMapScaleHandler.mousedOverWidgetIf1 && var10.field3650 != 0) { // L: 10833
												var20 = var10.field3650;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10835
											ItemComposition var43 = class125.ItemComposition_get(var10.itemId); // L: 10836
											var42 = var43.name; // L: 10837
											if (var42 == null) { // L: 10838
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10839
												var42 = MusicPatchPcmStream.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class191.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10841
											var42 = "Please wait..."; // L: 10842
											var20 = var10.color; // L: 10843
										}

										if (!var10.isIf3) { // L: 10845
											var42 = WorldMapRectangle.method5510(var42, var10);
										}

										var40.method7475(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class467.method8428(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10846
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10849
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10850
											var38 = var10.getSprite(GrandExchangeOfferOwnWorldComparator.runCs1(var10), WorldMapLabel.urlRequester); // L: 10851
											if (var38 != null) { // L: 10852
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3754) { // L: 10853
												class200.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10857
												var38 = FaceNormal.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, WorldMapLabel.urlRequester); // L: 10858
											}

											if (var38 == null) { // L: 10859
												if (Widget.field3754) { // L: 10883
													class200.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10860
												var21 = var38.height; // L: 10861
												if (!var10.spriteTiling) { // L: 10862
													var22 = var10.width * 4096 / var20; // L: 10876
													if (var10.spriteAngle != 0) { // L: 10877
														var38.method9637(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10878
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10879
														var38.drawTransBgAt(var12, var13); // L: 10880
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10863
													var22 = (var20 - 1 + var10.width) / var20; // L: 10864
													var23 = (var21 - 1 + var10.height) / var21; // L: 10865

													for (var24 = 0; var24 < var22; ++var24) { // L: 10866
														for (var25 = 0; var25 < var23; ++var25) { // L: 10867
															if (var10.spriteAngle != 0) { // L: 10868
																var38.method9637(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10869
																var38.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25); // L: 10870
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10873
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10887
											boolean var36 = GrandExchangeOfferOwnWorldComparator.runCs1(var10); // L: 10888
											if (var36) { // L: 10890
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10891
											}

											Model var39 = null; // L: 10892
											var22 = 0; // L: 10893
											if (var10.itemId != -1) { // L: 10894
												ItemComposition var44 = class125.ItemComposition_get(var10.itemId); // L: 10895
												if (var44 != null) { // L: 10896
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10897
													var39 = var44.getModel(1); // L: 10898
													if (var39 != null) { // L: 10899
														var39.calculateBoundsCylinder(); // L: 10900
														var22 = var39.height / 2; // L: 10901
													} else {
														class200.invalidateWidget(var10); // L: 10903
													}
												}
											} else if (var10.modelType == 5) { // L: 10906
												if (var10.modelId == 0) { // L: 10907
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = class136.localPlayer.getModel(); // L: 10908
												}
											} else if (var10.modelType == 7) { // L: 10910
												var39 = var10.field3681.getModel((SequenceDefinition)null, -1, class135.SequenceDefinition_get(class136.localPlayer.idleSequence), class136.localPlayer.movementFrame); // L: 10911
											} else {
												NPCComposition var45 = null; // L: 10914
												class194 var33 = null; // L: 10915
												if (var10.modelType == 6) { // L: 10916
													var25 = var10.modelId; // L: 10917
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10918
														NPC var34 = Client.npcs[var25]; // L: 10919
														if (var34 != null) { // L: 10920
															var45 = var34.definition; // L: 10921
															var33 = var34.method2602(); // L: 10922
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10926
												var26 = -1; // L: 10927
												if (var20 != -1) { // L: 10928
													var35 = class135.SequenceDefinition_get(var20); // L: 10929
													var26 = var10.modelFrame; // L: 10930
												}

												var39 = var10.method6448(var35, var26, var36, class136.localPlayer.appearance, var45, var33); // L: 10932
												if (var39 == null && Widget.field3754) { // L: 10933
													class200.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4420(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10935
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10936
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10937
											if (var39 != null) { // L: 10938
												if (!var10.isIf3) { // L: 10939
													var39.method4815(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10941
													if (var10.modelOrthog) { // L: 10942
														var39.method4816(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4815(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10943
													}
												}
											}

											Rasterizer3D.method4419(); // L: 10946
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class403.field4519 && Client.field676 == Client.field675) { // L: 10949 10950
												var19 = 0; // L: 10951
												var20 = 0; // L: 10952
												var29 = class113.fontPlain12; // L: 10953
												String var30 = var10.text; // L: 10954

												String var31;
												for (var30 = WorldMapRectangle.method5510(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10956 10957 10969
													var24 = var30.indexOf("<br>"); // L: 10958
													if (var24 != -1) { // L: 10959
														var31 = var30.substring(0, var24); // L: 10960
														var30 = var30.substring(var24 + 4); // L: 10961
													} else {
														var31 = var30; // L: 10964
														var30 = ""; // L: 10965
													}

													var25 = var29.stringWidth(var31); // L: 10967
													if (var25 > var19) { // L: 10968
														var19 = var25;
													}
												}

												var19 += 6; // L: 10971
												var20 += 7; // L: 10972
												var24 = var12 + var10.width - 5 - var19; // L: 10973
												var25 = var13 + var10.height + 5; // L: 10974
												if (var24 < var12 + 5) { // L: 10975
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10976
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10977
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10978
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10979
												var30 = var10.text; // L: 10980
												var26 = var25 + var29.ascent + 2; // L: 10981

												for (var30 = WorldMapRectangle.method5510(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10982 10983 10994
													int var27 = var30.indexOf("<br>"); // L: 10984
													if (var27 != -1) { // L: 10985
														var31 = var30.substring(0, var27); // L: 10986
														var30 = var30.substring(var27 + 4); // L: 10987
													} else {
														var31 = var30; // L: 10990
														var30 = ""; // L: 10991
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10993
												}
											}

											if (var10.type == 9) { // L: 10998
												if (var10.field3725) { // L: 11003
													var19 = var12; // L: 11004
													var20 = var13 + var10.height; // L: 11005
													var21 = var12 + var10.width; // L: 11006
													var22 = var13; // L: 11007
												} else {
													var19 = var12; // L: 11010
													var20 = var13; // L: 11011
													var21 = var12 + var10.width; // L: 11012
													var22 = var13 + var10.height; // L: 11013
												}

												if (var10.lineWid == 1) { // L: 11015
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11016
												} else {
													class25.method352(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11019
												}
											} else if (var10.type == 12) { // L: 11023
												class330 var37 = var10.method6504(); // L: 11024
												class325 var32 = var10.method6469(); // L: 11025
												if (var37 != null && var32 != null && var37.method6216()) { // L: 11026
													var29 = var10.getFont(); // L: 11027
													if (var29 != null) { // L: 11028
														Client.field726.method9715(var12, var13, var10.width, var10.height, var37.method6316(), var37.method6218(), var37.method6214(), var37.method6215(), var37.method6288()); // L: 11029
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11030
														if (!var37.method6211() && var37.method6264().method7314()) { // L: 11031
															Client.field726.method9722(var32.field3541, var22, var32.field3539, var32.field3540); // L: 11032
															Client.field726.method9713(var37.method6415(), var29); // L: 11033
														} else {
															Client.field726.method9722(var10.color, var22, var32.field3539, var32.field3540); // L: 11036
															Client.field726.method9713(var37.method6264(), var29); // L: 11037
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11039
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 11044
}
