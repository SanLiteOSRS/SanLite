import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class210 implements class29 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	Widget field2346;
	@ObfuscatedName("ae")
	boolean field2345;
	@ObfuscatedName("ao")
	boolean field2347;

	public class210() {
		this.field2346 = null; // L: 14
		this.field2345 = false; // L: 15
		this.field2347 = false; // L: 16
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1089015731"
	)
	public boolean vmethod4117(int var1) {
		if (this.field2346 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2346.method6401(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method420(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2347 = true; // L: 61
						break;
					case 82:
						this.field2345 = true; // L: 64
						break; // L: 65
					default:
						if (this.method4081(var1)) { // L: 67
							class218.invalidateWidget(this.field2346); // L: 68
						}
					}
				}

				return var2.method385(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1292750960"
	)
	public boolean vmethod4139(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2347 = false; // L: 82
			return false; // L: 83
		case 82:
			this.field2345 = false; // L: 79
			return false; // L: 80
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-352714805"
	)
	public boolean vmethod4106(char var1) {
		if (this.field2346 == null) { // L: 89
			return false;
		} else {
			boolean var2;
			if ((var1 < ' ' || var1 >= 127) && (var1 <= 127 || var1 >= 160) && (var1 <= 160 || var1 > 255)) { // L: 92
				label90: {
					if (var1 != 0) { // L: 96
						char[] var3 = class384.cp1252AsciiExtension; // L: 98

						for (int var4 = 0; var4 < var3.length; ++var4) { // L: 99
							char var5 = var3[var4]; // L: 100
							if (var5 == var1) { // L: 102
								var2 = true; // L: 103
								break label90;
							}
						}
					}

					var2 = false; // L: 110
				}
			} else {
				var2 = true; // L: 93
			}

			if (!var2) {
				return false; // L: 112
			} else {
				class329 var7 = this.field2346.method6532(); // L: 113
				if (var7 != null && var7.method6162()) { // L: 114
					class27 var6 = this.field2346.method6401(); // L: 115
					if (var6 == null) { // L: 116
						return false;
					} else {
						if (var6.method388(var1) && var7.method6199(var1)) { // L: 117 118
							class218.invalidateWidget(this.field2346); // L: 119
						}

						return var6.method391(var1); // L: 122
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1559971994"
	)
	public boolean vmethod4132(boolean var1) {
		return false; // L: 126
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "753644002"
	)
	public void method4093(Widget var1) {
		this.method4092(); // L: 19
		if (var1 != null) { // L: 20
			this.field2346 = var1; // L: 21
			class327 var2 = var1.method6418(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3563.method6106(true); // L: 24
				if (var2.field3564 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2283(var1); // L: 27
					var3.setArgs(var2.field3564); // L: 28
					class30.method446().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lmi;",
		garbageValue = "-869248693"
	)
	public Widget method4075() {
		return this.field2346; // L: 36
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method4092() {
		if (this.field2346 != null) { // L: 40
			class327 var1 = this.field2346.method6418(); // L: 41
			Widget var2 = this.field2346; // L: 42
			this.field2346 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3563.method6106(false); // L: 45
				if (var1.field3564 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2283(var2); // L: 48
					var3.setArgs(var1.field3564); // L: 49
					class30.method446().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-53"
	)
	boolean method4081(int var1) {
		if (this.field2346 == null) { // L: 130
			return false;
		} else {
			class329 var2 = this.field2346.method6532(); // L: 131
			if (var2 != null && var2.method6162()) { // L: 132
				switch(var1) { // L: 133
				case 13:
					this.method4092(); // L: 229
					return true; // L: 230
				case 48:
					if (this.field2345) { // L: 174
						var2.method6370(); // L: 175
					}

					return true; // L: 177
				case 65:
					if (this.field2345) { // L: 208
						var2.method6108(GrandExchangeOfferTotalQuantityComparator.method6834()); // L: 209
					}

					return true; // L: 211
				case 66:
					if (this.field2345) { // L: 153
						var2.method6147(GrandExchangeOfferTotalQuantityComparator.method6834()); // L: 154
					}

					return true; // L: 156
				case 67:
					if (this.field2345) { // L: 179
						var2.method6149(GrandExchangeOfferTotalQuantityComparator.method6834()); // L: 180
					}

					return true; // L: 182
				case 84:
					if (var2.method6168() == 0) { // L: 135
						var2.method6199(10); // L: 136
					} else if (this.field2347 && var2.method6243()) { // L: 139
						var2.method6199(10); // L: 140
					} else {
						class327 var3 = this.field2346.method6418(); // L: 143
						ScriptEvent var4 = new ScriptEvent(); // L: 144
						var4.method2283(this.field2346); // L: 145
						var4.setArgs(var3.field3560); // L: 146
						class30.method446().addFirst(var4); // L: 147
						this.method4092(); // L: 148
					}

					return true; // L: 151
				case 85:
					if (this.field2345) { // L: 192
						var2.method6126(); // L: 193
					} else {
						var2.method6124(); // L: 196
					}

					return true; // L: 198
				case 96:
					if (this.field2345) { // L: 221
						var2.method6137(this.field2347); // L: 222
					} else {
						var2.method6304(this.field2347); // L: 225
					}

					return true; // L: 227
				case 97:
					if (this.field2345) { // L: 184
						var2.method6138(this.field2347); // L: 185
					} else {
						var2.method6136(this.field2347); // L: 188
					}

					return true; // L: 190
				case 98:
					if (this.field2345) { // L: 166
						var2.method6308(); // L: 167
					} else {
						var2.method6139(this.field2347); // L: 170
					}

					return true; // L: 172
				case 99:
					if (this.field2345) { // L: 232
						var2.method6151(); // L: 233
					} else {
						var2.method6140(this.field2347); // L: 236
					}

					return true; // L: 238
				case 101:
					if (this.field2345) { // L: 158
						var2.method6156(); // L: 159
					} else {
						var2.method6125(); // L: 162
					}

					return true; // L: 164
				case 102:
					if (this.field2345) { // L: 200
						var2.method6133(this.field2347); // L: 201
					} else {
						var2.method6131(this.field2347); // L: 204
					}

					return true; // L: 206
				case 103:
					if (this.field2345) { // L: 213
						var2.method6134(this.field2347); // L: 214
					} else {
						var2.method6132(this.field2347); // L: 217
					}

					return true; // L: 219
				case 104:
					if (this.field2345) { // L: 248
						var2.method6280(this.field2347); // L: 249
					} else {
						var2.method6141(this.field2347); // L: 252
					}

					return true; // L: 254
				case 105:
					if (this.field2345) { // L: 240
						var2.method6278(this.field2347); // L: 241
					} else {
						var2.method6127(this.field2347); // L: 244
					}

					return true; // L: 246
				default:
					return false; // L: 256
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIILui;Lme;I)V",
		garbageValue = "-1872465528"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12570
			int var6 = Client.camAngleY & 2047; // L: 12571
			int var7 = var3 * var3 + var2 * var2; // L: 12572
			if (var7 <= 6400) { // L: 12573
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12574
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12575
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12576
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12577
				if (var7 > 2500) {
					var4.method9518(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12578
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12579
				}

			}
		}
	} // L: 12580
}
