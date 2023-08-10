import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class211 implements class29 {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field2304;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	Widget field2305;
	@ObfuscatedName("ay")
	boolean field2303;
	@ObfuscatedName("ar")
	boolean field2308;

	public class211() {
		this.field2305 = null; // L: 14
		this.field2303 = false; // L: 15
		this.field2308 = false; // L: 16
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1364202239"
	)
	public boolean vmethod4143(int var1) {
		if (this.field2305 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2305.method6463(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method396(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2308 = true; // L: 69
						break;
					case 82:
						this.field2303 = true; // L: 61
						break;
					default:
						if (this.method4124(var1)) { // L: 64
							class200.invalidateWidget(this.field2305); // L: 65
						}
					}
				}

				return var2.method393(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1960624058"
	)
	public boolean vmethod4148(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2308 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2303 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "932068520"
	)
	public boolean vmethod4145(char var1) {
		if (this.field2305 == null) { // L: 89
			return false;
		} else {
			boolean var2;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) { // L: 92
				var2 = true; // L: 93
			} else {
				label93: {
					if (var1 != 0) { // L: 96
						char[] var3 = class385.cp1252AsciiExtension; // L: 98

						for (int var4 = 0; var4 < var3.length; ++var4) { // L: 99
							char var5 = var3[var4]; // L: 100
							if (var5 == var1) { // L: 102
								var2 = true; // L: 103
								break label93;
							}
						}
					}

					var2 = false; // L: 110
				}
			}

			if (!var2) { // L: 112
				return false;
			} else {
				class330 var7 = this.field2305.method6504(); // L: 113
				if (var7 != null && var7.method6216()) { // L: 114
					class27 var6 = this.field2305.method6463(); // L: 115
					if (var6 == null) { // L: 116
						return false;
					} else {
						if (var6.method404(var1) && var7.method6422(var1)) { // L: 117 118
							class200.invalidateWidget(this.field2305); // L: 119
						}

						return var6.method394(var1); // L: 122
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-93"
	)
	public boolean vmethod4147(boolean var1) {
		return false; // L: 126
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)V",
		garbageValue = "-84"
	)
	public void method4126(Widget var1) {
		this.method4119(); // L: 19
		if (var1 != null) { // L: 20
			this.field2305 = var1; // L: 21
			class328 var2 = var1.method6471(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3552.method6160(true); // L: 24
				if (var2.field3557 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2290(var1); // L: 27
					var3.setArgs(var2.field3557); // L: 28
					ClientPacket.method5722().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Lmt;",
		garbageValue = "-52"
	)
	public Widget method4118() {
		return this.field2305; // L: 36
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2127531849"
	)
	public void method4119() {
		if (this.field2305 != null) { // L: 40
			class328 var1 = this.field2305.method6471(); // L: 41
			Widget var2 = this.field2305; // L: 42
			this.field2305 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3552.method6160(false); // L: 45
				if (var1.field3557 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2290(var2); // L: 48
					var3.setArgs(var1.field3557); // L: 49
					ClientPacket.method5722().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "7161"
	)
	boolean method4124(int var1) {
		if (this.field2305 == null) { // L: 130
			return false;
		} else {
			class330 var2 = this.field2305.method6504(); // L: 131
			if (var2 != null && var2.method6216()) { // L: 132
				switch(var1) { // L: 133
				case 13:
					this.method4119(); // L: 235
					return true; // L: 236
				case 48:
					if (this.field2303) { // L: 222
						var2.method6234(); // L: 223
					}

					return true; // L: 225
				case 65:
					if (this.field2303) { // L: 238
						var2.method6202(ClanChannelMember.method3153()); // L: 239
					}

					return true; // L: 241
				case 66:
					if (this.field2303) { // L: 159
						var2.method6201(ClanChannelMember.method3153()); // L: 160
					}

					return true; // L: 162
				case 67:
					if (this.field2303) { // L: 243
						var2.method6203(ClanChannelMember.method3153()); // L: 244
					}

					return true; // L: 246
				case 84:
					if (var2.method6204() == 0) { // L: 196
						var2.method6422(10); // L: 197
					} else if (this.field2308 && var2.method6226()) { // L: 200
						var2.method6422(10); // L: 201
					} else {
						class328 var3 = this.field2305.method6471(); // L: 204
						ScriptEvent var4 = new ScriptEvent(); // L: 205
						var4.method2290(this.field2305); // L: 206
						var4.setArgs(var3.field3554); // L: 207
						ClientPacket.method5722().addFirst(var4); // L: 208
						this.method4119(); // L: 209
					}

					return true; // L: 212
				case 85:
					if (this.field2303) { // L: 143
						var2.method6180(); // L: 144
					} else {
						var2.method6235(); // L: 147
					}

					return true; // L: 149
				case 96:
					if (this.field2303) { // L: 151
						var2.method6191(this.field2308); // L: 152
					} else {
						var2.method6189(this.field2308); // L: 155
					}

					return true; // L: 157
				case 97:
					if (this.field2303) { // L: 248
						var2.method6192(this.field2308); // L: 249
					} else {
						var2.method6190(this.field2308); // L: 252
					}

					return true; // L: 254
				case 98:
					if (this.field2303) { // L: 227
						var2.method6230(); // L: 228
					} else {
						var2.method6358(this.field2308); // L: 231
					}

					return true; // L: 233
				case 99:
					if (this.field2303) { // L: 188
						var2.method6185(); // L: 189
					} else {
						var2.method6194(this.field2308); // L: 192
					}

					return true; // L: 194
				case 101:
					if (this.field2303) { // L: 214
						var2.method6181(); // L: 215
					} else {
						var2.method6179(); // L: 218
					}

					return true; // L: 220
				case 102:
					if (this.field2303) { // L: 135
						var2.method6187(this.field2308); // L: 136
					} else {
						var2.method6321(this.field2308); // L: 139
					}

					return true; // L: 141
				case 103:
					if (this.field2303) { // L: 180
						var2.method6317(this.field2308); // L: 181
					} else {
						var2.method6186(this.field2308); // L: 184
					}

					return true; // L: 186
				case 104:
					if (this.field2303) { // L: 172
						var2.method6353(this.field2308); // L: 173
					} else {
						var2.method6195(this.field2308); // L: 176
					}

					return true; // L: 178
				case 105:
					if (this.field2303) { // L: 164
						var2.method6198(this.field2308); // L: 165
					} else {
						var2.method6158(this.field2308); // L: 168
					}

					return true; // L: 170
				default:
					return false; // L: 256
				}
			} else {
				return false;
			}
		}
	}
}
