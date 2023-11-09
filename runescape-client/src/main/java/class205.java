import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class205 implements class29 {
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	Widget field2339;
	@ObfuscatedName("an")
	boolean field2334;
	@ObfuscatedName("aw")
	boolean field2336;

	public class205() {
		this.field2339 = null; // L: 14
		this.field2334 = false; // L: 15
		this.field2336 = false; // L: 16
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1311192309"
	)
	public boolean vmethod4207(int var1) {
		if (this.field2339 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2339.method6367(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method413(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2336 = true; // L: 61
						break;
					case 82:
						this.field2334 = true; // L: 69
						break;
					default:
						if (this.method4198(var1)) { // L: 64
							class144.invalidateWidget(this.field2339); // L: 65
						}
					}
				}

				return var2.method411(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1312051339"
	)
	public boolean vmethod4217(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2336 = false; // L: 82
			return false; // L: 83
		case 82:
			this.field2334 = false; // L: 79
			return false; // L: 80
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2018590760"
	)
	public boolean vmethod4234(char var1) {
		if (this.field2339 == null) { // L: 89
			return false;
		} else if (!MouseHandler.method714(var1)) { // L: 90
			return false;
		} else {
			class314 var2 = this.field2339.method6392(); // L: 91
			if (var2 != null && var2.method6143()) { // L: 92
				class27 var3 = this.field2339.method6367(); // L: 93
				if (var3 == null) { // L: 94
					return false;
				} else {
					if (var3.method441(var1) && var2.method6104(var1)) { // L: 95 96
						class144.invalidateWidget(this.field2339); // L: 97
					}

					return var3.method412(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-16"
	)
	public boolean vmethod4224(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "1563132907"
	)
	public void method4179(Widget var1) {
		this.method4181(); // L: 19
		if (var1 != null) { // L: 20
			this.field2339 = var1; // L: 21
			class312 var2 = var1.method6395(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3502.method6087(true); // L: 24
				if (var2.field3500 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2256(var1); // L: 27
					var3.setArgs(var2.field3500); // L: 28
					GrandExchangeOfferAgeComparator.method6838().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)Lmq;",
		garbageValue = "32767"
	)
	public Widget method4202() {
		return this.field2339; // L: 36
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	public void method4181() {
		if (this.field2339 != null) { // L: 40
			class312 var1 = this.field2339.method6395(); // L: 41
			Widget var2 = this.field2339; // L: 42
			this.field2339 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3502.method6087(false); // L: 45
				if (var1.field3500 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2256(var2); // L: 48
					var3.setArgs(var1.field3500); // L: 49
					GrandExchangeOfferAgeComparator.method6838().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1039701598"
	)
	boolean method4198(int var1) {
		if (this.field2339 == null) { // L: 108
			return false;
		} else {
			class314 var2 = this.field2339.method6392(); // L: 109
			if (var2 != null && var2.method6143()) { // L: 110
				switch(var1) { // L: 111
				case 13:
					this.method4181(); // L: 215
					return true; // L: 216
				case 48:
					if (this.field2334) { // L: 176
						var2.method6352(); // L: 177
					}

					return true; // L: 179
				case 65:
					if (this.field2334) { // L: 158
						var2.method6273(class143.method3243()); // L: 159
					}

					return true; // L: 161
				case 66:
					if (this.field2334) { // L: 171
						var2.method6128(class143.method3243()); // L: 172
					}

					return true; // L: 174
				case 67:
					if (this.field2334) { // L: 129
						var2.method6130(class143.method3243());
					}

					return true;
				case 84:
					if (var2.method6149() == 0) { // L: 181
						var2.method6104(10); // L: 182
					} else if (this.field2336 && var2.method6153()) { // L: 185
						var2.method6104(10); // L: 186
					} else {
						class312 var3 = this.field2339.method6395(); // L: 189
						ScriptEvent var4 = new ScriptEvent(); // L: 190
						var4.method2256(this.field2339); // L: 191
						var4.setArgs(var3.field3504); // L: 192
						GrandExchangeOfferAgeComparator.method6838().addFirst(var4); // L: 193
						this.method4181(); // L: 194
					}

					return true; // L: 197
				case 85:
					if (this.field2334) { // L: 134
						var2.method6290(); // L: 135
					} else {
						var2.method6207(); // L: 138
					}

					return true; // L: 140
				case 96:
					if (this.field2334) { // L: 163
						var2.method6351(this.field2336); // L: 164
					} else {
						var2.method6116(this.field2336); // L: 167
					}

					return true; // L: 169
				case 97:
					if (this.field2334) {
						var2.method6119(this.field2336);
					} else {
						var2.method6117(this.field2336);
					}

					return true; // L: 127
				case 98:
					if (this.field2334) { // L: 113
						var2.method6274(); // L: 114
					} else {
						var2.method6120(this.field2336);
					}

					return true; // L: 119
				case 99:
					if (this.field2334) { // L: 150
						var2.method6278(); // L: 151
					} else {
						var2.method6121(this.field2336); // L: 154
					}

					return true; // L: 156
				case 101:
					if (this.field2334) { // L: 218
						var2.method6342(); // L: 219
					} else {
						var2.method6167(); // L: 222
					}

					return true; // L: 224
				case 102:
					if (this.field2334) { // L: 207
						var2.method6114(this.field2336); // L: 208
					} else {
						var2.method6108(this.field2336); // L: 211
					}

					return true; // L: 213
				case 103:
					if (this.field2334) { // L: 142
						var2.method6222(this.field2336); // L: 143
					} else {
						var2.method6217(this.field2336); // L: 146
					}

					return true; // L: 148
				case 104:
					if (this.field2334) { // L: 226
						var2.method6124(this.field2336); // L: 227
					} else {
						var2.method6122(this.field2336); // L: 230
					}

					return true; // L: 232
				case 105:
					if (this.field2334) { // L: 199
						var2.method6110(this.field2336); // L: 200
					} else {
						var2.method6107(this.field2336); // L: 203
					}

					return true; // L: 205
				default:
					return false; // L: 234
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ldu;",
		garbageValue = "-739086795"
	)
	static ClientPreferences method4204() {
		AccessFile var0 = null; // L: 117
		ClientPreferences var1 = new ClientPreferences(); // L: 118

		try {
			var0 = Rasterizer3D.getPreferencesFile("", Client.field490.name, false); // L: 120
			byte[] var2 = new byte[(int)var0.length()]; // L: 121

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 122 123 126
				var4 = var0.read(var2, var3, var2.length - var3); // L: 124
				if (var4 == -1) {
					throw new IOException(); // L: 125
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 128
		} catch (Exception var6) { // L: 130
		}

		try {
			if (var0 != null) { // L: 132
				var0.close(); // L: 133
			}
		} catch (Exception var5) { // L: 136
		}

		return var1; // L: 137
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2047687466"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1911
		Login.Login_response2 = var1; // L: 1912
		Login.Login_response3 = var2; // L: 1913
	} // L: 1914
}
