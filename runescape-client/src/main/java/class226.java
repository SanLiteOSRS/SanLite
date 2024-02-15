import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class226 implements class29 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	Widget field2414;
	@ObfuscatedName("aw")
	boolean field2412;
	@ObfuscatedName("al")
	boolean field2411;

	public class226() {
		this.field2414 = null;
		this.field2412 = false;
		this.field2411 = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2108130536"
	)
	public boolean vmethod4425(int var1) {
		if (this.field2414 == null) { // L: 60
			return false;
		} else {
			class27 var2 = this.field2414.method6825(); // L: 61
			if (var2 == null) { // L: 62
				return false;
			} else {
				if (var2.method387(var1)) { // L: 63
					switch(var1) { // L: 64
					case 81:
						this.field2411 = true; // L: 66
						break;
					case 82:
						this.field2412 = true; // L: 74
						break;
					default:
						if (this.method4398(var1)) { // L: 69
							UserComparator5.invalidateWidget(this.field2414); // L: 70
						}
					}
				}

				return var2.method363(var1); // L: 78
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2132067941"
	)
	public boolean vmethod4442(int var1) {
		switch(var1) { // L: 82
		case 81:
			this.field2411 = false; // L: 87
			return false; // L: 88
		case 82:
			this.field2412 = false; // L: 84
			return false; // L: 85
		default:
			return false; // L: 90
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-71"
	)
	public boolean vmethod4427(char var1) {
		if (this.field2414 == null) { // L: 94
			return false;
		} else if (!class344.method6465(var1)) { // L: 95
			return false;
		} else {
			class347 var2 = this.field2414.method6806(); // L: 96
			if (var2 != null && var2.method6562()) { // L: 97
				class27 var3 = this.field2414.method6825(); // L: 98
				if (var3 == null) {
					return false; // L: 99
				} else {
					if (var3.method380(var1) && var2.method6524(var1)) { // L: 100 101
						UserComparator5.invalidateWidget(this.field2414); // L: 102
					}

					return var3.method358(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "289932078"
	)
	public boolean vmethod4467(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)V",
		garbageValue = "-104"
	)
	public void method4402(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2414) {
				this.method4394();
				this.field2414 = var1;
			}

			class345 var2 = var1.method6841();
			if (var2 != null) {
				if (!var2.field3656.method6557() && var2.field3659 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2355(var1);
					var3.setArgs(var2.field3659);
					DirectByteArrayCopier.method6959().addFirst(var3);
				}

				var2.field3656.method6722(true);
			}
		} else {
			this.method4394();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lng;",
		garbageValue = "10"
	)
	public Widget method4393() {
		return this.field2414;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
	)
	public void method4394() {
		if (this.field2414 != null) { // L: 45
			class345 var1 = this.field2414.method6841(); // L: 46
			Widget var2 = this.field2414; // L: 47
			this.field2414 = null; // L: 48
			if (var1 != null) { // L: 49
				if (var1.field3656.method6557() && var1.field3659 != null) { // L: 50
					ScriptEvent var3 = new ScriptEvent(); // L: 51
					var3.method2355(var2); // L: 52
					var3.setArgs(var1.field3659); // L: 53
					DirectByteArrayCopier.method6959().addFirst(var3); // L: 54
				}

				var1.field3656.method6722(false); // L: 56
			}
		}
	} // L: 57

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "91"
	)
	boolean method4398(int var1) {
		if (this.field2414 == null) { // L: 113
			return false;
		} else {
			class347 var2 = this.field2414.method6806(); // L: 114
			if (var2 != null && var2.method6562()) { // L: 115
				Clipboard var5;
				switch(var1) { // L: 116
				case 13:
					this.method4394(); // L: 199
					return true; // L: 200
				case 48:
					if (this.field2412) { // L: 136
						var2.method6514(); // L: 137
					}

					return true; // L: 139
				case 65:
					if (this.field2412) { // L: 244
						var5 = class193.client.method460(); // L: 248
						var2.method6747(var5); // L: 250
					}

					return true; // L: 252
				case 66:
					if (this.field2412) { // L: 118
						var5 = class193.client.method460(); // L: 122
						var2.method6547(var5); // L: 124
					}

					return true; // L: 126
				case 67:
					if (this.field2412) { // L: 210
						var5 = class193.client.method460(); // L: 214
						var2.method6599(var5); // L: 216
					}

					return true; // L: 218
				case 84:
					if (var2.method6568() == 0) { // L: 157
						var2.method6524(10); // L: 158
					} else if (this.field2411 && var2.method6572()) { // L: 161
						var2.method6524(10); // L: 162
					} else {
						class345 var3 = this.field2414.method6841(); // L: 165
						ScriptEvent var4 = new ScriptEvent(); // L: 166
						var4.method2355(this.field2414); // L: 167
						var4.setArgs(var3.field3660); // L: 168
						DirectByteArrayCopier.method6959().addFirst(var4); // L: 169
						this.method4394(); // L: 170
					}

					return true; // L: 173
				case 85:
					if (this.field2412) { // L: 141
						var2.method6783(); // L: 142
					} else {
						var2.method6525(); // L: 145
					}

					return true; // L: 147
				case 96:
					if (this.field2412) { // L: 175
						var2.method6537(this.field2411); // L: 176
					} else {
						var2.method6535(this.field2411); // L: 179
					}

					return true; // L: 181
				case 97:
					if (this.field2412) { // L: 236
						var2.method6538(this.field2411); // L: 237
					} else {
						var2.method6737(this.field2411);
					}

					return true;
				case 98:
					if (this.field2412) { // L: 128
						var2.method6550(); // L: 129
					} else {
						var2.method6539(this.field2411); // L: 132
					}

					return true; // L: 134
				case 99:
					if (this.field2412) { // L: 202
						var2.method6653(); // L: 203
					} else {
						var2.method6710(this.field2411); // L: 206
					}

					return true; // L: 208
				case 101:
					if (this.field2412) { // L: 149
						var2.method6528(); // L: 150
					} else {
						var2.method6526(); // L: 153
					}

					return true; // L: 155
				case 102:
					if (this.field2412) { // L: 183
						var2.method6533(this.field2411); // L: 184
					} else {
						var2.method6531(this.field2411); // L: 187
					}

					return true; // L: 189
				case 103:
					if (this.field2412) { // L: 220
						var2.method6766(this.field2411); // L: 221
					} else {
						var2.method6532(this.field2411); // L: 224
					}

					return true; // L: 226
				case 104:
					if (this.field2412) { // L: 191
						var2.method6543(this.field2411); // L: 192
					} else {
						var2.method6505(this.field2411); // L: 195
					}

					return true; // L: 197
				case 105:
					if (this.field2412) { // L: 228
						var2.method6544(this.field2411); // L: 229
					} else {
						var2.method6542(this.field2411); // L: 232
					}

					return true; // L: 234
				default:
					return false; // L: 254
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "556823062"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CLpe;B)I",
		garbageValue = "82"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-13"
	)
	static int method4395(String var0) {
		if (var0.equals("centre")) { // L: 239
			return 1; // L: 240
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 242 243 245
		}
	}
}
