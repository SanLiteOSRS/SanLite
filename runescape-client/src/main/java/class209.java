import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class209 implements class29 {
	@ObfuscatedName("aw")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	Widget field2310;
	@ObfuscatedName("an")
	boolean field2312;
	@ObfuscatedName("ar")
	boolean field2311;

	public class209() {
		this.field2310 = null; // L: 14
		this.field2312 = false; // L: 15
		this.field2311 = false; // L: 16
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1472929918"
	)
	public boolean vmethod4080(int var1) {
		if (this.field2310 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2310.method6457(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method376(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2311 = true; // L: 61
						break;
					case 82:
						this.field2312 = true; // L: 64
						break; // L: 65
					default:
						if (this.method4057(var1)) { // L: 67
							HorizontalAlignment.invalidateWidget(this.field2310); // L: 68
						}
					}
				}

				return var2.method374(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-2"
	)
	public boolean vmethod4114(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2311 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2312 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1010520021"
	)
	public boolean vmethod4081(char var1) {
		if (this.field2310 == null) { // L: 89
			return false;
		} else if (!class156.method3268(var1)) { // L: 90
			return false;
		} else {
			class327 var2 = this.field2310.method6544(); // L: 91
			if (var2 != null && var2.method6209()) { // L: 92
				class27 var3 = this.field2310.method6457(); // L: 93
				if (var3 == null) { // L: 94
					return false;
				} else {
					if (var3.method397(var1) && var2.method6170(var1)) { // L: 95 96
						HorizontalAlignment.invalidateWidget(this.field2310); // L: 97
					}

					return var3.method375(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-910540057"
	)
	public boolean vmethod4083(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "-342098106"
	)
	public void method4058(Widget var1) {
		this.method4052(); // L: 19
		if (var1 != null) { // L: 20
			this.field2310 = var1; // L: 21
			class325 var2 = var1.method6490(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3538.method6190(true); // L: 24
				if (var2.field3532 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2243(var1); // L: 27
					var3.setArgs(var2.field3532); // L: 28
					class101.method2634().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "-1456336409"
	)
	public Widget method4054() {
		return this.field2310; // L: 36
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1815432070"
	)
	public void method4052() {
		if (this.field2310 != null) { // L: 40
			class325 var1 = this.field2310.method6490(); // L: 41
			Widget var2 = this.field2310; // L: 42
			this.field2310 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3538.method6190(false); // L: 45
				if (var1.field3532 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2243(var2); // L: 48
					var3.setArgs(var1.field3532); // L: 49
					class101.method2634().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1780029809"
	)
	boolean method4057(int var1) {
		if (this.field2310 == null) { // L: 108
			return false;
		} else {
			class327 var2 = this.field2310.method6544(); // L: 109
			if (var2 != null && var2.method6209()) { // L: 110
				Clipboard var5;
				switch(var1) { // L: 111
				case 13:
					this.method4052(); // L: 214
					return true; // L: 215
				case 48:
					if (this.field2312) { // L: 113
						var2.method6176(); // L: 114
					}

					return true; // L: 116
				case 65:
					if (this.field2312) { // L: 178
						var5 = class439.client.method518(); // L: 182
						var2.method6195(var5); // L: 184
					}

					return true; // L: 186
				case 66:
					if (this.field2312) { // L: 168
						var5 = class439.client.method518(); // L: 172
						var2.method6194(var5); // L: 174
					}

					return true; // L: 176
				case 67:
					if (this.field2312) { // L: 126
						var5 = class439.client.method518(); // L: 130
						var2.method6305(var5); // L: 132
					}

					return true; // L: 134
				case 84:
					if (var2.method6215() == 0) { // L: 188
						var2.method6170(10); // L: 189
					} else if (this.field2311 && var2.method6168()) { // L: 192
						var2.method6170(10); // L: 193
					} else {
						class325 var3 = this.field2310.method6490(); // L: 196
						ScriptEvent var4 = new ScriptEvent(); // L: 197
						var4.method2243(this.field2310); // L: 198
						var4.setArgs(var3.field3537); // L: 199
						class101.method2634().addFirst(var4); // L: 200
						this.method4052(); // L: 201
					}

					return true; // L: 204
				case 85:
					if (this.field2312) { // L: 152
						var2.method6173(); // L: 153
					} else {
						var2.method6171(); // L: 156
					}

					return true; // L: 158
				case 96:
					if (this.field2312) { // L: 160
						var2.method6350(this.field2311); // L: 161
					} else {
						var2.method6182(this.field2311); // L: 164
					}

					return true; // L: 166
				case 97:
					if (this.field2312) { // L: 136
						var2.method6185(this.field2311); // L: 137
					} else {
						var2.method6183(this.field2311); // L: 140
					}

					return true; // L: 142
				case 98:
					if (this.field2312) { // L: 241
						var2.method6280(); // L: 242
					} else {
						var2.method6186(this.field2311); // L: 245
					}

					return true; // L: 247
				case 99:
					if (this.field2312) { // L: 206
						var2.method6231(); // L: 207
					} else {
						var2.method6187(this.field2311); // L: 210
					}

					return true; // L: 212
				case 101:
					if (this.field2312) { // L: 233
						var2.method6248(); // L: 234
					} else {
						var2.method6336(); // L: 237
					}

					return true; // L: 239
				case 102:
					if (this.field2312) { // L: 217
						var2.method6281(this.field2311); // L: 218
					} else {
						var2.method6345(this.field2311); // L: 221
					}

					return true; // L: 223
				case 103:
					if (this.field2312) { // L: 144
						var2.method6257(this.field2311); // L: 145
					} else {
						var2.method6179(this.field2311); // L: 148
					}

					return true; // L: 150
				case 104:
					if (this.field2312) { // L: 118
						var2.method6404(this.field2311); // L: 119
					} else {
						var2.method6188(this.field2311); // L: 122
					}

					return true; // L: 124
				case 105:
					if (this.field2312) { // L: 225
						var2.method6204(this.field2311); // L: 226
					} else {
						var2.method6189(this.field2311); // L: 229
					}

					return true; // L: 231
				default:
					return false; // L: 249
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)I",
		garbageValue = "116"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12457
		return var1 != null ? var1.integer : var0.flags; // L: 12458 12459
	}
}
