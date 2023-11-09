import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class210 implements class29 {
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("mouseWheel")
	static class175 mouseWheel;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	Widget field2320;
	@ObfuscatedName("aj")
	boolean field2319;
	@ObfuscatedName("ac")
	boolean field2322;

	public class210() {
		this.field2320 = null; // L: 14
		this.field2319 = false; // L: 15
		this.field2322 = false; // L: 16
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "82"
	)
	public boolean vmethod4291(int var1) {
		if (this.field2320 == null) { // L: 55
			return false;
		} else {
			class27 var2 = this.field2320.method6472(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method420(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2322 = true; // L: 61
						break;
					case 82:
						this.field2319 = true; // L: 64
						break;
					default:
						if (this.method4233(var1)) { // L: 67
							class303.invalidateWidget(this.field2320); // L: 68
						}
					}
				}

				return var2.method418(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1280453224"
	)
	public boolean vmethod4254(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2322 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2319 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-81"
	)
	public boolean vmethod4255(char var1) {
		if (this.field2320 == null) { // L: 89
			return false;
		} else if (!class218.method4387(var1)) { // L: 90
			return false;
		} else {
			class329 var2 = this.field2320.method6470(); // L: 91
			if (var2 != null && var2.method6218()) { // L: 92
				class27 var3 = this.field2320.method6472(); // L: 93
				if (var3 == null) { // L: 94
					return false;
				} else {
					if (var3.method421(var1) && var2.method6179(var1)) { // L: 95 96
						class303.invalidateWidget(this.field2320); // L: 97
					}

					return var3.method419(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-996268450"
	)
	public boolean vmethod4276(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)V",
		garbageValue = "40060505"
	)
	public void method4225(Widget var1) {
		this.method4226(); // L: 19
		if (var1 != null) { // L: 20
			this.field2320 = var1; // L: 21
			class327 var2 = var1.method6504(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3557.method6386(true); // L: 24
				if (var2.field3553 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2309(var1); // L: 27
					var3.setArgs(var2.field3553); // L: 28
					FaceNormal.method4805().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lme;",
		garbageValue = "103"
	)
	public Widget method4246() {
		return this.field2320; // L: 36
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method4226() {
		if (this.field2320 != null) { // L: 40
			class327 var1 = this.field2320.method6504(); // L: 41
			Widget var2 = this.field2320; // L: 42
			this.field2320 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3557.method6386(false); // L: 45
				if (var1.field3553 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2309(var2); // L: 48
					var3.setArgs(var1.field3553); // L: 49
					FaceNormal.method4805().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "13254199"
	)
	boolean method4233(int var1) {
		if (this.field2320 == null) { // L: 108
			return false;
		} else {
			class329 var2 = this.field2320.method6470(); // L: 109
			if (var2 != null && var2.method6218()) { // L: 110
				switch(var1) { // L: 111
				case 13:
					this.method4226(); // L: 226
					return true; // L: 227
				case 48:
					if (this.field2319) { // L: 168
						var2.method6342(); // L: 169
					}

					return true; // L: 171
				case 65:
					if (this.field2319) { // L: 155
						var2.method6204(SoundCache.method861()); // L: 156
					}

					return true; // L: 158
				case 66:
					if (this.field2319) { // L: 229
						var2.method6209(SoundCache.method861()); // L: 230
					}

					return true; // L: 232
				case 67:
					if (this.field2319) { // L: 189
						var2.method6260(SoundCache.method861()); // L: 190
					}

					return true; // L: 192
				case 84:
					if (var2.method6385() == 0) { // L: 113
						var2.method6179(10); // L: 114
					} else if (this.field2322 && var2.method6228()) { // L: 117
						var2.method6179(10); // L: 118
					} else {
						class327 var3 = this.field2320.method6504(); // L: 121
						ScriptEvent var4 = new ScriptEvent(); // L: 122
						var4.method2309(this.field2320); // L: 123
						var4.setArgs(var3.field3555); // L: 124
						FaceNormal.method4805().addFirst(var4); // L: 125
						this.method4226(); // L: 126
					}

					return true; // L: 129
				case 85:
					if (this.field2319) { // L: 131
						var2.method6365(); // L: 132
					} else {
						var2.method6412(); // L: 135
					}

					return true; // L: 137
				case 96:
					if (this.field2319) { // L: 160
						var2.method6358(this.field2322); // L: 161
					} else {
						var2.method6191(this.field2322); // L: 164
					}

					return true; // L: 166
				case 97:
					if (this.field2319) { // L: 194
						var2.method6194(this.field2322); // L: 195
					} else {
						var2.method6185(this.field2322); // L: 198
					}

					return true; // L: 200
				case 98:
					if (this.field2319) { // L: 218
						var2.method6206(); // L: 219
					} else {
						var2.method6195(this.field2322); // L: 222
					}

					return true; // L: 224
				case 99:
					if (this.field2319) { // L: 173
						var2.method6371(); // L: 174
					} else {
						var2.method6216(this.field2322); // L: 177
					}

					return true; // L: 179
				case 101:
					if (this.field2319) { // L: 139
						var2.method6183(); // L: 140
					} else {
						var2.method6181(); // L: 143
					}

					return true; // L: 145
				case 102:
					if (this.field2319) { // L: 181
						var2.method6189(this.field2322); // L: 182
					} else {
						var2.method6205(this.field2322); // L: 185
					}

					return true; // L: 187
				case 103:
					if (this.field2319) { // L: 202
						var2.method6420(this.field2322); // L: 203
					} else {
						var2.method6188(this.field2322); // L: 206
					}

					return true; // L: 208
				case 104:
					if (this.field2319) { // L: 210
						var2.method6199(this.field2322); // L: 211
					} else {
						var2.method6244(this.field2322); // L: 214
					}

					return true; // L: 216
				case 105:
					if (this.field2319) { // L: 147
						var2.method6200(this.field2322); // L: 148
					} else {
						var2.method6198(this.field2322); // L: 151
					}

					return true; // L: 153
				default:
					return false; // L: 234
				}
			} else {
				return false;
			}
		}
	}
}
