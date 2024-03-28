import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class226 implements class29 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	Widget field2418;
	@ObfuscatedName("ah")
	boolean field2416;
	@ObfuscatedName("af")
	boolean field2417;

	public class226() {
		this.field2418 = null; // L: 14
		this.field2416 = false; // L: 15
		this.field2417 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "743662152"
	)
	public boolean vmethod4317(int var1) {
		if (this.field2418 == null) { // L: 60
			return false;
		} else {
			class27 var2 = this.field2418.method6682(); // L: 61
			if (var2 == null) { // L: 62
				return false;
			} else {
				if (var2.method368(var1)) { // L: 63
					switch(var1) { // L: 64
					case 81:
						this.field2417 = true; // L: 71
						break; // L: 72
					case 82:
						this.field2416 = true; // L: 74
						break;
					default:
						if (this.method4291(var1)) { // L: 66
							WorldMapData_0.invalidateWidget(this.field2418); // L: 67
						}
					}
				}

				return var2.method366(var1); // L: 78
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-99"
	)
	public boolean vmethod4312(int var1) {
		switch(var1) { // L: 82
		case 81:
			this.field2417 = false; // L: 84
			return false; // L: 85
		case 82:
			this.field2416 = false; // L: 87
			return false; // L: 88
		default:
			return false; // L: 90
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1370736452"
	)
	public boolean vmethod4324(char var1) {
		if (this.field2418 == null) { // L: 94
			return false;
		} else if (!HealthBar.method2576(var1)) { // L: 95
			return false;
		} else {
			class347 var2 = this.field2418.method6667(); // L: 96
			if (var2 != null && var2.method6513()) { // L: 97
				class27 var3 = this.field2418.method6682(); // L: 98
				if (var3 == null) {
					return false; // L: 99
				} else {
					if (var3.method365(var1) && var2.method6404(var1)) { // L: 100 101
						WorldMapData_0.invalidateWidget(this.field2418); // L: 102
					}

					return var3.method367(var1); // L: 105
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-10"
	)
	public boolean vmethod4339(boolean var1) {
		return false; // L: 109
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-697987739"
	)
	public void method4278(Widget var1) {
		if (var1 != null) { // L: 19
			if (var1 != this.field2418) { // L: 20
				this.method4282(); // L: 21
				this.field2418 = var1; // L: 22
			}

			class345 var2 = var1.method6683();
			if (var2 != null) {
				if (!var2.field3674.method6459() && var2.field3675 != null) { // L: 26
					ScriptEvent var3 = new ScriptEvent();
					var3.method2305(var1); // L: 28
					var3.setArgs(var2.field3675); // L: 29
					class131.method3048().addFirst(var3); // L: 30
				}

				var2.field3674.method6486(true); // L: 32
			}
		} else {
			this.method4282(); // L: 36
		}

	} // L: 38

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lnt;",
		garbageValue = "-5"
	)
	public Widget method4279() {
		return this.field2418; // L: 41
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1023376258"
	)
	public void method4282() {
		if (this.field2418 != null) { // L: 45
			class345 var1 = this.field2418.method6683(); // L: 46
			Widget var2 = this.field2418; // L: 47
			this.field2418 = null; // L: 48
			if (var1 != null) { // L: 49
				if (var1.field3674.method6459() && var1.field3675 != null) { // L: 50
					ScriptEvent var3 = new ScriptEvent(); // L: 51
					var3.method2305(var2); // L: 52
					var3.setArgs(var1.field3675); // L: 53
					class131.method3048().addFirst(var3); // L: 54
				}

				var1.field3674.method6486(false); // L: 56
			}
		}
	} // L: 57

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1455473962"
	)
	boolean method4291(int var1) {
		if (this.field2418 == null) { // L: 113
			return false;
		} else {
			class347 var2 = this.field2418.method6667(); // L: 114
			if (var2 != null && var2.method6513()) { // L: 115
				Clipboard var5;
				switch(var1) { // L: 116
				case 13:
					this.method4282(); // L: 233
					return true; // L: 234
				case 48:
					if (this.field2416) { // L: 220
						var2.method6387(); // L: 221
					}

					return true; // L: 223
				case 65:
					if (this.field2416) { // L: 178
						var5 = UrlRequest.client.method464(); // L: 182
						var2.method6420(var5); // L: 184
					}

					return true; // L: 186
				case 66:
					if (this.field2416) { // L: 236
						var5 = UrlRequest.client.method464(); // L: 240
						var2.method6405(var5); // L: 242
					}

					return true; // L: 244
				case 67:
					if (this.field2416) { // L: 134
						var5 = UrlRequest.client.method464(); // L: 138
						var2.method6518(var5); // L: 140
					}

					return true; // L: 142
				case 84:
					if (var2.method6574() == 0) { // L: 144
						var2.method6404(10); // L: 145
					} else if (this.field2417 && var2.method6430()) { // L: 148
						var2.method6404(10); // L: 149
					} else {
						class345 var3 = this.field2418.method6683(); // L: 152
						ScriptEvent var4 = new ScriptEvent(); // L: 153
						var4.method2305(this.field2418); // L: 154
						var4.setArgs(var3.field3677); // L: 155
						class131.method3048().addFirst(var4); // L: 156
						this.method4282(); // L: 157
					}

					return true; // L: 160
				case 85:
					if (this.field2416) { // L: 225
						var2.method6384(); // L: 226
					} else {
						var2.method6382(); // L: 229
					}

					return true; // L: 231
				case 96:
					if (this.field2416) { // L: 204
						var2.method6558(this.field2417); // L: 205
					} else {
						var2.method6393(this.field2417); // L: 208
					}

					return true; // L: 210
				case 97:
					if (this.field2416) { // L: 196
						var2.method6396(this.field2417); // L: 197
					} else {
						var2.method6487(this.field2417); // L: 200
					}

					return true; // L: 202
				case 98:
					if (this.field2416) { // L: 162
						var2.method6591(); // L: 163
					} else {
						var2.method6415(this.field2417); // L: 166
					}

					return true; // L: 168
				case 99:
					if (this.field2416) { // L: 188
						var2.method6401(); // L: 189
					} else {
						var2.method6398(this.field2417); // L: 192
					}

					return true; // L: 194
				case 101:
					if (this.field2416) { // L: 170
						var2.method6385(); // L: 171
					} else {
						var2.method6383(); // L: 174
					}

					return true; // L: 176
				case 102:
					if (this.field2416) { // L: 118
						var2.method6391(this.field2417); // L: 119
					} else {
						var2.method6389(this.field2417); // L: 122
					}

					return true; // L: 124
				case 103:
					if (this.field2416) { // L: 126
						var2.method6502(this.field2417); // L: 127
					} else {
						var2.method6419(this.field2417); // L: 130
					}

					return true; // L: 132
				case 104:
					if (this.field2416) { // L: 246
						var2.method6444(this.field2417); // L: 247
					} else {
						var2.method6399(this.field2417); // L: 250
					}

					return true; // L: 252
				case 105:
					if (this.field2416) { // L: 212
						var2.method6402(this.field2417); // L: 213
					} else {
						var2.method6400(this.field2417); // L: 216
					}

					return true; // L: 218
				default:
					return false; // L: 254
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "41"
	)
	public static final boolean method4307(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 16
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lot;",
		garbageValue = "0"
	)
	public static GameBuild method4306(int var0) {
		GameBuild[] var1 = FaceNormal.method4885(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}
}
