import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
public class class508 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static AbstractArchive field5052;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ar")
	Object[][] field5050;
	@ObfuscatedName("am")
	int[][] field5051;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1236052801
	)
	public int field5048;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class508() {
		this.field5048 = -1; // L: 14
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1416782085"
	)
	void method8995(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method8997(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "-444511694"
	)
	public Object[] method8996(int var1) {
		return this.field5050 == null ? null : this.field5050[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1836238392"
	)
	void method8997(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field5050 == null) {
				this.field5050 = new Object[var3][];
				this.field5051 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				this.field5050[var4] = class10.method103(var1, var6); // L: 61
				this.field5051[var4] = var6;
			}
		} else if (var2 == 4) {
			this.field5048 = var1.method9331();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	void method9008() {
	} // L: 72

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "972688880"
	)
	public static int method9009(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class126.field1494; // L: 19
		if (var7 <= var44) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = var0[var10] * (1.0F / var7); // L: 25
			}

			while (Math.abs(var9[var1]) < var44) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44; // L: 36
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0]; // L: 37
				var10 = var42 && var43 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class453 var11 = new class453(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var41 = new float[var1 + 1]; // L: 55
				int var14 = method9009(var12, var1 - 1, var2, false, var4, false, var41); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = class328.method6114(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var44 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var20 == var14) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var41[var20]; // L: 81
						}

						var17 = class328.method6114(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var44) { // L: 88
							if (var20 != var14 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							int var22 = var10++; // L: 96
							float var24 = var16; // L: 98
							float var25 = var19; // L: 99
							float var26 = class328.method6114(var11.field4757, var11.field4758, var16); // L: 101
							float var23;
							if (Math.abs(var26) < class126.field1494) { // L: 102
								var23 = var16; // L: 103
							} else {
								float var27 = class328.method6114(var11.field4757, var11.field4758, var19); // L: 106
								if (Math.abs(var27) < class126.field1494) { // L: 107
									var23 = var19; // L: 108
								} else {
									float var28 = 0.0F; // L: 111
									float var29 = 0.0F; // L: 112
									float var30 = 0.0F; // L: 113
									float var35 = 0.0F; // L: 118
									boolean var36 = true; // L: 119
									boolean var37 = false; // L: 120

									do {
										var37 = false; // L: 122
										if (var36) { // L: 123
											var28 = var24; // L: 124
											var35 = var26; // L: 125
											var29 = var25 - var24; // L: 126
											var30 = var29; // L: 127
											var36 = false; // L: 128
										}

										if (Math.abs(var35) < Math.abs(var27)) { // L: 130
											var24 = var25; // L: 131
											var25 = var28; // L: 132
											var28 = var24; // L: 133
											var26 = var27; // L: 134
											var27 = var35; // L: 135
											var35 = var26; // L: 136
										}

										float var38 = class126.field1496 * Math.abs(var25) + 0.0F; // L: 138
										float var39 = 0.5F * (var28 - var25); // L: 139
										boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F; // L: 140
										if (var40) { // L: 141
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) { // L: 142
												float var34 = var27 / var26; // L: 147
												float var31;
												float var32;
												if (var24 == var28) { // L: 148
													var31 = 2.0F * var39 * var34; // L: 149
													var32 = 1.0F - var34; // L: 150
												} else {
													var32 = var26 / var35; // L: 153
													float var33 = var27 / var35; // L: 154
													var31 = ((var32 - var33) * 2.0F * var39 * var32 - (var25 - var24) * (var33 - 1.0F)) * var34; // L: 155
													var32 = (var34 - 1.0F) * (var33 - 1.0F) * (var32 - 1.0F); // L: 156
												}

												if ((double)var31 > 0.0D) { // L: 158
													var32 = -var32;
												} else {
													var31 = -var31; // L: 159
												}

												var34 = var30; // L: 160
												var30 = var29; // L: 161
												if (2.0F * var31 < var32 * 3.0F * var39 - Math.abs(var32 * var38) && var31 < Math.abs(var32 * 0.5F * var34)) { // L: 162
													var29 = var31 / var32; // L: 163
												} else {
													var29 = var39; // L: 166
													var30 = var39; // L: 167
												}
											} else {
												var29 = var39; // L: 143
												var30 = var39; // L: 144
											}

											var24 = var25; // L: 170
											var26 = var27; // L: 171
											if (Math.abs(var29) > var38) { // L: 172
												var25 += var29;
											} else if ((double)var39 > 0.0D) { // L: 173
												var25 += var38;
											} else {
												var25 -= var38; // L: 174
											}

											var27 = class328.method6114(var11.field4757, var11.field4758, var25); // L: 175
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) { // L: 176
												var36 = true; // L: 177
												var37 = true; // L: 178
											} else {
												var37 = true; // L: 181
											}
										}
									} while(var37);

									var23 = var25; // L: 185
								}
							}

							var6[var22] = var23; // L: 187
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) { // L: 188
								var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F; // L: 189
								--var10; // L: 190
							}
						}
					}

					return var10; // L: 196
				}
			}
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1993931981"
	)
	static void method9006() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12130
			int var1 = var0.group; // L: 12131
			if (Login.loadInterface(var1)) { // L: 12132
				boolean var2 = true; // L: 12133
				Widget[] var3 = ArchiveLoader.Widget_interfaceComponents[var1]; // L: 12134

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12135
					if (var3[var4] != null) { // L: 12136
						var2 = var3[var4].isIf3; // L: 12137
						break;
					}
				}

				if (!var2) { // L: 12141
					var4 = (int)var0.key; // L: 12142
					Widget var5 = VarbitComposition.getWidget(var4); // L: 12143
					if (var5 != null) { // L: 12144
						class200.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12148
}